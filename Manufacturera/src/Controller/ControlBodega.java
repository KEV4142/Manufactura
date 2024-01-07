/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Bodega;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author kev41
 */
public class ControlBodega {
    public Bodega seekBodega(int bodega)
    {
        Bodega Bod = null;
        try
        {
            String sql = "select * from Bodega where BodegaID=" + bodega;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                Bod=new Bodega();
                Bod.setBodegaID(rs.getInt("BodegaID"));
                Bod.setNombre(rs.getString("Nombre"));
            }
            else {
                JOptionPane.showMessageDialog(null, "Registro no existe");
            }
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return Bod;
    }

public void insBodega(Bodega bodega)//boton insertar
    {
        try
        {
            String sql = "select * from Bodega where BodegaID = -1";
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.moveToInsertRow();
            rs.updateInt("BodegaID", bodega.getBodegaID());
            rs.updateString("Nombre", bodega.getNombre());
            rs.insertRow();            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

public void updBodega(Bodega bodega)//boton modificar
    {
        try
        {
            String sql = "select * from Bodega where BodegaID=" + bodega.getBodegaID();
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.next();
            rs.updateString("nombre", bodega.getNombre());
            rs.updateRow();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

public void delBodega(int bodegaID)//boton eliminar
    {
        try
        {
            String sql = "select * from Bodega where BodegaID=" + bodegaID;
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.next();
            rs.deleteRow();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }
public int autoNumerico(){
        int auto=-1;
        try{
            ResultSet save=new Conexion().getResultSet("select * from Bodega order by BodegaID");
            boolean last = save.last();
            if(last) {
                auto=save.getInt("BodegaID")+1;
            }
            else {
                auto=1;
            }
        }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return auto;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Articulo;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author kev41
 */
public class ControlArticulo {
    public Articulo seekArticulo(int articuloID)
    {
        Articulo Art = null;
        try
        {
            String sql = "select * from Articulo where ArticuloID=" + articuloID;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                Art = new Articulo();
                Art.setArticuloID(rs.getInt("ArticuloID"));
                Art.setNombre(rs.getString("Nombre"));
                Art.setTipo(rs.getString("Tipo"));
                Art.setISV(rs.getString("ISV"));
                Art.setCategoriaID(rs.getInt("CategoriaID"));
            }
            else {
                JOptionPane.showMessageDialog(null, "Registro no existe");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return Art;
    }

public void insArticulo(Articulo Art)//boton insertar
    {
        try
        {
            String sql = "select * from Articulo where ArticuloID = -1";
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.moveToInsertRow();
            rs.updateInt("ArticuloID", Art.getArticuloID());
            rs.updateString("nombre", Art.getNombre());
            rs.updateString("Tipo", Art.getTipo());
            rs.updateString("ISV", Art.getISV());
            rs.updateString("CategoriaID", String.valueOf(Art.getCategoriaID()));           
            rs.insertRow();            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

public void updArticulo(Articulo dep)//boton modificar
    {
        try
        {
            String sql = "select * from Articulo where ArticuloID=" + dep.getArticuloID();
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.next();
            rs.updateString("nombre", dep.getNombre());
            rs.updateString("Tipo", dep.getTipo());
            rs.updateString("ISV", dep.getISV());
            rs.updateString("CategoriaID", String.valueOf(dep.getCategoriaID()));
            rs.updateRow();            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

public void delArticulo(int ArticuloID)//boton eliminar
    {
        try
        {
            String sql = "select * from Articulo where ArticuloID=" + ArticuloID;
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
            ResultSet save=new Conexion().getResultSet("select * from Articulo order by ArticuloID");
            boolean last = save.last();
            if(last) {
                auto=save.getInt("ArticuloID")+1;
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

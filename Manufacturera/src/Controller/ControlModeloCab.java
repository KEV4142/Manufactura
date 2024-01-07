/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.ModeloCab;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author kev41
 */
public class ControlModeloCab {
    public ModeloCab seekModeloCab(int ModeloID)
    {
        ModeloCab MCab = null;
        try
        {
            String sql = "select * from ModeloCab where ModeloID=" + ModeloID;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                MCab = new ModeloCab();
                MCab.setModeloID(rs.getInt("ModeloID"));
                MCab.setNombre(rs.getString("Nombre"));
                MCab.setArticuloID(rs.getInt("ArticuloID"));
                MCab.setCantidad(rs.getInt("Cantidad"));
                MCab.setEstado(rs.getString("Estado"));
            }
            else {
                JOptionPane.showMessageDialog(null, "Registro no existe");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return MCab;
    }

public boolean insModeloCab(ModeloCab Pro)//boton insertar
    {
    boolean a=false;
        try
        {
            String sql = "select * from ModeloCab where ModeloID = -1";
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.moveToInsertRow();
            rs.updateInt("ModeloID", Pro.getModeloID());
            rs.updateString("Nombre", Pro.getNombre());
            rs.updateInt("ArticuloID", Pro.getArticuloID());
            rs.updateInt("Cantidad", Pro.getCantidad());
            rs.updateString("Estado", Pro.getEstado());
            rs.insertRow();
            a=true;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error insModelo",JOptionPane.ERROR_MESSAGE);
            a=false;
        }
        return a;
    }

public boolean updModeloCab(ModeloCab dep)//boton modificar
    {
    boolean a=false;
        try
        {
            String sql = "select * from ModeloCab where ModeloID=" + dep.getModeloID();
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.next();
            rs.updateString("Nombre", dep.getNombre());
            rs.updateInt("ArticuloID", dep.getArticuloID());
            rs.updateInt("Cantidad", dep.getCantidad());
            rs.updateString("Estado", dep.getEstado());
            rs.updateRow();
            a=true;
        }
        catch(Exception e)
        {
            a=false;
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error udpModelo",JOptionPane.ERROR_MESSAGE);
        }
        return a;
    }

public void delModeloCab(int ModeloID)//boton eliminar
    {
        try
        {
            String sql = "select * from ModeloCab where ModeloID=" + ModeloID;
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
            ResultSet save=new Conexion().getResultSet("select * from ModeloCab order by ModeloID");
            boolean last = save.last();
            if(last) {
                auto=save.getInt("ModeloID")+1;
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

public DefaultTableModel getModeloTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        try
        {
            modelo.addColumn("No. de Modelo");
            modelo.addColumn("Nombre del Modelo");
            modelo.addColumn("Nombre del Articulo");
            modelo.addColumn("Estado del Modelo");
            String sql = "select p.ModeloID as 'No. de Modelo',p.Nombre as 'Nombre del Modelo',c.Nombre as 'Nombre del Articulo',case when p.Estado='A' then 'ACTIVO' when p.Estado='I' then 'INACTIVO'end as 'Estado del Modelo' from PedidoCab as p inner join Articulo as c on p.ArticuloID=c.ArticuloID";
            ResultSet rs = new Conexion().getResultSet(sql);
            while(rs.next())
            {
                Vector v = new Vector();
                v.addElement(rs.getString(1));
                v.addElement(rs.getString(2));
                v.addElement(rs.getString(3));
                v.addElement(rs.getString(4));
                modelo.addRow(v);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return modelo;
    }
}

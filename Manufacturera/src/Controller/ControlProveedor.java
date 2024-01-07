/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Proveedor;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author kev41
 */
public class ControlProveedor {
    public Proveedor seekProveedor(int proveedorID)
    {
        Proveedor Pro = null;
        try
        {
            String sql = "select * from Proveedor where ProveedorID=" + proveedorID;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                Pro = new Proveedor();
                Pro.setProveedorID(rs.getInt("ProveedorID"));
                Pro.setNombre(rs.getString("Nombre"));
                Pro.setContacto(rs.getString("Contacto"));
                Pro.setTelefono(rs.getString("Telefono"));
                Pro.setLimite(rs.getFloat("Limite"));
                Pro.setSaldo(rs.getFloat("Saldo"));
            }
            else {
                JOptionPane.showMessageDialog(null, "Registro no existe");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return Pro;
    }

public void insProveedor(Proveedor Pro)//boton insertar
    {
        try
        {
            String sql = "select * from Proveedor where ProveedorID = -1";
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.moveToInsertRow();
            rs.updateInt("ProveedorID", Pro.getProveedorID());
            rs.updateString("nombre", Pro.getNombre());
            rs.updateString("Contacto", Pro.getContacto());
            rs.updateString("Telefono", Pro.getTelefono());
            rs.updateString("Limite", String.valueOf(Pro.getLimite()));
            rs.updateString("Saldo", String.valueOf(Pro.getSaldo()));            
            rs.insertRow();            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

public void updProveedor(Proveedor dep)//boton modificar
    {
        try
        {
            String sql = "select * from Proveedor where ProveedorID=" + dep.getProveedorID();
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.next();
            rs.updateString("nombre", dep.getNombre());
            rs.updateString("Contacto", dep.getContacto());
            rs.updateString("Telefono", dep.getTelefono());
            rs.updateString("Limite", String.valueOf(dep.getLimite()));
            rs.updateString("Saldo", String.valueOf(dep.getSaldo()));
            rs.updateRow();            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

public void delProveedor(int ProveedorID)//boton eliminar
    {
        try
        {
            String sql = "select * from Proveedor where ProveedorID=" + ProveedorID;
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
            ResultSet save=new Conexion().getResultSet("select * from Proveedor order by ProveedorID");
            boolean last = save.last();
            if(last) {
                auto=save.getInt("ProveedorID")+1;
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

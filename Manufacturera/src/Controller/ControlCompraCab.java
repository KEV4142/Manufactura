/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author kev41
 */
public class ControlCompraCab {

    public ControlCompraCab() {
    }
    
    public CompraCab seekCompraCab(int CompraID)
    {
        CompraCab PCab = null;
        try
        {
            String sql = "select * from CompraCab where CompraID=" + CompraID;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                PCab = new CompraCab();
                PCab.setCompraID(rs.getInt("CompraID"));
                PCab.setFecha(rs.getString("Fecha"));
                PCab.setProveedorID(rs.getInt("ProveedorID"));
                PCab.setEstado(rs.getString("Estado"));
            }
            else {
                JOptionPane.showMessageDialog(null, "Registro no existe");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return PCab;
    }
    public CompraCab seekCompraCab1(int CompraID)
    {
        CompraCab PCab = null;
        try
        {
            String sql = "select * from CompraCab where CompraID=" + CompraID;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                PCab = new CompraCab();
                PCab.setCompraID(rs.getInt("CompraID"));
                PCab.setFecha(rs.getString("Fecha"));
                PCab.setProveedorID(rs.getInt("ProveedorID"));
                PCab.setEstado(rs.getString("Estado"));
            }
            else {
                PCab=new CompraCab();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return PCab;
    }

public boolean insCompraCab(CompraCab Pro)//boton insertar
    {
    boolean a=false;
        try
        {
            String sql = "select * from CompraCab where CompraID = -1";
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.moveToInsertRow();
            rs.updateInt("CompraID", Pro.getCompraID());
            rs.updateString("Fecha", Pro.getFecha());
            rs.updateInt("ProveedorID", Pro.getProveedorID());
            rs.updateString("Estado", Pro.getEstado());
            rs.insertRow();
            a=true;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
            a=false;
        }
        return a;
    }

public void updCompraCab(CompraCab dep)//boton modificar
    {
        try
        {
            String sql = "select * from CompraCab where CompraID=" + dep.getCompraID();
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.next();
            rs.updateString("Fecha", dep.getFecha());
            rs.updateInt("ProveedorID", dep.getProveedorID());
            rs.updateString("Estado", dep.getEstado());
            rs.updateRow();            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

public void delCompraCab(int CompraID)//boton eliminar
    {
        try
        {
            String sql = "select * from CompraCab where CompraID=" + CompraID;
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
            ResultSet save=new Conexion().getResultSet("select * from CompraCab order by CompraID");
            boolean last = save.last();
            if(last) {
                auto=save.getInt("CompraID")+1;
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
public String getFechaSistema(){
        String fecha=null;
        try{
            ResultSet save=new Conexion().getResultSet("select CURDATE() AS DAA;");
            save.next();
            fecha=save.getString("DAA");
        }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return fecha;
    }

public DefaultTableModel getModeloTabla(int ProveedorID) {
        DefaultTableModel modelo = new DefaultTableModel();
        try
        {
            modelo.addColumn("Nombre del Proveedor");
            modelo.addColumn("No. de Compra");
            modelo.addColumn("Fecha de Compra");
            modelo.addColumn("Estado");
            String sql = "";
            sql = "select a.Nombre as 'Nombre', b.CompraID as 'No. de Compra',date_format(b.Fecha,'%W,%D %M %Y') as 'Fecha de la Reqisicion',case when b.Estado='P' then 'PENDIENTE' when b.Estado='S' then 'SURTIDO' end as 'Estado' from CompraCab as b inner join Proveedor as a on b.ProveedorID=a.ProveedorID where b.ProveedorID="+ProveedorID;
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

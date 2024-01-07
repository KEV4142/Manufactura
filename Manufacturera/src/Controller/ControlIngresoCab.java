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
public class ControlIngresoCab {

    public ControlIngresoCab() {
    }
    
    public IngresoCab seekIngresoCab(int IngresoID)
    {
        IngresoCab PCab = null;
        try
        {
            String sql = "select * from IngresoCab where IngresoID=" + IngresoID;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                PCab = new IngresoCab();
                PCab.setIngresoID(rs.getInt("IngresoID"));
                PCab.setFecha(rs.getString("Fecha"));
                PCab.setBodegaID(rs.getInt("BodegaID"));
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

public boolean insIngresoCab(IngresoCab Pro)//boton insertar
    {
    boolean a=false;
        try
        {
            String sql = "select * from IngresoCab where IngresoID = -1";
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.moveToInsertRow();
            rs.updateInt("IngresoID", Pro.getIngresoID());
            rs.updateString("Fecha", Pro.getFecha());
            rs.updateInt("BodegaID", Pro.getBodegaID());
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

public void updIngresoCab(IngresoCab dep)//boton modificar
    {
        try
        {
            String sql = "select * from IngresoCab where IngresoID=" + dep.getIngresoID();
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.next();
            rs.updateString("Fecha", dep.getFecha());
            rs.updateInt("BodegaID", dep.getBodegaID());
            rs.updateString("Estado", dep.getEstado());
            rs.updateRow();            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

public void delIngresoCab(int IngresoID)//boton eliminar
    {
        try
        {
            String sql = "select * from IngresoCab where IngresoID=" + IngresoID;
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
            ResultSet save=new Conexion().getResultSet("select * from IngresoCab order by IngresoID");
            boolean last = save.last();
            if(last) {
                auto=save.getInt("IngresoID")+1;
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

//public DefaultTableModel getModeloTabla(int ProveedorID) {
//        DefaultTableModel modelo = new DefaultTableModel();
//        try
//        {
//            modelo.addColumn("Nombre del Proveedor");
//            modelo.addColumn("No. de Compra");
//            modelo.addColumn("Fecha de Compra");
//            modelo.addColumn("Estado");
//            String sql = "";
//            sql = "select a.Nombre as 'Nombre', b.CompraID as 'No. de Compra',date_format(b.Fecha,'%W,%D %M %Y') as 'Fecha de la Reqisicion',case when b.Estado='P' then 'PENDIENTE' when b.Estado='S' then 'SURTIDO' end as 'Estado' from CompraCab as b inner join Proveedor as a on b.ProveedorID=a.ProveedorID where b.ProveedorID="+ProveedorID;
//            ResultSet rs = new Conexion().getResultSet(sql);
//            while(rs.next())
//            {
//                Vector v = new Vector();
//                v.addElement(rs.getString(1));
//                v.addElement(rs.getString(2));
//                v.addElement(rs.getString(3));
//                v.addElement(rs.getString(4));
//                modelo.addRow(v);
//            }
//        }
//        catch(Exception e)
//        {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//        return modelo;
//}

}

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
public class ControlFacturaCab {

    public ControlFacturaCab() {
    }
    
    public FacturaCab seekCompraCab(int FacturaID)
    {
        FacturaCab PCab = null;
        try
        {
            String sql = "select * from FacturaCab where FacturaID=" + FacturaID;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                PCab = new FacturaCab();
                PCab.setFacturaID(rs.getInt("FacturaID"));
                PCab.setClienteID(rs.getInt("ClienteID"));
                PCab.setFecha(rs.getString("Fecha"));
                PCab.setTipo(rs.getString("Tipo"));
                PCab.setEstado(rs.getString("Estado"));
                PCab.setBodegaID(rs.getInt("BodegaID"));
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
//    public FacturaCab seekCompraCab1(int CompraID)
//    {
//        CompraCab PCab = null;
//        try
//        {
//            String sql = "select * from CompraCab where CompraID=" + CompraID;
//            ResultSet rs = new Conexion().getResultSet(sql);
//            if(rs.next()){
//                PCab = new CompraCab();
//                PCab.setCompraID(rs.getInt("CompraID"));
//                PCab.setFecha(rs.getString("Fecha"));
//                PCab.setProveedorID(rs.getInt("ProveedorID"));
//                PCab.setEstado(rs.getString("Estado"));
//            }
//            else {
//                PCab=new CompraCab();
//            }
//        }
//        catch(Exception e)
//        {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//        return PCab;
//    }

public boolean insFacturaCab(FacturaCab Pro)//boton insertar
    {
    boolean a=false;
        try
        {
            String sql = "select * from FacturaCab where FacturaID = -1";
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.moveToInsertRow();
            rs.updateInt("FacturaID", Pro.getFacturaID());
            rs.updateInt("ClienteID", Pro.getClienteID());
            rs.updateString("Fecha", Pro.getFecha());
            rs.updateString("Tipo", Pro.getTipo());
            rs.updateString("Estado", Pro.getEstado());
            rs.updateInt("BodegaID", Pro.getBodegaID());
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

public void updFacturaCab(FacturaCab dep)//boton modificar
    {
        try
        {
            String sql = "select * from FacturaCab where FacturaID=" + dep.getFacturaID();
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.next();
            rs.updateInt("ClienteID", dep.getClienteID());
            rs.updateString("Fecha", dep.getFecha());
            rs.updateString("Tipo", dep.getTipo());
            rs.updateString("Estado", dep.getEstado());
            rs.updateInt("BodegaID", dep.getBodegaID());
            rs.updateRow();            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

public void delFacturaCab(int FacturaID)//boton eliminar
    {
        try
        {
            String sql = "select * from FacturaCab where FacturaID=" + FacturaID;
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
            ResultSet save=new Conexion().getResultSet("select * from FacturaCab order by FacturaID");
            boolean last = save.last();
            if(last) {
                auto=save.getInt("FacturaID")+1;
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

}

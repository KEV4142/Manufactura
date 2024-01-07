/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.RequisicionCab;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author kev41
 */
public class ControlRequisicionCab {

    public ControlRequisicionCab() {
    }
    
    public RequisicionCab seekRequisicionCab(int RequisicionCab)
    {
        RequisicionCab PCab = null;
        try
        {
            String sql = "select * from RequisicionCab where RequisicionID=" + RequisicionCab;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                PCab = new RequisicionCab();
                PCab.setRequisicionID(rs.getInt("RequisicionID"));
                PCab.setFecha(rs.getString("Fecha"));
                PCab.setOrdenID(rs.getInt("OrdenID"));
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
    public RequisicionCab seekRequisicionCab1(int RequisicionCab)
    {
        RequisicionCab PCab = null;
        try
        {
            String sql = "select * from RequisicionCab where RequisicionID=" + RequisicionCab;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                PCab = new RequisicionCab();
                PCab.setRequisicionID(rs.getInt("RequisicionID"));
                PCab.setFecha(rs.getString("Fecha"));
                PCab.setOrdenID(rs.getInt("OrdenID"));
                PCab.setEstado(rs.getString("Estado"));
            }
            else {
                PCab=new RequisicionCab();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return PCab;
    }

public boolean insRequisicionCab(RequisicionCab Pro)//boton insertar
    {
    boolean a=false;
        try
        {
            String sql = "select * from RequisicionCab where RequisicionID = -1";
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.moveToInsertRow();
            rs.updateInt("RequisicionID", Pro.getRequisicionID());
            rs.updateString("Fecha", Pro.getFecha());
            rs.updateInt("OrdenID", Pro.getOrdenID());
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

public void updRequisicionCab(RequisicionCab dep)//boton modificar
    {
        try
        {
            String sql = "select * from RequisicionCab where RequisicionID=" + dep.getRequisicionID();
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.next();
            rs.updateString("Fecha", dep.getFecha());
            rs.updateInt("OrdenID", dep.getOrdenID());
            rs.updateString("Estado", dep.getEstado());
            rs.updateRow();            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

public void delRequisicionCab(int RequisicionID)//boton eliminar
    {
        try
        {
            String sql = "select * from RequisicionCab where RequisicionID=" + RequisicionID;
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
            ResultSet save=new Conexion().getResultSet("select * from RequisicionCab order by RequisicionID");
            boolean last = save.last();
            if(last) {
                auto=save.getInt("RequisicionID")+1;
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
public DefaultTableModel getModeloTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        try
        {
            modelo.addColumn("No. de Requisicion");
            modelo.addColumn("Fecha del Requisicion");
            modelo.addColumn("No. de Orden");
            modelo.addColumn("Estado");
            String sql = "select p.RequisicionID as 'No. de Requisicion',date_format(p.Fecha,'%W,%D %M %Y') as 'Fecha del Requisicion',c.OrdenID as 'No. de Orden',case when p.Estado='E' then 'EN ESPERA' end as 'Estado del Pedido' from PedidoCab as p inner join OrdenCab as c on p.OrdenID=c.OrdenID where p.Estado='E'";
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
public DefaultTableModel getModeloTabla1() {
        DefaultTableModel modelo = new DefaultTableModel();
        try
        {
            modelo.addColumn("No. de Requisicion");
            modelo.addColumn("Fecha de la Requisicion");
            
            String sql = "select b.RequisicionID as 'Codigo de Requisicion', date_format(b.Fecha,'%W,%D %M %Y') as 'Fecha de la Reqisicion' from RequisicionCab as b where b.Estado='E';";
            ResultSet rs = new Conexion().getResultSet(sql);
            while(rs.next())
            {
                Vector v = new Vector();
                v.addElement(rs.getString(1));
                v.addElement(rs.getString(2));
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

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.PedidoCab;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author kev41
 */
public class ControlPedidoCab {

    public ControlPedidoCab() {
    }
    
    public PedidoCab seekPedidoCab(int PedidoID)
    {
        PedidoCab PCab = null;
        try
        {
            String sql = "select * from PedidoCab where PedidoID=" + PedidoID;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                PCab = new PedidoCab();
                PCab.setPedidoID(rs.getInt("PedidoID"));
                PCab.setFecha(rs.getString("Fecha"));
                PCab.setClienteID(rs.getInt("ClienteID"));
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

public boolean insPedidoCab(PedidoCab Pro)//boton insertar
    {
    boolean a=false;
        try
        {
            String sql = "select * from PedidoCab where PedidoID = -1";
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.moveToInsertRow();
            rs.updateInt("PedidoID", Pro.getPedidoID());
            rs.updateString("Fecha", Pro.getFecha());
            rs.updateInt("ClienteID", Pro.getClienteID());
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


public boolean updPedidoCab(PedidoCab dep)//boton modificar
    {
    boolean a=false;
        try
        {
            String sql = "select * from PedidoCab where PedidoID=" + dep.getPedidoID();
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.next();
            rs.updateString("Fecha", dep.getFecha());
            rs.updateInt("ClienteID", dep.getClienteID());
            rs.updateString("Estado", dep.getEstado());
            rs.updateRow();
            a=true;
        }
        catch(Exception e)
        {
            a=false;
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return a;
    }

public void delPedidoCab(int PedidoID)//boton eliminar
    {
        try
        {
            String sql = "select * from PedidoCab where PedidoID=" + PedidoID;
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
            ResultSet save=new Conexion().getResultSet("select * from PedidoCab order by PedidoID");
            boolean last = save.last();
            if(last) {
                auto=save.getInt("PedidoID")+1;
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
            modelo.addColumn("No. de Pedido");
            modelo.addColumn("Fecha del Pedido");
            modelo.addColumn("Nombre del Cliente");
            modelo.addColumn("Estado del Pedido");
            String sql = "select p.PedidoID as 'No. de Pedido',date_format(p.Fecha,'%W,%D %M %Y') as 'Fecha del Pedido',c.Nombre as 'Nombre del Cliente',case when p.Estado='E' then 'EN ESPERA' end as 'Estado del Pedido' from PedidoCab as p inner join Cliente as c on p.ClienteID=c.ClienteID where p.Estado='E'";
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
            modelo.addColumn("No. de Pedido");
            modelo.addColumn("Fecha del Pedido");
            modelo.addColumn("Nombre del Cliente");
            modelo.addColumn("Estado del Pedido");
            String sql = "select p.PedidoID as 'No. de Pedido',date_format(p.Fecha,'%W,%D %M %Y') as 'Fecha del Pedido',c.Nombre as 'Nombre del Cliente',case when p.Estado='P' then 'PROCESADO' end as 'Estado del Pedido' from PedidoCab as p inner join Cliente as c on p.ClienteID=c.ClienteID where p.Estado='P'";
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

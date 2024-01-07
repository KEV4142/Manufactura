/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.OrdenCab;
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
public class ControlOrdenCab {

    public ControlOrdenCab() {
    }
    
    public OrdenCab seekOrdenCab(int OrdenID)
    {
        OrdenCab PCab = null;
        try
        {
            String sql = "select * from OrdenCab where OrdenID=" + OrdenID;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                PCab = new OrdenCab();
                PCab.setOrdenID(rs.getInt("OrdenID"));
                PCab.setFecha(rs.getString("Fecha"));
                PCab.setEstado(rs.getString("Estado"));
                PCab.setMateriaBodegaID(rs.getInt("MateriaBodegaID"));
                PCab.setProductoBodegaID(rs.getInt("ProductoBodegaID"));
                PCab.setObservacion(rs.getString("Observacion"));
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

public boolean insOrdenCab(OrdenCab Pro)//boton insertar
    {
    boolean a=false;
        try
        {
            String sql = "select * from OrdenCab where OrdenID = -1";
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.moveToInsertRow();
            rs.updateInt("OrdenID", Pro.getOrdenID());
            rs.updateString("Fecha", Pro.getFecha());
            rs.updateString("Estado", Pro.getEstado());
            rs.updateInt("MateriaBodegaID", Pro.getMateriaBodegaID());
            rs.updateInt("ProductoBodegaID", Pro.getProductoBodegaID());
            rs.updateString("Observacion", Pro.getObservacion());
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

public boolean updOrdenCab(OrdenCab Pro)//boton modificar
    {
    boolean a=false;
        try
        {
            String sql = "select * from OrdenCab where OrdenID=" + Pro.getOrdenID();
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.next();
            rs.updateInt("OrdenID", Pro.getOrdenID());
            rs.updateString("Fecha", Pro.getFecha());
            rs.updateString("Estado", Pro.getEstado());
            rs.updateInt("MateriaBodegaID", Pro.getMateriaBodegaID());
            rs.updateInt("ProductoBodegaID", Pro.getProductoBodegaID());
            rs.updateString("Observacion", Pro.getObservacion());
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

public void delOrdenCab(int OrdenID)//boton eliminar
    {
        try
        {
            String sql = "select * from OrdenCab where OrdenID=" + OrdenID;
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
            ResultSet save=new Conexion().getResultSet("select * from OrdenCab order by OrdenID");
            boolean last = save.last();
            if(last) {
                auto=save.getInt("OrdenID")+1;
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

public DefaultTableModel getModeloTabla1(int Tipo) {
        DefaultTableModel modelo = new DefaultTableModel();
        try
        {
            modelo.addColumn("No. de orden");
            modelo.addColumn("Fecha del Orden");
            modelo.addColumn("Estado del Orden");
            
            String sql = "";
            if(Tipo==1){
                sql = "select p.OrdenID as 'No. de Orden',date_format(p.Fecha,'%W,%D %M %Y') as 'Fecha del Orden',case when p.Estado='E' then 'EN ESPERA' when p.Estado='P' then 'PROCESADO' end as 'Estado del Orden' from OrdenCab as p WHERE p.Estado='E'";
            }
            else if(Tipo==2){
                sql = "select p.OrdenID as 'No. de Orden',date_format(p.Fecha,'%W,%D %M %Y') as 'Fecha del Orden',case when p.Estado='E' then 'EN ESPERA' when p.Estado='P' then 'PROCESADO' end as 'Estado del Orden' from OrdenCab as p WHERE p.Estado='P'";
            }
            else if(Tipo==3){
                sql = "select p.OrdenID as 'No. de Orden',date_format(p.Fecha,'%W,%D %M %Y') as 'Fecha del Orden',case when p.Estado='E' then 'EN ESPERA' when p.Estado='P' then 'PROCESADO' end as 'Estado del Orden' from OrdenCab as p";
            }
            ResultSet rs = new Conexion().getResultSet(sql);
            while(rs.next())
            {
                Vector v = new Vector();
                v.addElement(rs.getString(1));
                v.addElement(rs.getString(2));
                v.addElement(rs.getString(3));
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

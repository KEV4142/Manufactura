/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.OrdenDet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
/**
 *
 * @author kev41
 */
public class ControlOrdenDet {
    public OrdenDet seekOrdenDet(int OrdenID,int PedidoID ,int ArticuloID)
    {
        OrdenDet PCab = null;
        try
        {
            String sql = "select * from OrdenDet where OrdenID=" + OrdenID+" and PedidoID="+PedidoID+" and ArticuloID="+ArticuloID;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                PCab = new OrdenDet();
                PCab.setOrdenID(rs.getInt("OrdenID"));
                PCab.setPedidoID(rs.getInt("PedidoID"));
                PCab.setArticuloID(rs.getInt("ArticuloID"));
                PCab.setCantidad(rs.getInt("Cantidad"));
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
public Vector<OrdenDet> seekOrdenDetVector(int ordenID)
    {
        Vector<OrdenDet> res=new Vector<>();
        OrdenDet PCab = null;
        try
        {
            String sql = "select * from OrdenDet where OrdenID=" +ordenID;
            ResultSet rs = new Conexion().getResultSet(sql);
            while(rs.next()){
                PCab = new OrdenDet();
                PCab.setOrdenID(rs.getInt("OrdenID"));
                PCab.setPedidoID(rs.getInt("PedidoID"));
                PCab.setArticuloID(rs.getInt("ArticuloID"));
                PCab.setCantidad(rs.getInt("Cantidad"));
                res.addElement(PCab);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return res;
    }
public boolean insOrdenDet(OrdenDet Pro)//boton insertar
    {
    boolean a=false;
        try
        {
            String sql = "INSERT INTO OrdenDet(OrdenID,PedidoID,ArticuloID,Cantidad)VALUES("+Pro.getOrdenID()+","+Pro.getPedidoID()+","+Pro.getArticuloID()+","+Pro.getCantidad()+")";
            Statement stm = new Conexion().getConnect().createStatement(1005, 1008);
            stm.execute(sql);
            a=true;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
            a=false;
        }
        return a;
    }

public void updOrdenDet(OrdenDet dep)//boton modificar
    {
        try
        {
            String sql = "select * from OrdenDet where PedidoID=" + dep.getPedidoID()+" and ArticuloID="+dep.getArticuloID()+" and ArticuloID="+dep.getArticuloID()+" and OrdenID="+dep.getOrdenID();
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.next();
            rs.updateInt("cantidad", dep.getCantidad());
            rs.updateRow();            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

public void delOrdenDet(OrdenDet dep)//boton eliminar
    {
        try
        {
            String sql = "delete from OrdenDet where OrdenID="+dep.getOrdenID();
            Statement stm = new Conexion().getConnect().createStatement(1005, 1008);
            stm.execute(sql);
        }
            
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }
}

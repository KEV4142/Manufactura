/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.PedidoDet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
/**
 *
 * @author kev41
 */
public class ControlPedidoDet {
    public PedidoDet seekPedidoDet(int PedidoID, int ArticuloID)
    {
        PedidoDet PCab = null;
        try
        {
            String sql = "select * from PedidoDet where PedidoID=" + PedidoID+" and ArticuloID="+ArticuloID;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                PCab = new PedidoDet();
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

    public Vector<PedidoDet> seekPedidoDetVector(int PedidoID)
    {
        Vector<PedidoDet> res=new Vector<>();
        PedidoDet PCab = null;
        try
        {
            String sql = "select * from PedidoDet where PedidoID=" +PedidoID;
            ResultSet rs = new Conexion().getResultSet(sql);
            while(rs.next()){
                PCab = new PedidoDet();
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
    
public boolean insPedidoDet(PedidoDet Pro)//boton insertar
    {
    boolean a=false;
        try
        {
            String sql = "INSERT INTO PedidoDet(PedidoID,ArticuloID,Cantidad)VALUES("+Pro.getPedidoID()+","+Pro.getArticuloID()+","+Pro.getCantidad()+")";
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

public void updPedidoDet(PedidoDet dep)//boton modificar
    {
        try
        {
            String sql = "select * from PedidoDet where PedidoID=" + dep.getPedidoID()+" and ArticuloID="+dep.getArticuloID();
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

public void delPedidoDet(PedidoDet dep)//boton eliminar
    {
        try
        {
            String sql = "select * from PedidoDet where PedidoID=" + dep.getPedidoID()+" and ArticuloID="+dep.getArticuloID();
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.next();
            rs.deleteRow();
        }
            
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }
}

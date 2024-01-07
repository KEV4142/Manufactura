/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.RequisicionDet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author kev41
 */
public class ControlRequisicionDet {
    public RequisicionDet seekRequisicionDet(int RequisicionID, int ArticuloID)
    {
        RequisicionDet PCab = null;
        try
        {
            String sql = "select * from RequisicionDet where RequisicionID=" + RequisicionID+" and ArticuloID="+ArticuloID;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                PCab = new RequisicionDet();
                PCab.setRequisicionID(rs.getInt("RequisicionID"));
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

public boolean insRequisicionDet(RequisicionDet Pro)//boton insertar
    {
    boolean a=false;
        try
        {
            String sql = "INSERT INTO RequisicionDet(RequisicionID,ArticuloID,Cantidad)VALUES("+Pro.getRequisicionID()+","+Pro.getArticuloID()+","+Pro.getCantidad()+")";
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

public void updRequisicionDet(RequisicionDet dep)//boton modificar
    {
        try
        {
            String sql = "select * from RequisicionDet where RequisicionID=" + dep.getRequisicionID()+" and ArticuloID="+dep.getArticuloID();
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

public void delRequisicionDet(RequisicionDet dep)//boton eliminar
    {
        try
        {
            String sql = "select * from RequisicionDet where RequisicionID=" + dep.getRequisicionID()+" and ArticuloID="+dep.getArticuloID();
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

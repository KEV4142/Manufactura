/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.CompraDet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author kev41
 */
public class ControlCompraDet {
    public CompraDet seekRequisicionDet(int CompraID,int RequisicionID, int ArticuloID)
    {
        CompraDet PCab = null;
        try
        {
            String sql = "select * from CompraDet where RequisicionID=" + RequisicionID+" and ArticuloID="+ArticuloID+" and CompraID="+CompraID;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                PCab = new CompraDet();
                PCab.setCompraID(rs.getInt("CompraID"));
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

public boolean insCompraDet(CompraDet Pro)//boton insertar
    {
    boolean a=false;
        try
        {
            String sql = "INSERT INTO CompraDet(CompraID,RequisicionID,ArticuloID,Cantidad)VALUES("+Pro.getCompraID()+","+Pro.getRequisicionID()+","+Pro.getArticuloID()+","+Pro.getCantidad()+")";
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


}
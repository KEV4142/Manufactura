/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Existencia;
import Model.FacturaCab;
import Model.FacturaDet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author kev41
 */
public class ControlFacturaDet {
    public FacturaDet seekFacturaDet(int FacturaID, int ArticuloID)
    {
        FacturaDet PCab = null;
        try
        {
            String sql = "select * from FacturaDet where ArticuloID="+ArticuloID+" and FacturaID="+FacturaID;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                PCab = new FacturaDet();
                PCab.setFacturaID(rs.getInt("FacturaID"));
                PCab.setArticuloID(rs.getInt("ArticuloID"));
                PCab.setCantidad(rs.getInt("Cantidad"));
                PCab.setPrecio(rs.getFloat("Precio"));
                PCab.setISV(rs.getFloat("ISV"));
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

public boolean insFacturaDet(FacturaDet Pro,FacturaCab Pro1)//boton insertar
    {
    boolean a=false;
        try
        {
            String sql = "INSERT INTO FacturaDet(FacturaID,ArticuloID,Cantidad,Precio,ISV)VALUES("+Pro.getFacturaID()+","+Pro.getArticuloID()+","+Pro.getCantidad()+","+Pro.getPrecio()+","+Pro.getISV()+")";
            Statement stm = new Conexion().getConnect().createStatement(1005, 1008);
            stm.execute(sql);
            Existencia exis=new Existencia();
            ControlExistencia control =new ControlExistencia();
            exis = control.seekExistencia1(Pro1.getBodegaID(), Pro.getArticuloID());

            int cant = exis.getCantidad() - Pro.getCantidad();
            exis.setCantidad(cant);
            control.updExistencia(exis);

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
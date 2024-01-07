/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author kev41
 */
public class ControlIngresoDet {
    public IngresoDet seekIngresoDet(int IngresoID,int CompraID,int RequisicionID, int ArticuloID)
    {
        IngresoDet PCab = null;
        try
        {
            String sql = "select * from IngresoDet where RequisicionID=" + RequisicionID+" and ArticuloID="+ArticuloID+" and CompraID="+CompraID+" and IngresoID="+IngresoID;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                PCab = new IngresoDet();
                PCab.setCompraID(rs.getInt("IngresoID"));
                PCab.setCompraID(rs.getInt("CompraID"));
                PCab.setRequisicionID(rs.getInt("RequisicionID"));
                PCab.setArticuloID(rs.getInt("ArticuloID"));
                PCab.setCantidad(rs.getInt("Cantidad"));
                PCab.setCosto(rs.getFloat("Costo"));
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

public boolean insIngresoDet(IngresoDet Pro,IngresoCab Pro1)//boton insertar
    {
    boolean a=false;
        try
        {
            String sql = "INSERT INTO IngresoDet(IngresoID,CompraID,RequisicionID,ArticuloID,Cantidad,Costo)VALUES("+Pro.getIngresoID()+","+Pro.getCompraID()+","+Pro.getRequisicionID()+","+Pro.getArticuloID()+","+Pro.getCantidad()+","+Pro.getCosto()+")";
            Statement stm = new Conexion().getConnect().createStatement(1005, 1008);
            stm.execute(sql);
            Existencia exis=new Existencia();
            ControlExistencia control =new ControlExistencia();
            exis=control.seekExistencia1(Pro1.getBodegaID(), Pro.getArticuloID());
            if(exis.getBodegaID()==-1){
                exis.setBodegaID(Pro1.getBodegaID());
                exis.setArticuloID(Pro.getArticuloID());
                exis.setCantidad(Pro.getCantidad());
                control.insExistencia(exis);
            }
            else{
                int cant=exis.getCantidad()+Pro.getCantidad();
                exis.setCantidad(cant);
                control.updExistencia(exis);
            }
            CompraCab compra=new CompraCab();
            ControlCompraCab control1 =new ControlCompraCab();
            compra=control1.seekCompraCab1(Pro.getCompraID());
            if(compra.getCompraID()!=-1 && compra.getEstado().equals("P")){
                compra.setEstado("S");
                control1.updCompraCab(compra);
            }
            RequisicionCab req=new RequisicionCab();
            ControlRequisicionCab control2 =new ControlRequisicionCab();
            req=control2.seekRequisicionCab1(Pro.getRequisicionID());
            if(req.getRequisicionID()!=-1 && req.getEstado().equals("E")){
                req.setEstado("P");
                control2.updRequisicionCab(req);
            }
            a=true;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error-ingreso",JOptionPane.ERROR_MESSAGE);
            a=false;
        }
        return a;
    }


}
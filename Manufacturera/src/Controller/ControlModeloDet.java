/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.ModeloCab;
import Model.ModeloDet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author kev41
 */
public class ControlModeloDet {
    public ModeloDet seekModeloDet(int modeloID, int ArticuloID)
    {
        ModeloDet PCab = null;
        try
        {
            String sql = "select * from ModeloDet where ModeloID=" + modeloID+" and ArticuloID="+ArticuloID;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                PCab = new ModeloDet();
                PCab.setModeloID(rs.getInt("ModeloID"));
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
    
    public Vector<ModeloDet> seekModeloDetVector(int modeloID)
    {
        Vector<ModeloDet> res=new Vector<>();
        ModeloDet PCab = null;
        try
        {
            String sql = "select * from ModeloDet where ModeloID=" + modeloID;
            ResultSet rs = new Conexion().getResultSet(sql);
            while(rs.next()){
                PCab = new ModeloDet();
                PCab.setModeloID(rs.getInt("ModeloID"));
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

public boolean insModeloDet(ModeloDet Pro)//boton insertar
    {
    boolean a=false;
        try
        {
            String sql = "INSERT INTO ModeloDet(ModeloID,ArticuloID,Cantidad)VALUES("+Pro.getModeloID()+","+Pro.getArticuloID()+","+Pro.getCantidad()+")";
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

public void delModeloDet(ModeloCab dep)//boton eliminar
    {
        try
        {
            String sql = "delete from ModeloDet where ModeloID=" + dep.getModeloID();
            Statement stm = new Conexion().getConnect().createStatement(1005, 1008);
            stm.execute(sql);
        }
            
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

public DefaultTableModel getModeloTabla(int ModeloID) {
        DefaultTableModel modelo = new DefaultTableModel();
        try
        {
            modelo.addColumn("Codigo del Articulo");
            modelo.addColumn("Nombre del Articulo");
            modelo.addColumn("Cantidad");
            String sql = "";
            sql = "select a.ArticuloID as 'Codigo de Articulo', a.Nombre as 'Nombre del Articulo',b.Cantidad from ModeloDet as b inner join Articulo as a on b.ArticuloID=a.ArticuloID where ModeloID="+ModeloID;
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
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Precio;
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
public class ControlPrecio {
    public Precio seekPrecio(int ArticuloID,int ListaID)
    {
        Precio Ext = null;
        try
        {
            String sql = "select * from Precio where ArticuloID=" + ArticuloID+" and ListaID="+ListaID;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                Ext = new Precio();
                Ext.setArticuloID(rs.getInt("ArticuloID"));
                Ext.setListaID(rs.getInt("ListaID"));
                Ext.setPrecio(rs.getFloat("Precio"));
            }
            else {
                JOptionPane.showMessageDialog(null, "Registro no existe");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return Ext;
    }

    public Precio seekPrecio1(int ArticuloID,int ListaID)
    {
        Precio Ext = null;
        try
        {
            String sql = "select * from Precio where ArticuloID=" + ArticuloID+" and ListaID="+ListaID;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                Ext = new Precio();
                Ext.setArticuloID(rs.getInt("ArticuloID"));
                Ext.setListaID(rs.getInt("ListaID"));
                Ext.setPrecio(rs.getFloat("Precio"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return Ext;
    }
public void insPrecio(Precio precio)//boton insertar
    {
        try
        {
            String sql = "INSERT INTO Precio(ArticuloID,ListaID,Precio)VALUES("+precio.getArticuloID()+","+precio.getListaID()+","+precio.getPrecio()+")";
            Statement stm = new Conexion().getConnect().createStatement(1005, 1008);
            stm.execute(sql);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

public void updPrecio(Precio dep)//boton modificar
    {
        try
        {
            String sql = "UPDATE Precio set Precio="+dep.getPrecio()+" where ArticuloID="+ dep.getArticuloID()+" and ListaID="+dep.getListaID();
            Statement stm = new Conexion().getConnect().createStatement(1005, 1008);
            stm.execute(sql);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

public void delPrecio(int ArticuloID,int ListaID)//boton eliminar
    {
        try
        {
            String sql = "delete from Precio where ArticuloID="+ ArticuloID+" and ListaID="+ListaID;
            Statement stm = new Conexion().getConnect().createStatement(1005, 1008);
            stm.execute(sql);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }
}

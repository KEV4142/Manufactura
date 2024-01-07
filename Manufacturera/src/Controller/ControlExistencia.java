/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Existencia;
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
public class ControlExistencia {
    public Existencia seekExistencia(int BodegaID,int ArticuloID)
    {
        Existencia Ext = null;
        try
        {
            String sql = "select * from Existencia where ArticuloID=" + ArticuloID+" and BodegaID="+BodegaID;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                Ext = new Existencia();
                Ext.setBodegaID(rs.getInt("BodegaID"));
                Ext.setArticuloID(rs.getInt("ArticuloID"));
                Ext.setCantidad(rs.getInt("Cantidad"));
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
    public Existencia seekExistencia1(int BodegaID,int ArticuloID)
    {
        Existencia Ext = null;
        try
        {
            String sql = "select * from Existencia where BodegaID="+BodegaID+" and ArticuloID=" + ArticuloID;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                Ext = new Existencia();
                Ext.setBodegaID(rs.getInt("BodegaID"));
                Ext.setArticuloID(rs.getInt("ArticuloID"));
                Ext.setCantidad(rs.getInt("Cantidad"));
            }else{
                Ext=new Existencia();
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return Ext;
    }

public void insExistencia(Existencia Ext)//boton insertar
    {
        try
        {
            String sql = "INSERT INTO Existencia(BodegaID,ArticuloID,Cantidad)VALUES("+Ext.getBodegaID()+","+Ext.getArticuloID()+","+Ext.getCantidad()+")";
            Statement stm = new Conexion().getConnect().createStatement(1005, 1008);
            stm.execute(sql);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

public void updExistencia(Existencia dep)//boton modificar
    {
        try
        {
            String sql = "UPDATE Existencia SET Cantidad="+dep.getCantidad()+" where BodegaID="+dep.getBodegaID()+" and ArticuloID="+dep.getArticuloID();
            Statement stm = new Conexion().getConnect().createStatement(1005, 1008);
            stm.execute(sql);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

public void delArticulo(int BodegaID,int ArticuloID)//boton eliminar
    {
        try
        {
            String sql = "select * from Articulo where ArticuloID=" + ArticuloID+" and BodegaID="+BodegaID;
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.next();
            rs.deleteRow();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

    public DefaultTableModel getModeloTabla(int Tipo) {
        DefaultTableModel modelo = new DefaultTableModel();
        try
        {
            modelo.addColumn("Nombre de la Bodega");
            modelo.addColumn("Nombre del Articulo");
            modelo.addColumn("Tipo de Articulo");
            modelo.addColumn("Cantidad");
            String sql = "";
            if(Tipo==1){
                sql = "select b.Nombre as Bodega,a.Nombre as Articulo,case when a.Tipo='T' then 'Materia Prima' when a.Tipo='P' then 'Producto Terminado' end as 'Tipo de Articulo',e.Cantidad from Existencia as e inner join Bodega as b on e.BodegaID=b.BodegaID inner join Articulo as a on e.ArticuloID=a.ArticuloID where a.Tipo='P'";
            }
            else if(Tipo==2){
                sql = "select b.Nombre as Bodega,a.Nombre as Articulo,case when a.Tipo='T' then 'Materia Prima' when a.Tipo='P' then 'Producto Terminado' end as 'Tipo de Articulo',e.Cantidad from Existencia as e inner join Bodega as b on e.BodegaID=b.BodegaID inner join Articulo as a on e.ArticuloID=a.ArticuloID where a.Tipo='T'";
            }
            else if(Tipo==3){
                sql = "select b.Nombre as Bodega,a.Nombre as Articulo,case when a.Tipo='T' then 'Materia Prima' when a.Tipo='P' then 'Producto Terminado' end as 'Tipo de Articulo',e.Cantidad from Existencia as e inner join Bodega as b on e.BodegaID=b.BodegaID inner join Articulo as a on e.ArticuloID=a.ArticuloID";
            }
            ResultSet rs = new Conexion().getResultSet(sql);
            while(rs.next())
            {
                Vector v = new Vector();
                v.addElement(rs.getString(1));
                v.addElement(rs.getString(2));
                v.addElement(rs.getString(3));
                v.addElement(rs.getInt(4));
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

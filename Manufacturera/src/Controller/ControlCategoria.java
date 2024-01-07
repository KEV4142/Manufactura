/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Categoria;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
/**
 *
 * @author kev41
 */
public class ControlCategoria {
    public Categoria seekCategoria(int categoria)
    {
        Categoria Cat = null;
        try
        {
            String sql = "select * from Categoria where CategoriaID=" + categoria;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                Cat=new Categoria();
                Cat.setCategoriaID(rs.getInt("CategoriaID"));
                Cat.setNombre(rs.getString("Nombre"));
            }
            else {
                JOptionPane.showMessageDialog(null, "Registro no existe");
            }
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return Cat;
    }

public void insCategoria(Categoria categoria)//boton insertar
    {
        try
        {
            String sql = "select * from Categoria where CategoriaID = -1";
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.moveToInsertRow();
            rs.updateInt("CategoriaID", categoria.getCategoriaID());
            rs.updateString("Nombre", categoria.getNombre());
            rs.insertRow();            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

public void updCategoria(Categoria categoria)//boton modificar
    {
        try
        {
            String sql = "select * from Categoria where CategoriaID=" + categoria.getCategoriaID();
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.next();
            rs.updateString("nombre", categoria.getNombre());
            rs.updateRow();            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

public void delCategoria(int categoriaID)//boton eliminar
    {
        try
        {
            String sql = "select * from Categoria where CategoriaID=" + categoriaID;
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
            ResultSet save=new Conexion().getResultSet("select * from Categoria order by CategoriaID");
            boolean last = save.last();
            if(last) {
                auto=save.getInt("CategoriaID")+1;
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
    public DefaultComboBoxModel comboModel() {
        DefaultComboBoxModel modelo = null;
        try {
            Vector v = new Vector();
            ResultSet save = new Conexion().getResultSet("select Nombre from Categoria");
            while (save.next()) {
                v.addElement(save.getString("Nombre"));
            }
            modelo = new DefaultComboBoxModel(v);
        } catch (SQLException ex) {
            Logger.getLogger(ControlCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
}

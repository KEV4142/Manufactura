
package Controller;


import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Model.Lista;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

public class ControlLista {
    
    public Lista getLista(int lis)
    {
        Lista List = null;
        try
        {
            String sql = "select * from Lista where ListaID=" + lis;
            ResultSet rs = new Conexion().getResultSet(sql);
            if(rs.next()){
                List = new Lista();
                List.setListaid(rs.getInt("ListaID"));
                List.setNombre(rs.getString("Nombre"));
            }
            else {
                JOptionPane.showMessageDialog(null, "Registro no existe");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return List;
    }
    
    public void insLista(Lista list)//boton insertar
    {
        try
        {
            String sql = "select * from Lista where ListaID = -1";
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.moveToInsertRow();
            rs.updateInt("ListaID", list.getListaid());
            rs.updateString("nombre", list.getNombre());
            rs.insertRow();            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

    public void updLista(Lista dep)//boton modificar
    {
        try
        {
            String sql = "select * from Lista where ListaID=" + dep.getListaid();
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.next();
            rs.updateString("nombre", dep.getNombre());
            rs.updateRow();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

public void delLista(int list)//boton eliminar
    {
        try
        {
            String sql = "select * from Lista where ListaID=" + list;
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
            ResultSet save=new Conexion().getResultSet("select * from Lista order by listaID");
            boolean last = save.last();
            if(last) {
                auto=save.getInt("ListaID")+1;
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
            ResultSet save = new Conexion().getResultSet("select Nombre from Lista");
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

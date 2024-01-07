
package Controller;
import Model.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ControlCliente {

    public Cliente getCliente(int cli)
    {
        Cliente Clt = null;
        
        try
        {
            String sql = "select * from Cliente where ClienteID=" + cli;
            ResultSet rs = new Conexion().getResultSet(sql);
            if (rs.next()) {
                Clt = new Cliente();
                Clt.setClienteid(rs.getInt("ClienteID"));
                Clt.setNombre(rs.getString("Nombre"));
                Clt.setDireccion(rs.getString("Direccion"));
                Clt.setTelefono(rs.getString("Telefono"));
                Clt.setLimite(rs.getString("Limite"));
                Clt.setSaldo(rs.getString("Saldo"));
                Clt.setListaid(rs.getString("ListaID"));
            }
            else {
                JOptionPane.showMessageDialog(null, "Registro no existe");
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return Clt;
    }

public void insCliente(Cliente cli)//boton insertar
    {
        try
        {
            String sql = "select * from Cliente where ClienteID = -1";
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.moveToInsertRow();
            rs.updateInt("ClienteID", cli.getClienteid());
            rs.updateString("nombre", cli.getNombre());
            rs.updateString("Direccion", cli.getDireccion());
            rs.updateString("Telefono", cli.getTelefono());
            rs.updateString("Limite", cli.getLimite());
            rs.updateString("Saldo", cli.getSaldo());
            rs.updateString("ListaID", cli.getListaid());
            
            rs.insertRow();            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

public void updCliente(Cliente dep)//boton modificar
    {
        try
        {
            String sql = "select * from Cliente where ClienteID=" + dep.getClienteid();
            ResultSet rs = new Conexion().getResultSet(sql);
            rs.next();
            rs.updateString("nombre", dep.getNombre());
            rs.updateString("Direccion", dep.getDireccion());
            rs.updateString("Telefono", dep.getTelefono());
            rs.updateString("Limite", dep.getLimite());
            rs.updateString("Saldo", dep.getSaldo());
            rs.updateString("ListaID", dep.getListaid());
            rs.updateRow();            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }

public void delCliente(int cli)//boton eliminar
    {
        try
        {
            String sql = "select * from Cliente where Clienteid=" + cli;
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
            ResultSet save=new Conexion().getResultSet("select * from Cliente order by ClienteID");
            boolean last = save.last();
            if(last) {
                auto=save.getInt("ClienteID")+1;
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
public DefaultTableModel getModeloTabla(int ClienteID) {
        DefaultTableModel modelo = new DefaultTableModel();
        try
        {
            modelo.addColumn("Nombre del Cliente");
            modelo.addColumn("Limite de Credito");
            modelo.addColumn("Saldo del Cliente");
            String sql = "";
            sql = "select a.Nombre as 'Nombre', a.Limite as 'Limite',a.Saldo as 'Saldo' from Cliente as a where a.ClienteID="+ClienteID;
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

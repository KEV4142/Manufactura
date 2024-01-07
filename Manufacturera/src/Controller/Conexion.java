/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author root4142
 */
public class Conexion {
    
    private Connection conexion;
    
    public Conexion()
    {
        try
        {
            String sql = "jdbc:mysql://localhost:3306/Manufactura";
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(sql, "root", "root");           
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public Conexion(String drv, String url, String usr, String pwd)
    {
        try
        {
            Class.forName(drv);
            
            if(usr.length() > 0)
                conexion = DriverManager.getConnection(url, usr, pwd);
            else
                conexion = DriverManager.getConnection(url);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public ResultSet getResultSet(String sql)
    {
        ResultSet rs = null;
        try
        {
            Statement stm = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stm.executeQuery(sql);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
    }
        
    public Connection getConnect(){ return conexion;}
    
}


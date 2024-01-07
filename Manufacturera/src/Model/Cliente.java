/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.ControlCliente;
import javax.swing.JTextField;

/**
 *
 * @author Wilmer Zeron
 */
public class Cliente {
    private int Clienteid; 
    private String nombre; //esto por principio de encapsulamiento (abstraccion)
    private String Direccion; 
    private String Telefono;
    private String Limite;
    private String Saldo;
    private String Listaid;
    
    public int getClienteid() {return Clienteid;}
    public String getNombre() {return nombre;}
    public String getDireccion() {return Direccion;}
    public String getTelefono() {return Telefono;}
    public String getLimite() {return Limite;}
    public String getSaldo() {return Saldo;}
    public String getListaid() {return Listaid;}
    
    public void setClienteid(int clt){Clienteid=clt;}
    public void setNombre(String nom){nombre=nom;}
    public void setDireccion(String dir){Direccion=dir;}
    public void setTelefono(String tel){Telefono=tel;}
    public void setLimite(String lim){Limite=lim;}
    public void setSaldo(String sal){Saldo=sal;}
    public void setListaid(String lis){Listaid=lis;}
    
    public Cliente()
    {
        Clienteid=-1; nombre=""; Direccion=""; Telefono=""; Limite=""; Saldo=""; Listaid="";        
    }
    
    public Cliente(int clt, String nom, String dir, String tel, String lim, String sal, String lis)
    {
        Clienteid=clt; nombre=nom; Direccion=dir; Telefono=tel; Limite=lim; Saldo=sal; Listaid=lis;
    } 
    
    public Cliente(int clt)
    {
        Cliente cliente = new ControlCliente().getCliente(clt);
        if(cliente!=null){
            Clienteid = clt;
            nombre = cliente.getNombre();
            Direccion = cliente.Direccion;
            Telefono = cliente.getTelefono();
            Limite = cliente.Limite;
            Saldo = cliente.getSaldo();
            Listaid = cliente.Listaid;
        }
    }
    
    public void Insert()
    {
        new ControlCliente().insCliente(this);
    }
    public void Update()
    {
        new ControlCliente().updCliente(this);
    }
    public void Delete()
    {
        new ControlCliente().delCliente(Clienteid);
    }
    
    public Cliente(JTextField cod, JTextField nom, JTextField dir, JTextField tel, JTextField lim, JTextField sal, JTextField lis)
    {
        Clienteid = Integer.parseInt(cod.getText());
        nombre = nom.getText();
        Direccion = dir.getText();
        Telefono = tel.getText();
        Limite = lim.getText();
        Saldo = sal.getText();
        Listaid = lis.getText();
    }
    
    
}

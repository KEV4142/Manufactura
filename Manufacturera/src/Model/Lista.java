
package Model;

import Controller.ControlLista;
import javax.swing.JTextField;


public class Lista {

    private int Listaid; 
    private String nombre;
    
    public int getListaid() {return Listaid;}
    public String getNombre() {return nombre;}
    
    public void setListaid(int list){Listaid=list;}
    public void setNombre(String nom){nombre=nom;}
    
    public Lista()
    {
        Listaid=-1; nombre="";  }
    
    public Lista(int list, String nom)
    {
        Listaid=list; nombre=nom; } 
    
    public Lista(int list)
    {
        Lista lista = new ControlLista().getLista(list);
        Listaid = list;
        nombre=lista.getNombre();
    }
    
    public void Insert()
    {
        new ControlLista().insLista(this);
    }
    public void Update()
    {
        new ControlLista().updLista(this);
    }
    public void Delete()
    {
        new ControlLista().delLista(Listaid);
    }
    
    public Lista(JTextField cod, JTextField nom)
    {
        Listaid = Integer.parseInt(cod.getText());
        nombre = nom.getText();
    }
}

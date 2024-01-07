/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author root4142
 */
public class Proveedor {
    private int ProveedorID;
    private String Nombre;
    private String Contacto;
    private String Telefono;
    private float Limite;
    private float Saldo;

    public Proveedor() {
        this.ProveedorID = -1;
        this.Nombre = "";
        this.Contacto = "";
        this.Telefono = "";
        this.Limite = -1;
        this.Saldo = -1;
    }

    public Proveedor(int ProveedorID, String Nombre, String Contacto, String Telefono, float Limite, float Saldo) {
        this.ProveedorID = ProveedorID;
        this.Nombre = Nombre;
        this.Contacto = Contacto;
        this.Telefono = Telefono;
        this.Limite = Limite;
        this.Saldo = Saldo;
    }

    public String getContacto() {
        return Contacto;
    }

    public float getSaldo() {
        return Saldo;
    }

    public float getLimite() {
        return Limite;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public int getProveedorID() {
        return ProveedorID;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }

    public void setLimite(float Limite) {
        this.Limite = Limite;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setProveedorID(int ProveedorID) {
        this.ProveedorID = ProveedorID;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
}
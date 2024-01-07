/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author root4142
 */
public class CompraCab {
    private int CompraID;
    private String Fecha;
    private int ProveedorID;
    private String Estado;

    public CompraCab() {
        this.CompraID = -1;
        this.Fecha = "";
        this.ProveedorID = -1;
        this.Estado = "";
    }

    public CompraCab(int CompraID, String Fecha, int ProveedorID, String Estado) {
        this.CompraID = CompraID;
        this.Fecha = Fecha;
        this.ProveedorID = ProveedorID;
        this.Estado = Estado;
    }

    public int getCompraID() {
        return CompraID;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getEstado() {
        return Estado;
    }

    public int getProveedorID() {
        return ProveedorID;
    }

    public void setProveedorID(int ProveedorID) {
        this.ProveedorID = ProveedorID;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setCompraID(int CompraID) {
        this.CompraID = CompraID;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    
}
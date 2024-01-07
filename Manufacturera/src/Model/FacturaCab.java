/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author root4142
 */
public class FacturaCab {
    private int FacturaID;
    private int ClienteID;
    private String Fecha;
    private String Tipo;
    private String Estado;
    private int BodegaID;
    
    public FacturaCab() {
        this.FacturaID = -1;
        this.ClienteID = -1;
        this.Fecha = "";
        this.Tipo = "";
        this.Estado = "";
        this.BodegaID = -1;
    }

    public FacturaCab(int FacturaID, int ClienteID, String Fecha, String Tipo, String Estado, int BodegaID) {
        this.FacturaID = FacturaID;
        this.ClienteID = ClienteID;
        this.Fecha = Fecha;
        this.Tipo = Tipo;
        this.Estado = Estado;
        this.BodegaID = BodegaID;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setBodegaID(int BodegaID) {
        this.BodegaID = BodegaID;
    }

    public String getTipo() {
        return Tipo;
    }

    public int getBodegaID() {
        return BodegaID;
    }

    

    public int getFacturaID() {
        return FacturaID;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getEstado() {
        return Estado;
    }

    public int getClienteID() {
        return ClienteID;
    }

    public void setClienteID(int ClienteID) {
        this.ClienteID = ClienteID;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setFacturaID(int FacturaID) {
        this.FacturaID = FacturaID;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    
}
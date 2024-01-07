/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author root4142
 */
public class IngresoCab {
    private int IngresoID;
    private String Fecha;
    private int BodegaID;
    private String Estado;

    public IngresoCab() {
        this.IngresoID = -1;
        this.Fecha = "";
        this.BodegaID = -1;
        this.Estado = "";
    }

    public IngresoCab(int ingresoID, String Fecha, int bodegaID, String Estado) {
        this.IngresoID = ingresoID;
        this.Fecha = Fecha;
        this.BodegaID = bodegaID;
        this.Estado = Estado;
    }

    public int getIngresoID() {
        return IngresoID;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getEstado() {
        return Estado;
    }

    public int getBodegaID() {
        return BodegaID;
    }

    public void setBodegaID(int BodegaID) {
        this.BodegaID = BodegaID;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setIngresoID(int IngresoID) {
        this.IngresoID = IngresoID;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
}
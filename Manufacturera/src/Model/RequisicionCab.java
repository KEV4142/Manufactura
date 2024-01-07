/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author root4142
 */
public class RequisicionCab {
    private int RequisicionID;
    private String Fecha;
    private int OrdenID;
    private String Estado;

    public RequisicionCab() {
        this.RequisicionID = -1;
        this.Fecha = "";
        this.OrdenID = -1;
        this.Estado = "";
    }

    public RequisicionCab(int RequisicionID, String Fecha, int OrdenID, String Estado) {
        this.RequisicionID = RequisicionID;
        this.Fecha = Fecha;
        this.OrdenID = OrdenID;
        this.Estado = Estado;
    }

    

    public int getRequisicionID() {
        return RequisicionID;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getEstado() {
        return Estado;
    }

    public int getOrdenID() {
        return OrdenID;
    }

    public void setOrdenID(int OrdenID) {
        this.OrdenID = OrdenID;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setRequisicionID(int RequisicionID) {
        this.RequisicionID = RequisicionID;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author root4142
 */
public class IngresoDet {
    private int IngresoID;
    private int CompraID;
    private int RequisicionID;
    private int ArticuloID;
    private int Cantidad;
    private float Costo;

    public IngresoDet() {
        this.IngresoID=-1;
        this.CompraID=-1;
        this.RequisicionID = -1;
        this.ArticuloID = -1;
        this.Cantidad =-1;
        this.Costo=-1;
    }

    public IngresoDet(int IngresoID, int CompraID, int RequisicionID, int ArticuloID, int Cantidad, float Costo) {
        this.IngresoID = IngresoID;
        this.CompraID = CompraID;
        this.RequisicionID = RequisicionID;
        this.ArticuloID = ArticuloID;
        this.Cantidad = Cantidad;
        this.Costo = Costo;
    }

    public float getCosto() {
        return Costo;
    }

    public int getIngresoID() {
        return IngresoID;
    }

    public void setIngresoID(int IngresoID) {
        this.IngresoID = IngresoID;
    }

    public void setCosto(float Costo) {
        this.Costo = Costo;
    }

    public void setCompraID(int CompraID) {
        this.CompraID = CompraID;
    }

    public int getCompraID() {
        return CompraID;
    }

    public int getArticuloID() {
        return ArticuloID;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public int getRequisicionID() {
        return RequisicionID;
    }

    public void setArticuloID(int ArticuloID) {
        this.ArticuloID = ArticuloID;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setRequisicionID(int RequisicionID) {
        this.RequisicionID = RequisicionID;
    }
    
}
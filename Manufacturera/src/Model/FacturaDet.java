/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author root4142
 */
public class FacturaDet {
    private int FacturaID;
    private int ArticuloID;
    private int Cantidad;
    private float Precio;
    private float ISV;

    public FacturaDet() {
        this.FacturaID = -1;
        this.ArticuloID = -1;
        this.Cantidad = -1;
        this.Precio = -1;
        this.ISV = -1;
    }

    public FacturaDet(int FacturaID, int ArticuloID, int Cantidad, float Precio, float ISV) {
        this.FacturaID = FacturaID;
        this.ArticuloID = ArticuloID;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.ISV = ISV;
    }

    public float getISV() {
        return ISV;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setISV(float ISV) {
        this.ISV = ISV;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }


    public void setFacturaID(int FacturaID) {
        this.FacturaID = FacturaID;
    }

    public int getFacturaID() {
        return FacturaID;
    }

    public int getArticuloID() {
        return ArticuloID;
    }

    public int getCantidad() {
        return Cantidad;
    }


    public void setArticuloID(int ArticuloID) {
        this.ArticuloID = ArticuloID;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
}
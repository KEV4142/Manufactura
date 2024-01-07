/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author root4142
 */
public class OrdenDet {
    private int OrdenID;
    private int PedidoID;
    private int ArticuloID;
    private int Cantidad;

    public OrdenDet() {
        OrdenID=-1;
        this.PedidoID = -1;
        this.ArticuloID = -1;
        this.Cantidad =-1;
    }

    public OrdenDet(int OrdenID, int PedidoID, int ArticuloID, int Cantidad) {
        this.OrdenID = OrdenID;
        this.PedidoID = PedidoID;
        this.ArticuloID = ArticuloID;
        this.Cantidad = Cantidad;
    }

    public int getOrdenID() {
        return OrdenID;
    }

    public void setOrdenID(int OrdenID) {
        this.OrdenID = OrdenID;
    }

   

    public int getArticuloID() {
        return ArticuloID;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public int getPedidoID() {
        return PedidoID;
    }

    public void setArticuloID(int ArticuloID) {
        this.ArticuloID = ArticuloID;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setPedidoID(int PedidoID) {
        this.PedidoID = PedidoID;
    }
    
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author root4142
 */
public class PedidoCab {
    private int PedidoID;
    private String Fecha;
    private int ClienteID;
    private String Estado;

    public PedidoCab() {
        this.PedidoID = -1;
        this.Fecha = "";
        this.ClienteID = -1;
        this.Estado = "";
    }

    public PedidoCab(int PedidoID, String Fecha, int ClienteID, String Estado) {
        this.PedidoID = PedidoID;
        this.Fecha = Fecha;
        this.ClienteID = ClienteID;
        this.Estado = Estado;
    }

    public int getPedidoID() {
        return PedidoID;
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

    public void setPedidoID(int PedidoID) {
        this.PedidoID = PedidoID;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    
}
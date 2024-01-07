package Model;

/**
 *
 * @author root4142
 */
public class Existencia {
    private int BodegaID;
    private int ArticuloID;
    private int Cantidad;
    

    public Existencia() {
        this.ArticuloID = -1;
        this.Cantidad = -1;
        this.BodegaID = -1;
    }

    public Existencia(int BodegaID,int ArticuloID, int cantidad) {
        this.BodegaID = BodegaID;
        this.ArticuloID = ArticuloID;
        this.Cantidad = cantidad;
    }

    
    public int getArticuloID() {
        return ArticuloID;
    }

    public int getCantidad() {
        return Cantidad;
    }
    public int getBodegaID() {
        return BodegaID;
    }
    

    public void setArticuloID(int ArticuloID) {
        this.ArticuloID = ArticuloID;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setBodegaID(int BodegaID) {
        this.BodegaID = BodegaID;
    }
}
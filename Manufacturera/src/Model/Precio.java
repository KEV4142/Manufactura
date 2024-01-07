package Model;

/**
 *
 * @author root4142
 */
public class Precio {
    private int ListaID;
    private int ArticuloID;
    private float Precio;
    

    public Precio() {
        this.ArticuloID = -1;
        this.Precio = -1;
        this.ListaID = -1;
    }

    public Precio(int ArticuloID,int listaID, float precio) {
        this.ListaID = listaID;
        this.ArticuloID = ArticuloID;
        this.Precio = precio;
    }

    
    public int getArticuloID() {
        return ArticuloID;
    }

    public float getPrecio() {
        return Precio;
    }
    public int getListaID() {
        return ListaID;
    }
    

    public void setArticuloID(int ArticuloID) {
        this.ArticuloID = ArticuloID;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public void setListaID(int ListaID) {
        this.ListaID = ListaID;
    }
}
package Model;
/**
 *
 * @author root4142
 */
public class Bodega {
    private int BodegaID;
    private String Nombre;

    public Bodega() {
        this.BodegaID = -1;
        this.Nombre = "";
    }

    public Bodega(int BodegaID, String Nombre) {
        this.BodegaID = BodegaID;
        this.Nombre = Nombre;
    }

    public int getBodegaID() {
        return BodegaID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setBodegaID(int BodegaID) {
        this.BodegaID = BodegaID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}

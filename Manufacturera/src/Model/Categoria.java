package Model;
/**
 *
 * @author root4142
 */
public class Categoria {
    private int CategoriaID;
    private String Nombre;

    public Categoria() {
        this.CategoriaID = -1;
        this.Nombre = "";
    }

    public Categoria(int CategoriaID, String Nombre) {
        this.CategoriaID = CategoriaID;
        this.Nombre = Nombre;
    }

    public int getCategoriaID() {
        return CategoriaID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setCategoriaID(int CategoriaID) {
        this.CategoriaID = CategoriaID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}

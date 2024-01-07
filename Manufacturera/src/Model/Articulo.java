package Model;

/**
 *
 * @author root4142
 */
public class Articulo {
    private int ArticuloID;
    private String Nombre;
    private String Tipo;
    private String ISV;
    private int CategoriaID;

    public Articulo() {
        this.ArticuloID = -1;
        this.Tipo="";
        this.Nombre = "";
        this.ISV = "";
        this.CategoriaID = -1;
    }

    public Articulo(int ArticuloID, String Nombre, String Tipo, String ISV, int CategoriaID) {
        this.ArticuloID = ArticuloID;
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.ISV = ISV;
        this.CategoriaID = CategoriaID;
    }

    
    public int getArticuloID() {
        return ArticuloID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getISV() {
        return ISV;
    }

    public int getCategoriaID() {
        return CategoriaID;
    }

    public String getTipo() {
        return Tipo;
    }

    

    public void setArticuloID(int ArticuloID) {
        this.ArticuloID = ArticuloID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setISV(String ISV) {
        this.ISV = ISV;
    }

    public void setCategoriaID(int CategoriaID) {
        this.CategoriaID = CategoriaID;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

}
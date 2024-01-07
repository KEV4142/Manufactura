/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author root4142
 */
public class ModeloCab {
    private int ModeloID;
    private String Nombre;
    private int ArticuloID;
    private int Cantidad;
    private String Estado;

    public ModeloCab() {
        this.ModeloID = -1;
        this.Nombre = "";
        this.ArticuloID = -1;
        this.Cantidad=-1;
        this.Estado = "";
    }

    public ModeloCab(int ModeloID, String Nombre, int ArticuloID, int Cantidad, String Estado) {
        this.ModeloID = ModeloID;
        this.Nombre = Nombre;
        this.ArticuloID = ArticuloID;
        this.Cantidad = Cantidad;
        this.Estado = Estado;
    }

    

    public int getModeloID() {
        return ModeloID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getEstado() {
        return Estado;
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

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setModeloID(int ModeloID) {
        this.ModeloID = ModeloID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    
}
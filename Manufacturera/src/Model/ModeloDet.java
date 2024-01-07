/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author root4142
 */
public class ModeloDet {
    private int ModeloID;
    private int ArticuloID;
    private int Cantidad;

    public ModeloDet() {
        this.ModeloID = -1;
        this.ArticuloID = -1;
        this.Cantidad =-1;
    }

    public ModeloDet(int modeloID, int ArticuloID, int Cantidad) {
        this.ModeloID = modeloID;
        this.ArticuloID = ArticuloID;
        this.Cantidad = Cantidad;
    }

    public int getArticuloID() {
        return ArticuloID;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public int getModeloID() {
        return ModeloID;
    }

    public void setArticuloID(int ArticuloID) {
        this.ArticuloID = ArticuloID;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setModeloID(int ModeloID) {
        this.ModeloID = ModeloID;
    }
    
}
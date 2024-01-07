/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author root4142
 */
public class OrdenCab {
    private int OrdenID;
    private String Fecha;
    private String Estado;
    private int MateriaBodegaID;
    private int ProductoBodegaID;
    private String Observacion;

    public OrdenCab() {
        this.OrdenID = -1;
        this.Fecha = "";
        this.MateriaBodegaID = -1;
        this.ProductoBodegaID = -1;
        this.Estado = "";
        Observacion="";
    }

    public OrdenCab(int OrdenID, String Fecha, String Estado, int MateriaBodegaID, int ProductoBodegaID, String Observacion) {
        this.OrdenID = OrdenID;
        this.Fecha = Fecha;
        this.Estado = Estado;
        this.MateriaBodegaID = MateriaBodegaID;
        this.ProductoBodegaID = ProductoBodegaID;
        this.Observacion = Observacion;
    }

    public String getObservacion() {
        return Observacion;
    }

    public int getProductoBodegaID() {
        return ProductoBodegaID;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

    public void setProductoBodegaID(int ProductoBodegaID) {
        this.ProductoBodegaID = ProductoBodegaID;
    }

    
    public int getOrdenID() {
        return OrdenID;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getEstado() {
        return Estado;
    }

    public int getMateriaBodegaID() {
        return MateriaBodegaID;
    }

    public void setMateriaBodegaID(int MateriaBodegaID) {
        this.MateriaBodegaID = MateriaBodegaID;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setOrdenID(int OrdenID) {
        this.OrdenID = OrdenID;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    
}
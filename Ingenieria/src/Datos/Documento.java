/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.Date;

/**
 *
 * @author Cóndor 2013
 */
public class Documento {
    
    String numero_doc;
    Date fecha_doc;
    String plazo;
    String ruta_doc;
    String objetivo_doc;
    int idProyecto;

    public Documento(String numero_doc, Date fecha_doc, String plazo, String ruta_doc, String objetivo_doc, int idProyecto) {
        this.numero_doc = numero_doc;
        this.fecha_doc = fecha_doc;
        this.plazo = plazo;
        this.ruta_doc = ruta_doc;
        this.objetivo_doc = objetivo_doc;
        this.idProyecto = idProyecto;
    }

    public String getNumero_doc() {
        return numero_doc;
    }

    public void setNumero_doc(String numero_doc) {
        this.numero_doc = numero_doc;
    }

    public Date getFecha_doc() {
        return fecha_doc;
    }

    public void setFecha_doc(Date fecha_doc) {
        this.fecha_doc = fecha_doc;
    }

    public String getPlazo() {
        return plazo;
    }

    public void setPlazo(String plazo) {
        this.plazo = plazo;
    }

    public String getRuta_doc() {
        return ruta_doc;
    }

    public void setRuta_doc(String ruta_doc) {
        this.ruta_doc = ruta_doc;
    }

    public String getObjetivo_doc() {
        return objetivo_doc;
    }

    public void setObjetivo_doc(String objetivo_doc) {
        this.objetivo_doc = objetivo_doc;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    
    
    
    
}

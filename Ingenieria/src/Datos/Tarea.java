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
public class Tarea {
    
    
    String control_tar;
    String detalle_tar;
    Date fecha_tar;
    int idproyecto;

    public Tarea(String control_tar, String detalle_tar, Date fecha_tar, int idproyecto) {
      
        this.control_tar = control_tar;
        this.detalle_tar = detalle_tar;
        this.fecha_tar = fecha_tar;
        this.idproyecto = idproyecto;
    }

  

    public String getControl_tar() {
        return control_tar;
    }

    public void setControl_tar(String control_tar) {
        this.control_tar = control_tar;
    }

    public String getDetalle_tar() {
        return detalle_tar;
    }

    public void setDetalle_tar(String detalle_tar) {
        this.detalle_tar = detalle_tar;
    }

    public Date getFecha_tar() {
        return fecha_tar;
    }

    public void setFecha_tar(Date fecha_tar) {
        this.fecha_tar = fecha_tar;
    }

    public int getIdproyecto() {
        return idproyecto;
    }

    public void setIdproyecto(int idproyecto) {
        this.idproyecto = idproyecto;
    }
    
    
    
    
    
    
}

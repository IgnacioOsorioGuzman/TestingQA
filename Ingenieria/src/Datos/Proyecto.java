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
public class Proyecto {
    
    String codigo_pro;
    int anioPro;
    String nombre_pro;
    Date fechaInicio;
    Date fechaPlazo;
    String avance_pro;
    String estado_pro;
    String prioridad_pro;
    String materialAereo_pro;
    int encargado;
    String nombreEncargado_pro;
    String descripcion_pro;
    int idPersona_pro;

    public Proyecto(String codigo_pro, int anioPro, String nombre_pro, Date fechaInicio, Date fechaPlazo, String avance_pro, String estado_pro, String prioridad_pro, String materialAereo_pro, int encargado, String nombreEncargado_pro, String descripcion_pro, int idPersona_pro) {
        this.codigo_pro = codigo_pro;
        this.anioPro = anioPro;
        this.nombre_pro = nombre_pro;
        this.fechaInicio = fechaInicio;
        this.fechaPlazo = fechaPlazo;
        this.avance_pro = avance_pro;
        this.estado_pro = estado_pro;
        this.prioridad_pro = prioridad_pro;
        this.materialAereo_pro = materialAereo_pro;
        this.encargado = encargado;
        this.nombreEncargado_pro = nombreEncargado_pro;
        this.descripcion_pro = descripcion_pro;
        this.idPersona_pro = idPersona_pro;
    }

    public String getNombreEncargado_pro() {
        return nombreEncargado_pro;
    }

    public void setNombreEncargado_pro(String nombreEncargado_pro) {
        this.nombreEncargado_pro = nombreEncargado_pro;
    }

   
    
    
    
    
    
    public int getAnioPro() {
        return anioPro;
    }

    public void setAnioPro(int anioPro) {
        this.anioPro = anioPro;
    }
    

    public String getCodigo_pro() {
        return codigo_pro;
    }

    public void setCodigo_pro(String codigo_pro) {
        this.codigo_pro = codigo_pro;
    }
 

    public String getNombre_pro() {
        return nombre_pro;
    }

    public void setNombre_pro(String nombre_pro) {
        this.nombre_pro = nombre_pro;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaPlazo() {
        return fechaPlazo;
    }

    public void setFechaPlazo(Date fechaPlazo) {
        this.fechaPlazo = fechaPlazo;
    }

    public String getAvance_pro() {
        return avance_pro;
    }

    public void setAvance_pro(String avance_pro) {
        this.avance_pro = avance_pro;
    }

 

    public String getEstado_pro() {
        return estado_pro;
    }

    public void setEstado_pro(String estado_pro) {
        this.estado_pro = estado_pro;
    }

    public String getPrioridad_pro() {
        return prioridad_pro;
    }

    public void setPrioridad_pro(String prioridad_pro) {
        this.prioridad_pro = prioridad_pro;
    }

    public String getMaterialAereo_pro() {
        return materialAereo_pro;
    }

    public void setMaterialAereo_pro(String materialAereo_pro) {
        this.materialAereo_pro = materialAereo_pro;
    }

    public int getEncargado() {
        return encargado;
    }

    public void setEncargado(int encargado) {
        this.encargado = encargado;
    }

    public String getDescripcion_pro() {
        return descripcion_pro;
    }

    public void setDescripcion_pro(String descripcion_pro) {
        this.descripcion_pro = descripcion_pro;
    }

    public int getIdPersona_pro() {
        return idPersona_pro;
    }

    public void setIdPersona_pro(int idPersona_pro) {
        this.idPersona_pro = idPersona_pro;
    }
    
    
    
    
    
}

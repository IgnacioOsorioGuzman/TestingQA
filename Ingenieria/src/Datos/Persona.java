/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Cóndor 2013
 */
public class Persona {
    
    private String ibm;
    private int idGrado;
    private int idEscalafon;
    private String nombre;
    private String apellido;
    private String correoInterno;
    private String correoExterno;
    private String anexo;
    private String celular;

    public Persona(String ibm, int idGrado, int idEscalafon, String nombre, String apellido, String correoInterno, String correoExterno, String anexo, String celular) {
        this.ibm = ibm;
        this.idGrado = idGrado;
        this.idEscalafon = idEscalafon;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoInterno = correoInterno;
        this.correoExterno = correoExterno;
        this.anexo = anexo;
        this.celular = celular;
    }
    
    
    
  

    public String getIbm() {
        return ibm;
    }

    public void setIbm(String ibm) {
        this.ibm = ibm;
    }

    public int getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(int idGrado) {
        this.idGrado = idGrado;
    }

    public int getIdEscalafon() {
        return idEscalafon;
    }

    public void setIdEscalafon(int idEscalafon) {
        this.idEscalafon = idEscalafon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoInterno() {
        return correoInterno;
    }

    public void setCorreoInterno(String correoInterno) {
        this.correoInterno = correoInterno;
    }

    public String getCorreoExterno() {
        return correoExterno;
    }

    public void setCorreoExterno(String correoExterno) {
        this.correoExterno = correoExterno;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    
    
    
}

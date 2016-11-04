
package Negocio;


public class Opcion {
    
    private String valor;
    private String descipcion;

  

    
    
    
    public Opcion(String valor, String descipcion) {
        this.valor = valor;
        this.descipcion = descipcion;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public String getValor() {
        return valor;
    }

    @Override 
    public String toString() {
        return  descipcion;
    }
    
    
    
    
    
}

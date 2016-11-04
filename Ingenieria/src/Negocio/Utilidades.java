
package Negocio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Utilidades {
    
    public static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}
    
    
    
    public static Date StringToDate (String fecha){
    
    SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy/MM/dd");
    Date aux = null;
    try {
       aux = formatoDelTexto.parse(fecha);
   } catch (Exception ex) {

    }

    return aux;
   
        
    }
    
    
    public static String formatDate(Date fecha){
    if(fecha == null) fecha = new Date();
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy/MM/dd");
        return formatoDelTexto.format(fecha);//que formatee la fecha en el formato anterior
    
    }
    
      
    public static String formatDate2(Date fecha){
    if(fecha == null) fecha = new Date();
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
        return formatoDelTexto.format(fecha);//que formatee la fecha en el formato anterior
    
    }
    
    
    
    //Convierte un objeto a entero
    
    public static int objectToInt(Object Obj) { 
        int NumInt = Integer.parseInt(objectToString(Obj)); return NumInt; 
    } 
    
    public static double objectToDouble(Object Obj) { 
        String Str = Obj.toString(); 
        double NumDouble = Double.valueOf(Str).doubleValue(); 
        return NumDouble; 
    }
    
    public static boolean objectToBoolean(Object Obj) { 
        String CadBooleana = objectToString(Obj); 
        Boolean booleano = new Boolean(CadBooleana); 
        return booleano; 
    } 
    
    public static String objectToString(Object Obj) { 
        String Str = ""; if (Obj != null) { 
            Str = Obj.toString(); 
        } 
    return Str; 
    }
    
    public static Date objectToDate(Object Obj) { 
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        Date aux = null;
        try {
            aux = formatoDelTexto.parse(objectToString(Obj));
        } catch (Exception ex) {
        }
        return aux;
    }
    
    
    
    
    
    
    
}

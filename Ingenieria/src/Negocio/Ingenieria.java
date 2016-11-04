/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Presentacion.frmLogin;
import javax.swing.UIManager;
import javax.swing.plaf.synth.SynthLookAndFeel;

/**
 *
 * @author Cóndor 2013
 */
public class Ingenieria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          try {
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
             
	} catch (Exception e) {
		e.printStackTrace();
	}
        
        
          
        Datos misDat = new Datos();
//        Datos misDatosa = new Datos();
        
        //Llamamos al formulario de Login
//        frmLogin miLogin = new frmLogin();
        
        frmLogin miLog = new frmLogin();
      
        miLog.setDatosLogin(misDat);       
        miLog.setLocationRelativeTo(null);
        miLog.setVisible(true);
        
        
    }
}

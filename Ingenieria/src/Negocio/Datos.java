/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

primer cambio
import Datos.*;
import Datos.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Cóndor 2013
 */





public class Datos {
    
    
    private static String servidor = "192.168.15.151";
    private static String nombreBD = "ingenieria";
    private static String usuario = "contrato";
    private static String clave = "Contrato_1930***";
    
//    private static String servidor = "localhost";
//    private static String nombreBD = "ingenieria";
//    private static String usuario = "root";
//    private static String clave = "";
    
    private static Connection CONEXION;
    
     private final String logo = "/Reportes/logo.JPG";
    private final String clog = "/Reportes/clog.png";
    
    public static boolean conectarIngenieria()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //String url = "jdbc:mysql://localhost:3306/tuto";
            String url = "jdbc:mysql://"+servidor+":3306/"+nombreBD;
            CONEXION = DriverManager.getConnection(url, usuario, clave);
            
        }catch(ClassNotFoundException ex){ex.printStackTrace();}        
        catch(SQLException ex){
            String msg = "";
            if(ex.getErrorCode() == 1049)
            {
                msg = "La base de datos: "+nombreBD+" no existe.";
            }else if(ex.getErrorCode() == 1044)
            {
                msg = "El usuario: "+usuario+" no existe.";
            }else if(ex.getErrorCode() == 1045)
            {
                msg = "Contraseña incorrecta.";
            }else if(ex.getErrorCode() == 0)
            {
                msg = "La conexion con la base de datos no se puede realizar.\nParece que el servidor de base de datos no esta activo.";
            }
            JOptionPane.showMessageDialog(null, msg, ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        
        if(CONEXION != null)
        {
             System.out.println("Estas Conectado a Ingenieria!");
             return true;
        }
        return false;
           
    }

    
    public Datos() {
        
         try {
            
            conectarIngenieria();           
           
            
        } catch (Exception ex) {
            System.out.print("Error: "+ex.getMessage());
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Se produjo un error al intentar conectarse","Error",JOptionPane.ERROR_MESSAGE);
            
        }
        
        
        
    }
    
    
     public boolean validarUsuario(String usuario, String clave) {

        try {
            
            String sql = "SELECT (1) FROM usuario WHERE "
                    + "nombre_usu = '"+ usuario + "' "
                    + "AND clave_usu = '" + clave + "' ";
          

            Statement st = CONEXION.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {  
                return true;
            } else {
                return false;
            }


        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }


    }
    
       public ResultSet getProyectos() {
        try {
            String sql;
           
            
             sql = "SELECT * from proyecto";
                    
            //Preparamos la consulta
            Statement st = (Statement) CONEXION.createStatement();
            //Ejecutamos la consulta
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            //En caso de error, se muestra en consola
            Logger.getLogger(Datos.class.getName()).log
                    (Level.SEVERE, null, ex);
            return null;
        }
    }
    
     
         public String getPerfil(String perfil) {
        try {
            String sql;
            sql = "Select perfil_usu from usuario where nombre_usu = '" + perfil + "' ";
            //Preparamos la consulta
            Statement st = CONEXION.createStatement();
            //Ejecutamos la consulta
            ResultSet rs = st.executeQuery(sql);
            //Preguntamos si encontro o no encontro
            if (rs.next()) {
                return rs.getString("perfil_usu");//devuelve del query el iderfil
            } else {
                return null; 
                // si hay un error devolvemos -1 significa que no existe y no
                //tengo ningun perfil
            }
        } catch (SQLException ex) {
            //En caso de error, lo muetsra en consola
            Logger.getLogger(Datos.class.getName()).log
                    (Level.SEVERE, null, ex);
            return null ;
        }

    }
     
     
      public ResultSet getConsulta(String sql) {
        try {
            //Preparamos la cpnsulta
            Statement st = CONEXION.createStatement();   
            //Retornamos la consulta que se ejecuto
            return st.executeQuery(sql);
            
        } catch (SQLException ex) {
            //En caso de error, lo mostramos en consola de netbeans
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
          //  JOptionPane.showMessageDialog(null, ex);
            //Retornamos Nulo
            return null;
        }
    }
    
    
      
         public boolean existeUsuario(String usuario) {
        try {
            String sql;
            sql = "Select (1) from usuario where nombre_usu = '"
                    + usuario + "' ";
            Statement st = (Statement) CONEXION.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) { //Si existe un usuario con ese cddo de usuario
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
      
    
           public String agregarUsuario(Usuario miUsuario) {
        try {
            String sql;
            sql = "insert into usuario (nombre_usu ,clave_usu, perfil_usu, idpersona)"
                    + " values ('" + miUsuario.getNombre()
                    + "','" + miUsuario.getClave()
                    + "','" + miUsuario.getPerfil()
                    + "'," + miUsuario.getIdPersona()
                    + ")";
            
            //Preparamos la consulta
            Statement st = (Statement) CONEXION.createStatement();
            //Ejecutamos la consulta
            st.executeUpdate(sql); 
            //Retornamos un String como informacion en pantalla
            return "Datos del Usuario Agregados Correctamente";
        } catch (SQLException ex) {
            //Retornamos el error en cosola
            Logger.getLogger(Datos.class.getName()).log
                    (Level.SEVERE, null, ex);
            //Retornamos un String en pantalla
            return "Error: "+ex;
        }
    }
          
               public String modificarUsuario(Usuario miUsuario) {
        try {
            //pasamos como parametro el usuario que queremos modificar 
            String sql;
            sql = "UPDATE usuario SET nombre_usu= '"+miUsuario.getNombre()
                    +"', clave_usu = '"+miUsuario.getClave()
                    +"', perfil_usu = '"+miUsuario.getPerfil()
                    +"', idpersona = "+miUsuario.getIdPersona()
                    +" where nombre_usu = '"+miUsuario.getNombre()+"' ";
                    
         
            //Preparamos la consulta
            Statement st = (Statement) CONEXION.createStatement();
            //Ejecutamos la consulta
            st.executeUpdate(sql);
            //Retorna mensaje por pantalla
            return "Datos del Usuario Modificados Correctamente";
        } catch (SQLException ex) {
            //En caso de error, se muestra en consola
            Logger.getLogger(Datos.class.getName()).log
                    (Level.SEVERE, null, ex);
            //Retorna mensaje por pantalla
            return "Error";
        }
    }
         
         
         
          public String borrarUsuario(String idusuario) {
        try {
            String sql;
            sql = "Delete From usuario Where "
                    + "idusuario = '" + idusuario + "' ";
            //Preparamos la consulta
            Statement st = (Statement) CONEXION.createStatement();
            //Ejecutamos la consulta
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Usuario Borrado Correctamente");
            //Retorna mensaje por pantalla
            return "Usuario Borrado Correctamente";
        } catch (SQLException ex) {
            //En caso de error, semuestra en consola
            Logger.getLogger(Datos.class.getName()).log
                    (Level.SEVERE, null, ex);
            //Retorna mensaje por pantalla
            return "Error al Borrar Usuario";
        }
    }  
          
          
          public boolean existeDocumento(String documento) {
        try {
            String sql;
            sql = "Select numero_doc from documento where "
                    + "numero_doc = '"+documento+"' ";
            //Preparamos la consulta
            Statement st = (Statement) CONEXION.createStatement();
            //Ejecutamos la consulta
            ResultSet rs = st.executeQuery(sql);
            //Si existe un proyecto retorna True sino False
            if (rs.next()) { 
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            //Mostramos en Error en la Consola de Netbeans
            Logger.getLogger(Datos.class.getName()).log
                    (Level.SEVERE, null, ex);
            //Retorna falso
            return false;
        }
    }
          
          
          
           public ResultSet getEncargado() {
        try {
            String sql;
            sql = "SELECT persona.idPersona, CONCAT(nombre_gra,' ',nombre_esc,' ',nombre_per,' ',apellido_per) "
                    + "AS 'encargado' "
                    + "FROM persona "
                    + "INNER JOIN escalafon ON escalafon.idEscalafon = persona.idEscalafon "
                    + "INNER JOIN grado ON grado.idGrado = persona.idGrado ";
                    
            //Preparamos la consulta
            Statement st = (Statement) CONEXION.createStatement();
            //Ejecutamos y retornamos la consulta
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            //En caso de error, lo muestra en consola
            Logger.getLogger(Datos.class.getName()).log
                    (Level.SEVERE, null, ex);
            return null;
        }
}
          
              
       public ResultSet getGrados() {
        try {
            String sql;
            sql = "SELECT * from grado";
            //Preparamos la consulta
            Statement st = (Statement) CONEXION.createStatement();
            //Ejecutamos y retornamos la consulta
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            //En caso de error, lo muestra en consola
            Logger.getLogger(Datos.class.getName()).log
                    (Level.SEVERE, null, ex);
            return null;
        }
}
       
          
         
          
       public ResultSet getEscalafon() {
        try {
            String sql;
            sql = "SELECT * from escalafon";
            //Preparamos la consulta
            Statement st = (Statement) CONEXION.createStatement();
            //Ejecutamos y retornamos la consulta
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            //En caso de error, lo muestra en consola
            Logger.getLogger(Datos.class.getName()).log
                    (Level.SEVERE, null, ex);
            return null;
        }
}
        
             
          public int numeroPersona() {
        try {
            String sql;
            sql = "select count(*) as num from persona";
            //Preparamos la consulta
            Statement st = (Statement) CONEXION.createStatement();
            //Ejecutamos la consulta
            ResultSet rs = st.executeQuery(sql);
            //si existen datos del numero de empleados en la tabla empleados, 
            //lo retornamos si no existe, retornamos 0
            if (rs.next()) {
                return rs.getInt("num");
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            //En caso de error, lo muestra en consola
            Logger.getLogger(Datos.class.getName()).log
                    (Level.SEVERE, null, ex);
            return 0;
        }
    }
          
          
           public boolean existeProyecto(String codigo_pro) {
        try {
            String sql;
            sql = "Select (1) from proyecto "
                    + "where codigo_pro = '" + codigo_pro + "' ";
            //Preparamos la consulta
            Statement st = (Statement) CONEXION.createStatement();
            //Ejecutamos la consulta
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) { //Si existe un usuario con ese codigo de usuario
                //retorna verdadero, sino falso
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            //En caso de error, muestra el error
            Logger.getLogger(Datos.class.getName()).log
                    (Level.SEVERE, null, ex);
            // y retorna falso
            return false;
        }

    }
          
            
          public boolean existePersona(String ibm) {
        try {
            String sql;
            sql = "Select (1) from persona "
                    + "where ibm_per = '" + ibm + "' ";
            //Preparamos la consulta
            Statement st = (Statement) CONEXION.createStatement();
            //Ejecutamos la consulta
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) { //Si existe un usuario con ese codigo de usuario
                //retorna verdadero, sino falso
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            //En caso de error, muestra el error
            Logger.getLogger(Datos.class.getName()).log
                    (Level.SEVERE, null, ex);
            // y retorna falso
            return false;
        }

    }
          
            public String agregarDocumento(Documento miDocumento) {
        try {
            String sql;
            sql = "insert into documento (numero_doc,fecha_doc,plazo,ruta_doc, objetivo_doc, idproyecto)"
                    + " values ('" + miDocumento.getNumero_doc()
                      + "','" + Utilidades.formatDate(miDocumento.getFecha_doc())
                    + "','" + miDocumento.getPlazo()
                  + "','" + miDocumento.getRuta_doc()
                     + "','" + miDocumento.getObjetivo_doc()
                    + "'," + miDocumento.getIdProyecto()
                    + ")";
            
            //Preparamos la consulta
            Statement st = (Statement) CONEXION.createStatement();
            //Ejecutamos la consulta
            st.executeUpdate(sql); 
            //Retornamos un String como informacion en pantalla
            return "Agregado Correctamente";
        } catch (SQLException ex) {
            //Retornamos el error en cosola
            Logger.getLogger(Datos.class.getName()).log
                    (Level.SEVERE, null, ex);
            //Retornamos un String en pantalla
            return "Error: "+ex;
        }
    }
          
           public String agregarTarea(Tarea miTarea) {
        try {
            String sql;
            sql = "insert into tarea (control_tar,detalle_tar,fecha_tar,idproyecto)"
                    + " values ('" + miTarea.getControl_tar()
                    + "','" + miTarea.getDetalle_tar()
                    + "','" + Utilidades.formatDate(miTarea.getFecha_tar())
                    + "'," + miTarea.getIdproyecto()
                    + ")";
            
            //Preparamos la consulta
            Statement st = (Statement) CONEXION.createStatement();
            //Ejecutamos la consulta
            st.executeUpdate(sql); 
            //Retornamos un String como informacion en pantalla
            return "Agregada Correctamente";
        } catch (SQLException ex) {
            //Retornamos el error en cosola
            Logger.getLogger(Datos.class.getName()).log
                    (Level.SEVERE, null, ex);
            //Retornamos un String en pantalla
            return "Error: "+ex;
        }
    }
          
             
         public String agregarPersona(Persona miPersona) {
        try {
            String sql;
            sql = "insert into persona (ibm_per,nombre_per,apellido_per,correoInterno_per,correoExterno_per,anexo_per,celular_per,idgrado,idescalafon)"
                    + " values ('" + miPersona.getIbm()
                    + "','" + miPersona.getNombre()
                    + "','" + miPersona.getApellido()
                    + "','" + miPersona.getCorreoInterno()
                    + "','" + miPersona.getCorreoExterno()
                    + "','" + miPersona.getAnexo()
                    + "','" + miPersona.getCelular()
                    + "'," + miPersona.getIdGrado()
                    + "," + miPersona.getIdEscalafon()
                    + ")";
            
            //Preparamos la consulta
            Statement st = (Statement) CONEXION.createStatement();
            //Ejecutamos la consulta
            st.executeUpdate(sql); 
            //Retornamos un String como informacion en pantalla
            return "Datos de la Persona Agregados Correctamente";
        } catch (SQLException ex) {
            //Retornamos el error en cosola
            Logger.getLogger(Datos.class.getName()).log
                    (Level.SEVERE, null, ex);
            //Retornamos un String en pantalla
            return "Error: "+ex;
        }
    }
         
         
           
         public String modificarPersona(Persona miPersona) {
        try {
            //pasamos como parametro el usuario que queremos modificar 
            String sql;
            sql = "UPDATE persona SET nombre_per= '"+miPersona.getNombre()
                    +"', apellido_per = '"+miPersona.getApellido()
                    +"', correoInterno_per = '"+miPersona.getCorreoInterno()
                    +"', correoExterno_per = '"+miPersona.getCorreoExterno()
                    +"', anexo_per = '"+miPersona.getAnexo()
                    +"', celular_per = '"+miPersona.getCelular()
                    +"', idgrado = "+miPersona.getIdGrado()
                    +", idescalafon = "+miPersona.getIdEscalafon()+" where ibm_per = '"+miPersona.getIbm()+"' ";
                    
         
            //Preparamos la consulta
            Statement st = (Statement) CONEXION.createStatement();
            //Ejecutamos la consulta
            st.executeUpdate(sql);
            //Retorna mensaje por pantalla
            return "Datos de la Persona Modificados Correctamente";
        } catch (SQLException ex) {
            //En caso de error, se muestra en consola
            Logger.getLogger(Datos.class.getName()).log
                    (Level.SEVERE, null, ex);
            //Retorna mensaje por pantalla
            return "Error";
        }
    }
         
         
           public String modificarProyectoJefeSubdivision(Proyecto miProyecto) {
        try {
            //pasamos como parametro el usuario que queremos modificar 
            String sql;
            sql = "UPDATE proyecto SET anio_pro = " + miProyecto.getAnioPro()
                    + ", nombre_pro = '" + miProyecto.getNombre_pro()
                    + "', inicio_pro = '" + Utilidades.formatDate(miProyecto.getFechaInicio())
                    + "', plazo_pro = '" + Utilidades.formatDate(miProyecto.getFechaPlazo())
                    + "', avance_pro = '" + miProyecto.getAvance_pro()
                    + "', estado_pro = '" + miProyecto.getEstado_pro()
                    + "', prioridad_pro = '" + miProyecto.getPrioridad_pro()
                    + "', material_pro = '" + miProyecto.getMaterialAereo_pro()
                    + "', encargado_pro = " + miProyecto.getEncargado()
                    + ", nom_encargado_pro = '" + miProyecto.getNombreEncargado_pro()
                    + "', descripcion_pro = '" + miProyecto.getDescripcion_pro()
                    + "', idPersona = " + miProyecto.getIdPersona_pro()
                    + " where codigo_pro = '" + miProyecto.getCodigo_pro() + "' ";

         
            //Preparamos la consulta
            Statement st = (Statement) CONEXION.createStatement();
            //Ejecutamos la consulta
            st.executeUpdate(sql);
            //Retorna mensaje por pantalla
            return "Datos del Proyecto Modificados Correctamente";
        } catch (SQLException ex) {
            //En caso de error, se muestra en consola
            Logger.getLogger(Datos.class.getName()).log
                    (Level.SEVERE, null, ex);
            //Retorna mensaje por pantalla
            return "Error";
        }
    }
         
           
           public String modificarDocumento(Documento miDocumento) {
        try {
            //pasamos como parametro el usuario que queremos modificar 
            String sql;
            sql = "UPDATE documento SET fecha_doc = '" + Utilidades.formatDate(miDocumento.getFecha_doc())
                    + "', plazo = '" + miDocumento.getPlazo()
                    + "', ruta_doc = '" + miDocumento.getRuta_doc()
                    + "', objetivo_doc = '" + miDocumento.getObjetivo_doc()
                    + "', idproyecto = " + miDocumento.getIdProyecto()
                  
                    + " where numero_doc = '" + miDocumento.getNumero_doc()+ "' ";

         
            //Preparamos la consulta
            Statement st = (Statement) CONEXION.createStatement();
            //Ejecutamos la consulta
            st.executeUpdate(sql);
            //Retorna mensaje por pantalla
            return "Documento Modificado Correctamente";
        } catch (SQLException ex) {
            //En caso de error, se muestra en consola
            Logger.getLogger(Datos.class.getName()).log
                    (Level.SEVERE, null, ex);
            //Retorna mensaje por pantalla
            return "Error";
        }
    }
         
         
            public String agregarProyectoJefeSubdivision(Proyecto miProyecto) {
        try {
            String sql;
            sql = "insert into proyecto (codigo_pro, anio_pro, nombre_pro, inicio_pro ,plazo_pro, "
                    + "avance_pro, estado_pro, "
                    + "prioridad_pro, material_pro, encargado_pro, nom_encargado_pro, descripcion_pro, idPersona) "
                    + "values ('" + miProyecto.getCodigo_pro()
                    + "'," + miProyecto.getAnioPro()
                    + ",'" + miProyecto.getNombre_pro()
                    + "','" + Utilidades.formatDate(miProyecto.getFechaInicio())
                    + "','" + Utilidades.formatDate(miProyecto.getFechaPlazo())
                    + "','" + miProyecto.getAvance_pro()
                    + "','" + miProyecto.getEstado_pro()
                    + "','" + miProyecto.getPrioridad_pro()
                    + "','" + miProyecto.getMaterialAereo_pro()
                    + "'," + miProyecto.getEncargado()
                    + ",'" + miProyecto.getNombreEncargado_pro()
                    + "','" + miProyecto.getDescripcion_pro()
                    + "'," + miProyecto.getIdPersona_pro()
                    + " )";
            
            
            //Preparamos la consulta
            Statement st = (Statement) CONEXION.createStatement();
            //Ejecutamos la consulta
            st.executeUpdate(sql); 
            //Retornamos un String como informacion en pantalla
            return "Proyecto Agregado Correctamente";
        } catch (SQLException ex) {
            //Retornamos el error en cosola
            Logger.getLogger(Datos.class.getName()).log
                    (Level.SEVERE, null, ex);
            //Retornamos un String en pantalla
            return "Error de sistema: "+ex;
        }
    }
          
            
//              public String modificarProyectoJefeSubdivision(Proyecto miProyecto) {
//        try {
//            //pasamos como parametro el usuario que queremos modificar 
//            String sql;
//            sql = "UPDATE proyecto SET nombre_pro = '" + miProyecto.getNombre_pro()
//                    + "', inicio_pro = '" + miProyecto.getFechaInicio()
//                    + "', plazo_pro = " + miProyecto.getFechaPlazo()
//                    + ", avance_pro = " + miProyecto.getAvance_pro()
//                    + ", estado_pro = '" + miProyecto.getEstado_pro()
//                    + "', prioridad_pro = '" + miProyecto.getPrioridad_pro()
//                    + "', material_pro = '" + miProyecto.getMaterialAereo_pro()
//                    + "', descripcion_pro = '" + miProyecto.getDescripcion_pro()
//                    + ", idpersona = " + miProyecto.getIdPersona_pro()
//                    
//                    + " where numero_con = '" + miProyecto.()+ "' ";
//
//
//            //Preparamos la consulta
//            Statement st = (Statement) CONEXION.createStatement();
//            //Ejecutamos la consulta
//            st.executeUpdate(sql);
//            //Retorna mensaje por pantalla
//            return "Contrato Modificado Correctamente";
//        } catch (SQLException ex) {
//            //En caso de error, se muestra en consola
//            Logger.getLogger(Datos.class.getName()).log
//                    (Level.SEVERE, null, ex);
//            //Retorna mensaje por pantalla
//            return "Error de Sistema "+ex;
//        }
//    }
//            
            
            
            
            
              
    public void reporteMemorandum(String codigo_pro) {

        try {
            conectarIngenieria();
//            javax.swing.JOptionPane.showMessageDialog(null, 
//                    "Conexion establecida");

           // String template = "src\\Reportes\\Memo.jasper";
            
//             String template = "\\src\\Reportes\\Memo.jrxml"; 
            
            String template = "src/Reportes/Memo.jasper";
            JasperReport report1 = null;
            report1 = (JasperReport) JRLoader.loadObject(template);

              Map parametros = new HashMap();             
          parametros.clear(); 
          
            //el nombre que se dio al parametro en JasperReport fue "p1", 
          //y se debe llamar desde Java con
          //ese mismo nombre, a su lado se pasa el valor del parametro
          parametros.put( "idProyecto", codigo_pro);     
          parametros.put( "logo",this.getClass().getResourceAsStream(logo));
            
            JasperPrint jasperprint = JasperFillManager.fillReport(report1, parametros, CONEXION);


            JasperViewer visor = new JasperViewer(jasperprint, false);
            visor.setTitle("Memorándum");
            visor.setVisible(true);

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e);
             Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
          
    
    
    
    
    public void reporteCronograma(String numero_pro) {

        try {
           conectarIngenieria();
//            javax.swing.JOptionPane.showMessageDialog(null, 
//                    "Conexion establecida");

            String template = "src/Reportes/Memo.jasper";
            JasperReport report1 = null;
            report1 = (JasperReport) JRLoader.loadObject(template);

            Map parametros = new HashMap();
            parametros.clear();

            //el nombre que se dio al parametro en JasperReport fue "p1", 
            //y se debe llamar desde Java con
            //ese mismo nombre, a su lado se pasa el valor del parametro
            parametros.put("numero_pro", numero_pro);
            parametros.put("logo", this.getClass().getResourceAsStream(clog));

            
            JasperPrint jasperprint = JasperFillManager.fillReport(report1, parametros, CONEXION);


            JasperViewer visor = new JasperViewer(jasperprint, false);
            visor.setTitle("Tareas");
            visor.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            visor.setVisible(true);


        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
    
    
    
}

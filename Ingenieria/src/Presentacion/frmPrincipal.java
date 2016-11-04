/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmPrincipal.java
 *
 * Created on 28-01-2013, 05:22:02 PM
 */
package Presentacion;


import Negocio.Datos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Dino
 */
public class frmPrincipal extends javax.swing.JFrame {

    public String miUsuarioLogeado = "";
    private String perfil; //Perfil del Usuario Logeado
    public static String clave;
    public static String usuario;
    public static Datos misDatos;

    public void setPerfil(String perfil) {
        this.perfil = perfil;

    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;

    }

    public void setClave(String clave) {
        this.clave = clave;

    }

    public void setDatosPrincipal(Datos misDatos) {
        this.misDatos = misDatos;

    }


    /** Creates new form frmPrincipal */
    public frmPrincipal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuUsuarios = new javax.swing.JMenu();
        mnuArchivoClientes = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuSalirUsu = new javax.swing.JMenuItem();
        mnuJefeSubdivision = new javax.swing.JMenu();
        mnuProJefeSub = new javax.swing.JMenuItem();
        mnuJefeDeptoModificaciones = new javax.swing.JMenu();
        mnuProJefeModificaciones = new javax.swing.JMenuItem();
        mnuEncargadoProyecto = new javax.swing.JMenu();
        mnuProEncargado = new javax.swing.JMenuItem();
        mnuReportes = new javax.swing.JMenu();
        mnuReporte1 = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenu();
        mnuArchivoCambioClave1 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnuArchivoSalir1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Subdivisión de Ingeniería");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        dpnEscritorio.setBackground(new java.awt.Color(204, 204, 204));

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1371709472_PatientData.png"))); // NOI18N
        mnuUsuarios.setText("Gestor de Usuarios");

        mnuArchivoClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        mnuArchivoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clientes.png"))); // NOI18N
        mnuArchivoClientes.setText("Usuarios");
        mnuArchivoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoClientesActionPerformed(evt);
            }
        });
        mnuUsuarios.add(mnuArchivoClientes);
        mnuUsuarios.add(jSeparator1);

        mnuSalirUsu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        mnuSalirUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        mnuSalirUsu.setText("Salir");
        mnuSalirUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirUsuActionPerformed(evt);
            }
        });
        mnuUsuarios.add(mnuSalirUsu);

        jMenuBar1.add(mnuUsuarios);

        mnuJefeSubdivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuarios.png"))); // NOI18N
        mnuJefeSubdivision.setText("Jefe Subdivisión");
        mnuJefeSubdivision.setToolTipText("Jefe Subdivisión");

        mnuProJefeSub.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnuProJefeSub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1371711478_kde-document-open.png"))); // NOI18N
        mnuProJefeSub.setText("Proyectos");
        mnuProJefeSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProJefeSubActionPerformed(evt);
            }
        });
        mnuJefeSubdivision.add(mnuProJefeSub);

        jMenuBar1.add(mnuJefeSubdivision);

        mnuJefeDeptoModificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuarios.png"))); // NOI18N
        mnuJefeDeptoModificaciones.setText("Jefe depto Modificaciones");
        mnuJefeDeptoModificaciones.setToolTipText("Jefe Modificaciones");

        mnuProJefeModificaciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnuProJefeModificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1371711478_kde-document-open.png"))); // NOI18N
        mnuProJefeModificaciones.setText("Proyectos");
        mnuProJefeModificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProJefeModificacionesActionPerformed(evt);
            }
        });
        mnuJefeDeptoModificaciones.add(mnuProJefeModificaciones);

        jMenuBar1.add(mnuJefeDeptoModificaciones);

        mnuEncargadoProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuarios.png"))); // NOI18N
        mnuEncargadoProyecto.setText("Encargado Proyecto");
        mnuEncargadoProyecto.setToolTipText("Encargado Proyecto");

        mnuProEncargado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        mnuProEncargado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1371711478_kde-document-open.png"))); // NOI18N
        mnuProEncargado.setText("Proyectos");
        mnuProEncargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProEncargadoActionPerformed(evt);
            }
        });
        mnuEncargadoProyecto.add(mnuProEncargado);

        jMenuBar1.add(mnuEncargadoProyecto);

        mnuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ReporteFactura.png"))); // NOI18N
        mnuReportes.setText("Reportes");
        mnuReportes.setToolTipText("Reportes");
        mnuReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuReportesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnuReportesMousePressed(evt);
            }
        });
        mnuReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReportesActionPerformed(evt);
            }
        });

        mnuReporte1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mnuReporte1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1371620154_Tracking_3D.png"))); // NOI18N
        mnuReporte1.setText("Ingenieria");
        mnuReporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReporte1ActionPerformed(evt);
            }
        });
        mnuReportes.add(mnuReporte1);

        jMenuBar1.add(mnuReportes);

        mnuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1371710064_cross.png"))); // NOI18N
        mnuSalir.setText("Salir");
        mnuSalir.setToolTipText("Salir");

        mnuArchivoCambioClave1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.ALT_MASK));
        mnuArchivoCambioClave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clave.png"))); // NOI18N
        mnuArchivoCambioClave1.setText("Cambio Clave");
        mnuArchivoCambioClave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoCambioClave1ActionPerformed(evt);
            }
        });
        mnuSalir.add(mnuArchivoCambioClave1);
        mnuSalir.add(jSeparator5);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N
        jMenuItem11.setText("Cerrar Sesión");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        mnuSalir.add(jMenuItem11);
        mnuSalir.add(jSeparator4);

        mnuArchivoSalir1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        mnuArchivoSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1371710064_cross.png"))); // NOI18N
        mnuArchivoSalir1.setText("Salir");
        mnuArchivoSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoSalir1ActionPerformed(evt);
            }
        });
        mnuSalir.add(mnuArchivoSalir1);

        jMenuBar1.add(mnuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirUsuActionPerformed

        System.exit(0);
        
    }//GEN-LAST:event_mnuSalirUsuActionPerformed

    private void mnuArchivoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoClientesActionPerformed

        frmPersona misUsuarios = new frmPersona();
        misUsuarios.setDatosPersona(misDatos);
        dpnEscritorio.add(misUsuarios);
        misUsuarios.show();
        
    }//GEN-LAST:event_mnuArchivoClientesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

      obtenerSesion();
        
      
        //Establece permisos
        if (perfil.equals("Administrador")) { // eliminamos permisos

            JOptionPane.showMessageDialog(rootPane, perfil);
        }

        if (perfil.equals("Jefe Subdivision")) { //eliminamos permisos

            JOptionPane.showMessageDialog(rootPane, perfil);
            mnuUsuarios.setEnabled(false);
            mnuJefeDeptoModificaciones.setEnabled(false);
            mnuEncargadoProyecto.setEnabled(false);
            


        }
        
         if (perfil.equals("Jefe Modificaciones")) { //eliminamos permisos

            JOptionPane.showMessageDialog(rootPane, perfil);
            mnuUsuarios.setEnabled(false);
            mnuJefeSubdivision.setEnabled(false);
            mnuEncargadoProyecto.setEnabled(false);


        }

        if (perfil.equals("Encargado Proyecto")) { //eliminamos permisos

            JOptionPane.showMessageDialog(rootPane, perfil);
            mnuUsuarios.setEnabled(false);
            mnuJefeSubdivision.setEnabled(false);
            mnuJefeDeptoModificaciones.setEnabled(false);
            mnuReportes.setEnabled(false);
        }

             
    }//GEN-LAST:event_formWindowOpened

       
    
    private void mnuProJefeSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProJefeSubActionPerformed

        frmJefeSubdivision miJefe = new frmJefeSubdivision(); // Creamos el objeto
        miJefe.setDatos(misDatos); //Enviamos los datos
        dpnEscritorio.add(miJefe);         //Adicionar al panel de escritorio al objeto
        miJefe.show(); //Mostramos formulario 
    }//GEN-LAST:event_mnuProJefeSubActionPerformed

    private void mnuProJefeModificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProJefeModificacionesActionPerformed
        
          frmJefeDeptoModificaciones miJefe = new frmJefeDeptoModificaciones(); // Creamos el objeto
        miJefe.setDatos(misDatos); //Enviamos los datos
        dpnEscritorio.add(miJefe);         //Adicionar al panel de escritorio al objeto
        miJefe.show(); //Mostramos formulario 
    }//GEN-LAST:event_mnuProJefeModificacionesActionPerformed

    private void mnuReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReportesActionPerformed

      
        
        
        
    }//GEN-LAST:event_mnuReportesActionPerformed

    private void mnuReportesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuReportesMousePressed
        
        
       
    }//GEN-LAST:event_mnuReportesMousePressed

    private void mnuReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuReportesMouseClicked

        
        
    }//GEN-LAST:event_mnuReportesMouseClicked

    private void mnuReporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReporte1ActionPerformed
        
            frmReportes miReporte = new frmReportes(); // Creamos el objeto
        miReporte.setDatos(misDatos); //Enviamos los datos
        dpnEscritorio.add(miReporte);         //Adicionar al panel de escritorio al objeto
        miReporte.show(); //Mostramos formulario 
        
    }//GEN-LAST:event_mnuReporte1ActionPerformed

    private void mnuProEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProEncargadoActionPerformed

            frmEncargadoProyecto miJefe = new frmEncargadoProyecto(); // Creamos el objeto
        miJefe.setDatos(misDatos); //Enviamos los datos
        dpnEscritorio.add(miJefe);         //Adicionar al panel de escritorio al objeto
        miJefe.show(); //Mostramos formulario 
        
        
    }//GEN-LAST:event_mnuProEncargadoActionPerformed

    private void mnuArchivoSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoSalir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuArchivoSalir1ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        this.setVisible(false);
        frmLogin miLogin = new frmLogin();
        miLogin.setDatosLogin(misDatos);
        miLogin.setLocationRelativeTo(null);
        miLogin.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void mnuArchivoCambioClave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoCambioClave1ActionPerformed

      
    }//GEN-LAST:event_mnuArchivoCambioClave1ActionPerformed

    
    private void obtenerSesion(){
          try {
              String sql = "SELECT nombre_gra, nombre_esc, nombre_per, apellido_per "
                      + "FROM persona INNER JOIN grado ON grado.idgrado = persona.idgrado "
                      + "INNER JOIN escalafon ON escalafon.idescalafon = persona.idescalafon "
                      + "INNER JOIN usuario ON usuario.idPersona = persona.idpersona "
                      + "WHERE nombre_usu = '"+frmPrincipal.usuario+"' ";
              
              ResultSet a = misDatos.getConsulta(sql);
              while (a.next()){
                  String usuarioLog = a.getString("nombre_gra")+' '+a.getString("nombre_esc")+' '+a.getString("nombre_per")+' '+a.getString("apellido_per") ;
                  JOptionPane.showMessageDialog(rootPane, usuarioLog);
                  miUsuarioLogeado = usuarioLog;
                  
              }
          } catch (SQLException ex) {
              Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
          }
        
        
        
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane dpnEscritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JMenuItem mnuArchivoCambioClave1;
    private javax.swing.JMenuItem mnuArchivoClientes;
    private javax.swing.JMenuItem mnuArchivoSalir1;
    private javax.swing.JMenu mnuEncargadoProyecto;
    private javax.swing.JMenu mnuJefeDeptoModificaciones;
    private javax.swing.JMenu mnuJefeSubdivision;
    private javax.swing.JMenuItem mnuProEncargado;
    private javax.swing.JMenuItem mnuProJefeModificaciones;
    private javax.swing.JMenuItem mnuProJefeSub;
    private javax.swing.JMenuItem mnuReporte1;
    private javax.swing.JMenu mnuReportes;
    private javax.swing.JMenu mnuSalir;
    private javax.swing.JMenuItem mnuSalirUsu;
    private javax.swing.JMenu mnuUsuarios;
    // End of variables declaration//GEN-END:variables

   
}

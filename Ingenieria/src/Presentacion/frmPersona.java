/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;



import Datos.Persona;
import Negocio.Datos;
import Negocio.Opcion;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author proyectos33
 */
public class frmPersona extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmUsuarios
     */
    
     private Datos misDatos; //
    private int PerActual = 0;
    private boolean nuevo = false;
    
    
    public void setDatosPersona(Datos misDatos) {
        this.misDatos = misDatos;

    }

    
     private void centrarVentana(){
    
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension ventana = getSize();
        
        setLocation((pantalla.width - ventana.width)/2, 0);
    
    }
    
    
    public frmPersona() {
        initComponents();
        centrarVentana();
    }

    
    //metodo para obtener nombre de persona y mandarlo al registro de acceso usuario
    public void obtenerPersona(){
        
        String ibm = txtIbm.getText().trim();
        String sql = "SELECT idpersona, ibm_per FROM persona WHERE ibm_per = '"+ibm+"' ";
        
        ResultSet a = misDatos.getConsulta(sql);
         try {
             while (a.next()){
                 int id = a.getInt("idpersona");
                 frmUsuario.idpersona = id;
                 frmUsuario.IBM=ibm;
                  
                 
                 
             }
         } catch (SQLException ex) {
             Logger.getLogger(frmPersona.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
    
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cmbGrado = new javax.swing.JComboBox();
        cmbEscalafon = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtIbm = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCorreoInterno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCorreoExterno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtAnexo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnPrimero = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnRegistrarAcesoSistema = new javax.swing.JButton();
        btnBuscarPersona = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Usuarios");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Personal", 0, 0, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Escalafon:");

        cmbGrado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmbGrado.setEnabled(false);

        cmbEscalafon.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmbEscalafon.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Nombres:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("IBM:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Correo Interno:");

        txtNombres.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNombres.setEnabled(false);

        txtIbm.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtIbm.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Grado:");

        txtCorreoInterno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCorreoInterno.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Apellidos:");

        txtApellidos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtApellidos.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Anexo:");

        txtCorreoExterno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCorreoExterno.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Correo Externo:");

        txtAnexo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtAnexo.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Celular:");

        txtCelular.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCelular.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNombres, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtIbm, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCorreoInterno)
                    .addComponent(txtAnexo, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbEscalafon, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(txtCorreoExterno)
                    .addComponent(txtCelular))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIbm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmbGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cmbEscalafon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCorreoInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtCorreoExterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtAnexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setText("Limpiar Todo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnPrimero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPrimero.setText("Primero");
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });

        btnAnterior.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSiguiente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnUltimo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnUltimo.setText("Ultimo");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnRegistrarAcesoSistema.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRegistrarAcesoSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1371710447_Manager.png"))); // NOI18N
        btnRegistrarAcesoSistema.setText("Registrar Acceso Sistema");
        btnRegistrarAcesoSistema.setEnabled(false);
        btnRegistrarAcesoSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAcesoSistemaActionPerformed(evt);
            }
        });

        btnBuscarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        btnBuscarPersona.setText("Buscar Persona");
        btnBuscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPersonaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPrimero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSiguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUltimo)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarPersona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarAcesoSistema))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimero)
                    .addComponent(btnAnterior)
                    .addComponent(btnSiguiente)
                    .addComponent(btnUltimo)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnModificar)
                    .addComponent(btnGuardar)
                    .addComponent(btnRegistrarAcesoSistema)
                    .addComponent(btnBuscarPersona))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        jMenu1.setText("Usuarios");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jMenuItem1.setText("Nuevo");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Modificar");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Eliminar");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reportes");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jMenuItem4.setText("Personas");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Usuarios");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

          Opcion opc = new Opcion("Na", "Seleccione Grado");
                 cmbGrado.addItem(opc);
                 ResultSet rsGra = misDatos.getGrados();
                 {
                     try {
                         while (rsGra.next()) {
                             opc = new Opcion(rsGra.getString("idGrado"),
                                        rsGra.getString("nombre_gra"));
                             
       
                                cmbGrado.addItem(opc);
                            }
                     } catch (SQLException ex) {
                         Logger.getLogger(frmPersona.class.getName()).log(Level.SEVERE, null, ex);
                     }
                    }
        
           opc = new Opcion("Na", "Seleccione Escalafon");
                 cmbEscalafon.addItem(opc);
                 ResultSet rsEsc = misDatos.getEscalafon();
                 {
                     try {
                         while (rsEsc.next()) {
                             opc = new Opcion(rsEsc.getString("idEscalafon"),
                                        rsEsc.getString("nombre_esc"));
                             
       
                                cmbEscalafon.addItem(opc);
                            }
                     } catch (SQLException ex) {
                         Logger.getLogger(frmPersona.class.getName()).log(Level.SEVERE, null, ex);
                     }
                    }
        
        
        
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        PerActual = 0;
       // mostrarRegistro();
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        PerActual--;
        if (PerActual == -1) {
            PerActual = misDatos.numeroPersona()- 1;
        }
     //   mostrarRegistro();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        PerActual++;
        if (PerActual == misDatos.numeroPersona()) {
            PerActual = 0;
        }
       // mostrarRegistro();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        PerActual = misDatos.numeroPersona() - 1;
      //  mostrarRegistro();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnRegistrarAcesoSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAcesoSistemaActionPerformed

        frmUsuario miUsuario = new frmUsuario(null, closable);
        miUsuario.setDatosUsu(misDatos);
         obtenerPersona();
        miUsuario.setLocationRelativeTo(this);
        miUsuario.setVisible(true);
                
    }//GEN-LAST:event_btnRegistrarAcesoSistemaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtIbm.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese IBM", "Error", JOptionPane.ERROR_MESSAGE);
            txtIbm.requestFocusInWindow();
            
            return;
        }
        
        if (nuevo) {
            if (misDatos.existePersona(txtIbm.getText())) {
                JOptionPane.showMessageDialog(null, "El IBM de la Persona Ya Existe");
                txtIbm.requestFocusInWindow();
                return;
            }


            btnRegistrarAcesoSistema.setEnabled(true);

        }
        
        
        
        if (txtNombres.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese Nombre", "Error", JOptionPane.ERROR_MESSAGE);
            txtNombres.requestFocusInWindow();
            
            return;
        }
        
        if (txtApellidos.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese Apellidos", "Error", JOptionPane.ERROR_MESSAGE);
            txtApellidos.requestFocusInWindow();
            
            return;
        }
        
        if (cmbGrado.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione Grado", "Error", JOptionPane.ERROR_MESSAGE);
            cmbGrado.requestFocusInWindow();
            
            return;
        }
        
        if (cmbEscalafon.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione Grado", "Error", JOptionPane.ERROR_MESSAGE);
            cmbEscalafon.requestFocusInWindow();
            
            return;
        }
        
        
        String ibm = txtIbm.getText();
        int grado = cmbGrado.getSelectedIndex();
        int escalafon = cmbEscalafon.getSelectedIndex();
        String nombre = txtNombres.getText();
        String apellido = txtApellidos.getText();
        String correoExterno = txtCorreoExterno.getText();
        String correoInterno = txtCorreoInterno.getText();
        String anexo = txtAnexo.getText();
        String celular = txtCelular.getText();
        
        
        Persona miPersona = new Persona(ibm, grado, escalafon, nombre, apellido, correoInterno, correoExterno, anexo, celular);
                
        
        
        
          String msg;
        if (nuevo) {
            msg = misDatos.agregarPersona(miPersona);
            JOptionPane.showMessageDialog(rootPane, msg);
        } else {
            msg = misDatos.modificarPersona(miPersona);
            JOptionPane.showMessageDialog(rootPane, msg);
        }         
                
                
        
        btnNuevo.setEnabled(true);
        btnGuardar.setEnabled(false);
        deshabilitarCampos();
        
        
        
        
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
         
        nuevo = true;
        habilitarCamposNuevo();
        
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBuscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPersonaActionPerformed

        
        btnGuardar.setEnabled(false);
        
        frmBuscarPersona miBusqueda = new frmBuscarPersona(null, closable);
        miBusqueda.setDatosPersona(misDatos);
        miBusqueda.setLocationRelativeTo(null);
        miBusqueda.setVisible(true);
        
        
    }//GEN-LAST:event_btnBuscarPersonaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        limpiarCampos();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        nuevo=false;
        habilitarCamposModificar();
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void deshabilitarCampos(){
        
         txtIbm.setEnabled(false);
         txtNombres.setEnabled(false);
         txtApellidos.setEnabled(false);
         txtCorreoInterno.setEnabled(false);
         txtCorreoExterno.setEnabled(false);
         txtAnexo.setEnabled(false);
         txtCelular.setEnabled(false);
        
         cmbGrado.setEnabled(false);
         cmbEscalafon.setEnabled(false);
    }
    
     private void habilitarCamposNuevo() {
        
         btnModificar.setEnabled(false);
         txtIbm.requestFocusInWindow();
         btnGuardar.setEnabled(true);
         btnRegistrarAcesoSistema.setEnabled(false);
         
         txtIbm.setEnabled(true);
         txtNombres.setEnabled(true);
         txtApellidos.setEnabled(true);
         txtCorreoInterno.setEnabled(true);
         txtCorreoExterno.setEnabled(true);
         txtAnexo.setEnabled(true);
         txtCelular.setEnabled(true);
     
         cmbGrado.setEnabled(true);
         cmbEscalafon.setEnabled(true);
         
         txtIbm.setText("");
         txtNombres.setText("");
         txtApellidos.setText("");
         txtCorreoInterno.setText("");
         txtCorreoExterno.setText("");
         txtAnexo.setText("");
         txtCelular.setText("");;
        
         cmbGrado.setSelectedIndex(0);
         cmbEscalafon.setSelectedIndex(0);
         
                 
    }
    
    public static void habilitarCamposModificar(){
        
        txtNombres.requestFocusInWindow();
        btnNuevo.setEnabled(false);
        btnGuardar.setEnabled(true);
        txtIbm.setEnabled(false);
        
          txtNombres.setEnabled(true);
         txtApellidos.setEnabled(true);
         txtCorreoInterno.setEnabled(true);
         txtCorreoExterno.setEnabled(true);
         txtAnexo.setEnabled(true);
         txtCelular.setEnabled(true);
         
         cmbGrado.setEnabled(true);
         cmbEscalafon.setEnabled(true);
        
    }
     
     
    private void limpiarCampos(){
           txtIbm.setText("");
         txtNombres.setText("");
         txtApellidos.setText("");
         txtCorreoInterno.setText("");
         txtCorreoExterno.setText("");
         txtAnexo.setText("");
         txtCelular.setText("");;
     
         cmbGrado.setSelectedIndex(0);
         cmbEscalafon.setSelectedIndex(0);
         txtIbm.requestFocusInWindow();
         
         btnNuevo.setEnabled(true);
         btnGuardar.setEnabled(false);
         btnModificar.setEnabled(false);
         btnRegistrarAcesoSistema.setEnabled(false);
         deshabilitarCampos();
         
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBuscarPersona;
    public static javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnModificar;
    public static javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPrimero;
    public static javax.swing.JButton btnRegistrarAcesoSistema;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    public static javax.swing.JComboBox cmbEscalafon;
    public static javax.swing.JComboBox cmbGrado;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField txtAnexo;
    public static javax.swing.JTextField txtApellidos;
    public static javax.swing.JTextField txtCelular;
    public static javax.swing.JTextField txtCorreoExterno;
    public static javax.swing.JTextField txtCorreoInterno;
    public static javax.swing.JTextField txtIbm;
    public static javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables

   
}


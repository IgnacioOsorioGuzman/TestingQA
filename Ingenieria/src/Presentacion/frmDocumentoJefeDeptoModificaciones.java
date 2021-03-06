/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;


import Datos.Documento;
import Datos.Tarea;
import Negocio.Datos;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author Cóndor 2013
 */
public class frmDocumentoJefeDeptoModificaciones extends javax.swing.JInternalFrame {

    public String nombrepro;
    public String codigopro;

    public void setNombrepro(String nombrepro) {
        this.nombrepro = nombrepro;
    }

    public void setCodigopro(String codigopro) {
        this.codigopro = codigopro;
    }
    
    
    
    
    private Datos misDatos;
    private boolean nuevo = false;
    public int idproyecto;

    public void setDatos(Datos misDatos) {
        this.misDatos = misDatos;
    }

    public void setIdproyecto(int idproyecto) {
        this.idproyecto = idproyecto;
    }
    
    
   
    
    
    public frmDocumentoJefeDeptoModificaciones() {
        initComponents();
        
        
       
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        btnNuevoStatus = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPlazoDoc = new javax.swing.JTextField();
        txtNumeroDoc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        dchFechaDoc = new com.toedter.calendar.JDateChooser();
        btnAbrirDocumento = new javax.swing.JButton();
        btnBuscarDocumento = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaObjetivo = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCodigoPro = new javax.swing.JTextField();
        txtNombrePro = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnNuevoStatus2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Documento");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnNuevoStatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevoStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nuevo.png"))); // NOI18N
        btnNuevoStatus.setText("Nuevo");
        btnNuevoStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoStatusActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle del Documento"));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("N° Documento:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Fecha:");

        txtPlazoDoc.setEnabled(false);

        txtNumeroDoc.setEnabled(false);
        txtNumeroDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNumeroDocMousePressed(evt);
            }
        });
        txtNumeroDoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumeroDocFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Plazo:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Ruta:");

        txtRuta.setEnabled(false);

        dchFechaDoc.setEnabled(false);
        dchFechaDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dchFechaDocKeyTyped(evt);
            }
        });

        btnAbrirDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1371711484_kde-document-open.png"))); // NOI18N
        btnAbrirDocumento.setText("Abrir Documento");
        btnAbrirDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirDocumentoActionPerformed(evt);
            }
        });

        btnBuscarDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/find.png"))); // NOI18N
        btnBuscarDocumento.setText("Buscar Documento");
        btnBuscarDocumento.setEnabled(false);
        btnBuscarDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDocumentoActionPerformed(evt);
            }
        });

        txaObjetivo.setColumns(20);
        txaObjetivo.setRows(5);
        txaObjetivo.setEnabled(false);
        jScrollPane2.setViewportView(txaObjetivo);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Objetivo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlazoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnBuscarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAbrirDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNumeroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dchFechaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtNumeroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(dchFechaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarDocumento)
                    .addComponent(btnAbrirDocumento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPlazoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Nombre Proyecto:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Codigo:");

        txtCodigoPro.setEnabled(false);

        txtNombrePro.setEnabled(false);

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnNuevoStatus2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevoStatus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        btnNuevoStatus2.setText("Buscar");
        btnNuevoStatus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoStatus2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevoStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevoStatus2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoStatus)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnNuevoStatus2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCodigoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void habilitarCampos() {
        
         btnNuevoStatus.setEnabled(false);
        btnGuardar.setEnabled(true);
        
        txaObjetivo.setEnabled(true);
        txtNumeroDoc.setEnabled(true);
        txtPlazoDoc.setEnabled(true);
        dchFechaDoc.setEnabled(true);
        btnBuscarDocumento.setEnabled(true);
        
               
    }

    private void limpiarCampos() {
              
  
       txtNumeroDoc.setText("");
       txaObjetivo.setText("");
        txtPlazoDoc.setText("");
       dchFechaDoc.setDate(new Date());
        txtRuta.setText("");
       txtNumeroDoc.requestFocusInWindow();
       
      
        
        
                
    }
    
    
       public static void desHabilitarCampos() {
        
         btnNuevoStatus.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnModificar.setEnabled(false);
        
        txaObjetivo.setEnabled(false);
         txtNumeroDoc.setEnabled(false);
        txtPlazoDoc.setEnabled(false);
        dchFechaDoc.setEnabled(false);
        
        btnBuscarDocumento.setEnabled(false);
        
        
    
    }
    
    
    private void btnNuevoStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoStatusActionPerformed

        habilitarCampos();
        limpiarCampos();
        //Activo el flag Nuevo
        nuevo = true;
        //Le damos foco al cmbUsuario
        txtNumeroDoc.requestFocusInWindow();
      
        
    }//GEN-LAST:event_btnNuevoStatusActionPerformed
private void centrarVentana(){
    
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension ventana = getSize();
        
        setLocation((pantalla.width - ventana.width)/2, (pantalla.height - ventana.height)/7);
    
    }
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       centrarVentana();
//    JOptionPane.showMessageDialog(rootPane, "Al abrir la ventana documento, ID PROYECTO "+idproyecto); 
    
    txtNombrePro.setText(nombrepro);
    txtCodigoPro.setText(codigopro);
        
    }//GEN-LAST:event_formInternalFrameOpened

    
     private void existeDocumento(){
        
        if (nuevo) {
            if (misDatos.existeDocumento(txtNumeroDoc.getText().trim())) {
                JOptionPane.showMessageDialog(null, "El Número de este Documento ya está Registrado");
                txtNumeroDoc.requestFocusInWindow();
                return;

            }
        } else {
            if (!misDatos.existeDocumento(txtNumeroDoc.getText())) {
                JOptionPane.showMessageDialog(null, "El Número No existe");
                txtNumeroDoc.requestFocusInWindow();
                return;
            }
        }

        
        
    }
    
    
    
    
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
 
        if (txtNumeroDoc.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese N° del Documento");
            txtNumeroDoc.requestFocusInWindow();
            return;          
        }
        
        if (dchFechaDoc.getDate()==(null)) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese Fecha del Documento");
            txtNumeroDoc.requestFocusInWindow();
            return;          
        }
        
                
        if (txaObjetivo.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese Objetivo del Documento");
            txaObjetivo.requestFocusInWindow();    
            return;
        }
        
        if (txtPlazoDoc.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese Plazo del Documento");
            txtPlazoDoc.requestFocusInWindow();    
            return;
        }
        
        
        
        
           
         //Crear el objeto miControl para enviar los datos a la clase Control
        
     
        String numero_doc = txtNumeroDoc.getText();
        Date fecha_doc = dchFechaDoc.getDate();
        String plazo = txtPlazoDoc.getText();
        String ruta_doc = txtRuta.getText(); 
        String objetivo_doc = txaObjetivo.getText(); 
        int idProyecto = idproyecto;
        
        
        Documento miDocumento = new Documento(numero_doc, fecha_doc, plazo, ruta_doc, objetivo_doc, idProyecto);
        
                
//        
         String msg;
        if (nuevo) {
            msg = misDatos.agregarDocumento(miDocumento);
            JOptionPane.showMessageDialog(rootPane,"Documento "+txtNumeroDoc.getText()+" "+msg);
        }
         else {
            msg = misDatos.modificarDocumento(miDocumento);
            JOptionPane.showMessageDialog(rootPane, msg);
        }
        
        // Desactivamos el flag
        nuevo = false;
        
        
//        limpiarCampos();
        desHabilitarCampos();
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void dchFechaDocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dchFechaDocKeyTyped

        String fecha = String.valueOf(dchFechaDoc.getDate());
        if (fecha.trim().length()>9)
        //trim elimina los espacios en blanco
        {
            evt.consume(); //no se deja ingresar mas caracteres
        }
    }//GEN-LAST:event_dchFechaDocKeyTyped

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       
        nuevo = false;
        dchFechaDoc.requestFocusInWindow();
        habilitarCampos();
        btnGuardar.setEnabled(true);
        txtNumeroDoc.setEnabled(false);
        
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnNuevoStatus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoStatus2ActionPerformed
       
        
           frmBuscarDocumentacionJefeDeptoModificaciones miBusqueda = new frmBuscarDocumentacionJefeDeptoModificaciones(null, closable);
        
           miBusqueda.setCodigo_pro(codigopro);
           miBusqueda.setDatos(misDatos);
        miBusqueda.setNombreProyecto(nombrepro);
        miBusqueda.setLocationRelativeTo(null);
        miBusqueda.setVisible(true);
        
    }//GEN-LAST:event_btnNuevoStatus2ActionPerformed

    private void btnBuscarDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDocumentoActionPerformed

        File archivo;
        JFileChooser abrirArchivo = new JFileChooser();
        abrirArchivo.setFileFilter(new FileNameExtensionFilter("Archivo", "docx","doc","xls","xlsx","pdf"));
        int respuesta = abrirArchivo.showOpenDialog(this);
        if(respuesta == JFileChooser.APPROVE_OPTION){

            archivo = abrirArchivo.getSelectedFile();
            String ruta = archivo.getAbsolutePath();
            String reemplazado = ruta.replace("\\","/");

                txtRuta.setText(reemplazado);

            }

    }//GEN-LAST:event_btnBuscarDocumentoActionPerformed

    private void btnAbrirDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirDocumentoActionPerformed
        
        
          String documento = txtRuta.getText();
            try {
                File file = new File(documento);
                if(!file.exists()){
                JOptionPane.showMessageDialog(rootPane, "Archivo No Existe","Error",JOptionPane.ERROR_MESSAGE);
                }
                else {
                Desktop.getDesktop().open(file);
                }
                
                
                
            } catch (IOException ex) {
                
            }
        
        
    }//GEN-LAST:event_btnAbrirDocumentoActionPerformed

    private void txtNumeroDocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroDocFocusLost
        
         existeDocumento();
        
    }//GEN-LAST:event_txtNumeroDocFocusLost

    private void txtNumeroDocMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumeroDocMousePressed
      
    }//GEN-LAST:event_txtNumeroDocMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirDocumento;
    public static javax.swing.JButton btnBuscarDocumento;
    public static javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnModificar;
    public static javax.swing.JButton btnNuevoStatus;
    private javax.swing.JButton btnNuevoStatus2;
    public static com.toedter.calendar.JDateChooser dchFechaDoc;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextArea txaObjetivo;
    public static javax.swing.JTextField txtCodigoPro;
    public static javax.swing.JTextField txtNombrePro;
    public static javax.swing.JTextField txtNumeroDoc;
    public static javax.swing.JTextField txtPlazoDoc;
    public static javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}

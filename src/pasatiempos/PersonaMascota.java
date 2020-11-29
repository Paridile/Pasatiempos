/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasatiempos;

import javax.swing.JOptionPane;

/**
 *
 * @author Uriel
 */
public class PersonaMascota extends javax.swing.JFrame {
    private ManejadorBD manejadorBD;

    /**
     * Creates new form PersonaMascota
     */
    public PersonaMascota() {
        setResizable(false);
        initComponents();
        manejadorBD = new ManejadorBD();
    	manejadorBD.conectarMySQL8("localhost", "pasatiempos", "root", "root", 3307);
        muestraVentana("personamascota", "");       
    }

        private void muestraVentana(String tabla, String condicion) {
        if(condicion != null && !condicion.equals("")) {
            if(manejadorBD.consultaRegistros(tabla, condicion) != 0) {
                muestraRegistroActual();
                botonEditar.setEnabled(true);
                botonBorrar.setEnabled(true);
                cambiaActivacionBotonesNavegacionRegistros(true);
            }
    	}
        else if(manejadorBD.consultaRegistros(tabla) != 0) {
            muestraRegistroActual();
            botonEditar.setEnabled(true);
            botonBorrar.setEnabled(true);
            cambiaActivacionBotonesNavegacionRegistros(true);
    	}
    }

       private void cambiaActivacionBotonesNavegacionRegistros(boolean estado) {
        botonPrimera.setEnabled(estado);
        botonSiguiente.setEnabled(estado);
        botonAnterior.setEnabled(estado);
        botonUltima.setEnabled(estado);
    } 
    
    private boolean validaCampos() {
        boolean correcto = true;
        try {
            Integer.parseInt(textIdPersona.getText());                    
        } catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this,
                    "Se debe introducir un valor entero para el Id del tipo de persona.",
                    "Error en el campo Id persona",
                    JOptionPane.ERROR_MESSAGE);
            correcto = false;
        }
        if(correcto) {
                if(textIdMascota.getText().equals("")) {
                    JOptionPane.showMessageDialog(this,
                        "Se debe introducir un valor entero para el Id del tipo de Mascota.",
                        "Error en el campo Id Mascota",
                        JOptionPane.ERROR_MESSAGE);
                    correcto = false;
                }   
        }
        if(correcto) {
                if(textfechaAdquisicion.getText().equals("")) {
                    JOptionPane.showMessageDialog(this,
                        "Se debe introducir la fecha de adquisicion de la Mascota.",
                        "Error en el campo Fecha de Adquisicion",
                        JOptionPane.ERROR_MESSAGE);
                    correcto = false;
                }
        }
        return correcto;
    }
    
    private void insertaRegistro(){
        cambiaActivacionCamposTexto(false);
        manejadorBD.insertarCampo("idPersona", textIdPersona.getText());
        manejadorBD.insertarCampo("idMascota", textIdMascota.getText());
        manejadorBD.insertarCampo("fechaAdquisicion", textfechaAdquisicion.getText());
    }
    
    private void muestraRegistroActual() {
    	if(manejadorBD.indiceActual() != 0) {
            manejadorBD.refrescaRegistroActual();
            textIdPersona.setText(manejadorBD.getCampoRegistroActual("idPersona").toString());
            textIdMascota.setText(manejadorBD.getCampoRegistroActual("idMascota").toString());
            textfechaAdquisicion.setText(manejadorBD.getCampoRegistroActual("fechaAdquisicion").toString());
            botonNueva.setEnabled(true);
            botonEditar.setEnabled(true);
            botonCancelar.setEnabled(false);
            botonBorrar.setEnabled(true);
            botonGuardar.setEnabled(false);
            botonActualizar.setEnabled(false);
            cambiaActivacionBotonesNavegacionRegistros(true);
        }
    	else {
            borraEntradasCamposTexto();
            botonNueva.setEnabled(true);
            botonEditar.setEnabled(false);
            botonBorrar.setEnabled(false);
            botonCancelar.setEnabled(false);
            botonGuardar.setEnabled(false);            
            cambiaActivacionBotonesNavegacionRegistros(false);
    	}
    }
    
    private void cambiaActivacionCamposTexto(boolean estado) {
        textIdPersona.setEnabled(estado);
        textIdMascota.setEnabled(estado);
        textfechaAdquisicion.setEnabled(estado);
    }
    
    private void borraEntradasCamposTexto() {
        textIdPersona.setText("");   
        textIdMascota.setText("");
        textfechaAdquisicion.setText("");        
    }
    
    private void nuevoRegistro() {
        borraEntradasCamposTexto();
        cambiaActivacionCamposTexto(true);
    }
    
    private void primerRegistro() {
    	manejadorBD.veAlPrimerRegistro();
    	muestraRegistroActual();
    }

    private void ultimoRegistro() {
    	manejadorBD.veAlUltimoRegistro();
    	muestraRegistroActual();
    }

    private void siguienteRegistro() {
    	manejadorBD.veAlSiguienteRegistro();
    	muestraRegistroActual();
    }

    private void anteriorRegistro() {
    	manejadorBD.veAlAnteriorRegistro();
    	muestraRegistroActual();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonNueva = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textIdPersona = new javax.swing.JTextField();
        textIdMascota = new javax.swing.JTextField();
        textfechaAdquisicion = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        botonPrimera = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        botonAnterior = new javax.swing.JButton();
        botonUltima = new javax.swing.JButton();
        botonNueva1 = new javax.swing.JButton();
        botonCancelar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        botonNueva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoNuevoRegistro.png"))); // NOI18N
        botonNueva.setMnemonic('N');
        botonNueva.setText("Nueva");
        botonNueva.setToolTipText("Activar edición de un registro nuevo de una persona");
        botonNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevaActionPerformed(evt);
            }
        });

        botonCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoCancelarEdicion.png"))); // NOI18N
        botonCancelar.setMnemonic('C');
        botonCancelar.setText("Cancelar");
        botonCancelar.setToolTipText("Cancelar edición del registro actual de una persona");
        botonCancelar.setEnabled(false);
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Persona Mascota");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("IdPersona");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("idMascota");

        textIdPersona.setEnabled(false);
        textIdPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdPersonaActionPerformed(evt);
            }
        });

        textIdMascota.setEnabled(false);
        textIdMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdMascotaActionPerformed(evt);
            }
        });

        textfechaAdquisicion.setEnabled(false);
        textfechaAdquisicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfechaAdquisicionActionPerformed(evt);
            }
        });

        botonGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoGuardarRegistro.png"))); // NOI18N
        botonGuardar.setMnemonic('G');
        botonGuardar.setText("Guardar");
        botonGuardar.setToolTipText("Guarda un registro de una relacion persona mascota");
        botonGuardar.setEnabled(false);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoActualizarRegistro.png"))); // NOI18N
        botonActualizar.setMnemonic('A');
        botonActualizar.setText("Actualizar");
        botonActualizar.setToolTipText("Actualizar registro actual de una relacion persona mascota");
        botonActualizar.setEnabled(false);
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        botonEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoEditarRegistro.png"))); // NOI18N
        botonEditar.setMnemonic('E');
        botonEditar.setText("Editar");
        botonEditar.setToolTipText("Activar edición del registro actual de de una relacion persona mascota");
        botonEditar.setEnabled(false);
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        botonPrimera.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonPrimera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoPrimerRegistro.png"))); // NOI18N
        botonPrimera.setMnemonic('P');
        botonPrimera.setText("Primera");
        botonPrimera.setToolTipText("Ver primer registro de una relacion persona mascota");
        botonPrimera.setEnabled(false);
        botonPrimera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPrimeraActionPerformed(evt);
            }
        });

        botonBorrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoBorrarRegistro.png"))); // NOI18N
        botonBorrar.setMnemonic('B');
        botonBorrar.setText("Borrar");
        botonBorrar.setToolTipText("Borrar registro actual de una relacion persona mascota");
        botonBorrar.setEnabled(false);
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        botonSiguiente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoSiguienteRegistro.png"))); // NOI18N
        botonSiguiente.setMnemonic('S');
        botonSiguiente.setText("Siguiente");
        botonSiguiente.setToolTipText("Ver siguiente registro de una relacion persona mascota");
        botonSiguiente.setEnabled(false);
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        botonAnterior.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoAnteriorRegistro.png"))); // NOI18N
        botonAnterior.setMnemonic('n');
        botonAnterior.setText("Anterior");
        botonAnterior.setToolTipText("Ver anterior registro de una relacion persona mascota");
        botonAnterior.setEnabled(false);
        botonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnteriorActionPerformed(evt);
            }
        });

        botonUltima.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonUltima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoUltimoRegistro.png"))); // NOI18N
        botonUltima.setMnemonic('\u00da');
        botonUltima.setText("Última");
        botonUltima.setToolTipText("Ver último registro de una relacion persona mascota");
        botonUltima.setEnabled(false);
        botonUltima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUltimaActionPerformed(evt);
            }
        });

        botonNueva1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonNueva1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoNuevoRegistro.png"))); // NOI18N
        botonNueva1.setMnemonic('N');
        botonNueva1.setText("Nueva");
        botonNueva1.setToolTipText("Activar edición de un registro nuevo de tipo persona mascota");
        botonNueva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNueva1ActionPerformed(evt);
            }
        });

        botonCancelar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoCancelarEdicion.png"))); // NOI18N
        botonCancelar1.setMnemonic('C');
        botonCancelar1.setText("Cancelar");
        botonCancelar1.setToolTipText("Cancelar edición del registro actual de una relacion persona mascota");
        botonCancelar1.setEnabled(false);
        botonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelar1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Fecha de adquisicion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonNueva1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(botonCancelar1)
                        .addGap(18, 18, 18)
                        .addComponent(botonBorrar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonPrimera)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonUltima)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonSiguiente))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(40, 40, 40)
                                        .addComponent(textIdPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(40, 40, 40)
                                .addComponent(jLabel4)
                                .addGap(39, 39, 39)
                                .addComponent(textfechaAdquisicion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 29, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textIdPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(textfechaAdquisicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(textIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNueva1)
                    .addComponent(botonGuardar)
                    .addComponent(botonBorrar)
                    .addComponent(botonEditar)
                    .addComponent(botonCancelar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonPrimera)
                    .addComponent(botonUltima)
                    .addComponent(botonSiguiente)
                    .addComponent(botonAnterior)
                    .addComponent(botonActualizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textIdPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIdPersonaActionPerformed

    private void botonNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevaActionPerformed
        nuevoRegistro();
        cambiaActivacionBotonesNavegacionRegistros(false);
        botonNueva.setEnabled(false);
        botonEditar.setEnabled(false);
        botonGuardar.setEnabled(true);
        botonBorrar.setEnabled(false);
        botonCancelar.setEnabled(true);
    }//GEN-LAST:event_botonNuevaActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        if(validaCampos()) {
            manejadorBD.iniciarBloque("personamascota");
            insertaRegistro();
            manejadorBD.cerrarBloque();
            JOptionPane.showMessageDialog(this, "Los datos del la tabla persona mascota han sido guardados.");
            manejadorBD.consultaRegistros("personamascota");
            cambiaActivacionBotonesNavegacionRegistros(true);
            botonNueva.setEnabled(true);
            botonGuardar.setEnabled(false);
            botonEditar.setEnabled(true);
            botonCancelar.setEnabled(false);
            botonBorrar.setEnabled(true);
        }
        else {
            JOptionPane.showMessageDialog(this,
                "No se pueden guardar los datos de la tabla persona mascota.",
                "Error al guardar los datos del tipo de la persona mascota",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this,
            "¿Desea actualizar el registro de la tabla persona mascota?",
            "Confirme su respuesta",
            JOptionPane.YES_NO_OPTION);
        if(respuesta == 0) {
            insertaRegistro();
            manejadorBD.actualizaRegistroActual();
            botonCancelar.setEnabled(false);
            botonActualizar.setEnabled(false);
            botonEditar.setEnabled(true);
            botonBorrar.setEnabled(true);
            botonNueva.setEnabled(true);
            cambiaActivacionBotonesNavegacionRegistros(true);
        }
        else {
            JOptionPane.showMessageDialog(this, "Se canceló la actualización de la tabla persona mascota");
        }
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        cambiaActivacionCamposTexto(true);
        botonNueva.setEnabled(false);
        botonBorrar.setEnabled(false);
        botonEditar.setEnabled(false);
        botonCancelar.setEnabled(true);
        botonActualizar.setEnabled(true);
        cambiaActivacionBotonesNavegacionRegistros(false);
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        cambiaActivacionCamposTexto(false);
        muestraRegistroActual();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonPrimeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrimeraActionPerformed
        primerRegistro();
    }//GEN-LAST:event_botonPrimeraActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this,
            "¿Desea eliminar el registro de la la tabla persona mascota?",
            "Confirme su respuesta",
            JOptionPane.YES_NO_OPTION);
        if(respuesta == 0) {
            manejadorBD.borraRegistroActual();
            siguienteRegistro();
        }
        else {
            JOptionPane.showMessageDialog(this, "Se canceló la eliminación de la tabla persona mascota");
        }
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        siguienteRegistro();
    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void botonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnteriorActionPerformed
        anteriorRegistro();
    }//GEN-LAST:event_botonAnteriorActionPerformed

    private void botonUltimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUltimaActionPerformed
        ultimoRegistro();
    }//GEN-LAST:event_botonUltimaActionPerformed

    private void botonNueva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNueva1ActionPerformed
        nuevoRegistro();
        cambiaActivacionBotonesNavegacionRegistros(false);
        botonNueva.setEnabled(false);
        botonEditar.setEnabled(false);
        botonGuardar.setEnabled(true);
        botonBorrar.setEnabled(false);
        botonCancelar.setEnabled(true);
    }//GEN-LAST:event_botonNueva1ActionPerformed

    private void botonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelar1ActionPerformed
        cambiaActivacionCamposTexto(false);
        muestraRegistroActual();
    }//GEN-LAST:event_botonCancelar1ActionPerformed

    private void textIdMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIdMascotaActionPerformed

    private void textfechaAdquisicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfechaAdquisicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfechaAdquisicionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonAnterior;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonCancelar1;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonNueva;
    private javax.swing.JButton botonNueva1;
    private javax.swing.JButton botonPrimera;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JButton botonUltima;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textIdMascota;
    private javax.swing.JTextField textIdPersona;
    private javax.swing.JTextField textfechaAdquisicion;
    // End of variables declaration//GEN-END:variables
}

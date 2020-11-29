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
public class PersonaPasatiempo extends javax.swing.JFrame {
    private ManejadorBD manejadorBD;

    /**
     * Creates new form PersonaMascota
     */
    public PersonaPasatiempo() {
        setResizable(false);
        initComponents();
        manejadorBD = new ManejadorBD();
    	manejadorBD.conectarMySQL8("localhost", "pasatiempos", "root", "root", 3307);
        muestraVentana("personapasatiempo", "");       
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
                if(textIdPasatiempo.getText().equals("")) {
                    JOptionPane.showMessageDialog(this,
                        "Se debe introducir un valor entero para el Id del tipo Pasatiempo.",
                        "Error en el campo Id Pasatiempo",
                        JOptionPane.ERROR_MESSAGE);
                    correcto = false;
                }   
        }
        if(correcto) {
                if(textaniosPasatiempo.getText().equals("")) {
                    JOptionPane.showMessageDialog(this,
                        "Se debe introducir los años del pasatiempo.",
                        "Error en el campo años del tiempo",
                        JOptionPane.ERROR_MESSAGE);
                    correcto = false;
                }
        }
        if(correcto) {
                if(texthorasPasatiempo.getText().equals("")) {
                    JOptionPane.showMessageDialog(this,
                        "Se debe introducir las horas del pasatiempo.",
                        "Error en el campo horas del tiempo",
                        JOptionPane.ERROR_MESSAGE);
                    correcto = false;
                }
        }
        return correcto;
    }
    
    private void insertaRegistro(){
        cambiaActivacionCamposTexto(false);
        manejadorBD.insertarCampo("idPersona", textIdPersona.getText());
        manejadorBD.insertarCampo("idMascota", textIdPasatiempo.getText());
        manejadorBD.insertarCampo("añosPasatiempo", textaniosPasatiempo.getText());
        manejadorBD.insertarCampo("horasSemana", texthorasPasatiempo.getText());
    }
    
    private void muestraRegistroActual() {
    	if(manejadorBD.indiceActual() != 0) {
            manejadorBD.refrescaRegistroActual();
            textIdPersona.setText(manejadorBD.getCampoRegistroActual("idPersona").toString());
            textIdPasatiempo.setText(manejadorBD.getCampoRegistroActual("idMascota").toString());
            textaniosPasatiempo.setText(manejadorBD.getCampoRegistroActual("añosPasatiempo").toString());
            texthorasPasatiempo.setText(manejadorBD.getCampoRegistroActual("horasSemana").toString());
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
        textIdPasatiempo.setEnabled(estado);
        textaniosPasatiempo.setEnabled(estado);
        texthorasPasatiempo.setEnabled(estado);
    }
    
    private void borraEntradasCamposTexto() {
        textIdPersona.setText("");   
        textIdPasatiempo.setText("");
        textaniosPasatiempo.setText("");
        texthorasPasatiempo.setText("");        
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
        textIdPasatiempo = new javax.swing.JTextField();
        texthorasPasatiempo = new javax.swing.JTextField();
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
        jLabel5 = new javax.swing.JLabel();
        textaniosPasatiempo = new javax.swing.JTextField();

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
        jLabel1.setText("Persona Pasatiempo");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("IdPersona");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("idPasatiempo");

        textIdPersona.setEnabled(false);
        textIdPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdPersonaActionPerformed(evt);
            }
        });

        textIdPasatiempo.setEnabled(false);
        textIdPasatiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdPasatiempoActionPerformed(evt);
            }
        });

        texthorasPasatiempo.setEnabled(false);
        texthorasPasatiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texthorasPasatiempoActionPerformed(evt);
            }
        });

        botonGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoGuardarRegistro.png"))); // NOI18N
        botonGuardar.setMnemonic('G');
        botonGuardar.setText("Guardar");
        botonGuardar.setToolTipText("Guarda un registro nuevo de tipo de mascota");
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
        botonActualizar.setToolTipText("Actualizar registro actual de tipo de mascota");
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
        botonEditar.setToolTipText("Activar edición del registro actual de tipo de mascota");
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
        botonPrimera.setToolTipText("Ver primer registro de tipo de mascota");
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
        botonBorrar.setToolTipText("Borrar registro actual de tipo de mascota");
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
        botonSiguiente.setToolTipText("Ver siguiente registro de tipo de mascota");
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
        botonAnterior.setToolTipText("Ver anterior registro de tipo de mascota");
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
        botonUltima.setToolTipText("Ver último registro de tipo de mascota");
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
        botonNueva1.setToolTipText("Activar edición de un registro nuevo de tipo de mascota");
        botonNueva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNueva1ActionPerformed(evt);
            }
        });

        botonCancelar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoCancelarEdicion.png"))); // NOI18N
        botonCancelar1.setMnemonic('C');
        botonCancelar1.setText("Cancelar");
        botonCancelar1.setToolTipText("Cancelar edición del registro actual de tipo de mascota");
        botonCancelar1.setEnabled(false);
        botonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelar1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Años Pasatiempo");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Horas Pasatiempo");

        textaniosPasatiempo.setEnabled(false);
        textaniosPasatiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textaniosPasatiempoActionPerformed(evt);
            }
        });

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
                                        .addComponent(textIdPasatiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(40, 40, 40)
                                        .addComponent(textIdPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textaniosPasatiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(texthorasPasatiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 29, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(220, 220, 220))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textIdPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textaniosPasatiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(textIdPasatiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(texthorasPasatiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76)
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
                .addContainerGap(12, Short.MAX_VALUE))
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
            manejadorBD.iniciarBloque("personapasatiempo");
            insertaRegistro();
            manejadorBD.cerrarBloque();
            JOptionPane.showMessageDialog(this, "Los datos del la tabla persona pasatiempo han sido guardados.");
            manejadorBD.consultaRegistros("personapasatiempo");
            cambiaActivacionBotonesNavegacionRegistros(true);
            botonNueva.setEnabled(true);
            botonGuardar.setEnabled(false);
            botonEditar.setEnabled(true);
            botonCancelar.setEnabled(false);
            botonBorrar.setEnabled(true);
        }
        else {
            JOptionPane.showMessageDialog(this,
                "No se pueden guardar los datos de la tabla persona pasatiempo.",
                "Error al guardar los datos del tipo de la persona pasatiempo",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this,
            "¿Desea actualizar el registro de la tabla persona pasatiempo?",
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
            JOptionPane.showMessageDialog(this, "Se canceló la actualización de la tabla persona pasatiempo");
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
            "¿Desea eliminar el registro de la la tabla persona pasatiempo?",
            "Confirme su respuesta",
            JOptionPane.YES_NO_OPTION);
        if(respuesta == 0) {
            manejadorBD.borraRegistroActual();
            siguienteRegistro();
        }
        else {
            JOptionPane.showMessageDialog(this, "Se canceló la eliminación de la tabla persona pasatiempo");
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

    private void textIdPasatiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdPasatiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIdPasatiempoActionPerformed

    private void texthorasPasatiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texthorasPasatiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texthorasPasatiempoActionPerformed

    private void textaniosPasatiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textaniosPasatiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textaniosPasatiempoActionPerformed


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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField textIdPasatiempo;
    private javax.swing.JTextField textIdPersona;
    private javax.swing.JTextField textaniosPasatiempo;
    private javax.swing.JTextField texthorasPasatiempo;
    // End of variables declaration//GEN-END:variables
}
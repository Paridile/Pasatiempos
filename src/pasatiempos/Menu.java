/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasatiempos;

import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author LABIAALAP1
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        setResizable(false);
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

        etiquetaSistema = new javax.swing.JLabel();
        etiquetaPortada = new javax.swing.JLabel();
        barraMenus = new javax.swing.JMenuBar();
        menuPersonas = new javax.swing.JMenu();
        menuOpcionAdministrarPersonas = new javax.swing.JMenuItem();
        menuOpcionAdministrarPasatiempos = new javax.swing.JMenuItem();
        menuOpcionAdministrarPersonaMascota = new javax.swing.JMenuItem();
        menuOpcionAdministrarPersonaPasatiempo = new javax.swing.JMenuItem();
        menuOpcionVerReportePersonas = new javax.swing.JMenuItem();
        menuOpcionVerReportePasatiempos = new javax.swing.JMenuItem();
        menuOpcionVerReportePersonaMascota = new javax.swing.JMenuItem();
        menuOpcionVerReportePersonaPasatiempo = new javax.swing.JMenuItem();
        menuMascotas = new javax.swing.JMenu();
        menuOpcionAdministrarMascotas = new javax.swing.JMenuItem();
        menuOpcionAdministrarTiposMascotas = new javax.swing.JMenuItem();
        menuOpcionGenerarReporteMascotas = new javax.swing.JMenuItem();
        menuOpcionGenerarReporteTipoMascota = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personas, Mascotas y Pasatiempos");

        etiquetaSistema.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        etiquetaSistema.setText("Sistema de Base de Datos");

        etiquetaPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenPortada.jpe"))); // NOI18N

        menuPersonas.setForeground(java.awt.Color.blue);
        menuPersonas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoMenuPersonas.png"))); // NOI18N
        menuPersonas.setMnemonic('P');
        menuPersonas.setText("Personas");
        menuPersonas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        menuOpcionAdministrarPersonas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuOpcionAdministrarPersonas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuOpcionAdministrarPersonas.setForeground(java.awt.Color.darkGray);
        menuOpcionAdministrarPersonas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoMenuOpcionAdministrarPersonas.png"))); // NOI18N
        menuOpcionAdministrarPersonas.setMnemonic('A');
        menuOpcionAdministrarPersonas.setText("Administrar Personas");
        menuOpcionAdministrarPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpcionAdministrarPersonasActionPerformed(evt);
            }
        });
        menuPersonas.add(menuOpcionAdministrarPersonas);

        menuOpcionAdministrarPasatiempos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        menuOpcionAdministrarPasatiempos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuOpcionAdministrarPasatiempos.setForeground(java.awt.Color.darkGray);
        menuOpcionAdministrarPasatiempos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuOpcionAdministrarPasatiempos.png"))); // NOI18N
        menuOpcionAdministrarPasatiempos.setMnemonic('d');
        menuOpcionAdministrarPasatiempos.setText("Administrar Pasatiempos");
        menuOpcionAdministrarPasatiempos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpcionAdministrarPasatiemposActionPerformed(evt);
            }
        });
        menuPersonas.add(menuOpcionAdministrarPasatiempos);

        menuOpcionAdministrarPersonaMascota.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuOpcionAdministrarPersonaMascota.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuOpcionAdministrarPersonaMascota.setForeground(java.awt.Color.darkGray);
        menuOpcionAdministrarPersonaMascota.setMnemonic('d');
        menuOpcionAdministrarPersonaMascota.setText("Administrar PersonaMascota");
        menuOpcionAdministrarPersonaMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpcionAdministrarPersonaMascotaActionPerformed(evt);
            }
        });
        menuPersonas.add(menuOpcionAdministrarPersonaMascota);

        menuOpcionAdministrarPersonaPasatiempo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        menuOpcionAdministrarPersonaPasatiempo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuOpcionAdministrarPersonaPasatiempo.setForeground(java.awt.Color.darkGray);
        menuOpcionAdministrarPersonaPasatiempo.setMnemonic('d');
        menuOpcionAdministrarPersonaPasatiempo.setText("Administrar PersonaPasatiempo");
        menuOpcionAdministrarPersonaPasatiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpcionAdministrarPersonaPasatiempoActionPerformed(evt);
            }
        });
        menuPersonas.add(menuOpcionAdministrarPersonaPasatiempo);

        menuOpcionVerReportePersonas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        menuOpcionVerReportePersonas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuOpcionVerReportePersonas.setForeground(java.awt.Color.darkGray);
        menuOpcionVerReportePersonas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reporte.png"))); // NOI18N
        menuOpcionVerReportePersonas.setText("Ver reporte de Personas");
        menuOpcionVerReportePersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpcionVerReportePersonasActionPerformed(evt);
            }
        });
        menuPersonas.add(menuOpcionVerReportePersonas);

        menuOpcionVerReportePasatiempos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuOpcionVerReportePasatiempos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuOpcionVerReportePasatiempos.setForeground(java.awt.Color.darkGray);
        menuOpcionVerReportePasatiempos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reporte.png"))); // NOI18N
        menuOpcionVerReportePasatiempos.setText("Ver reporte de Pasatiempos");
        menuOpcionVerReportePasatiempos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpcionVerReportePasatiemposActionPerformed(evt);
            }
        });
        menuPersonas.add(menuOpcionVerReportePasatiempos);

        menuOpcionVerReportePersonaMascota.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menuOpcionVerReportePersonaMascota.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuOpcionVerReportePersonaMascota.setForeground(java.awt.Color.darkGray);
        menuOpcionVerReportePersonaMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reporte.png"))); // NOI18N
        menuOpcionVerReportePersonaMascota.setText("Ver reporte de PersonaMascota");
        menuOpcionVerReportePersonaMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpcionVerReportePersonaMascotaActionPerformed(evt);
            }
        });
        menuPersonas.add(menuOpcionVerReportePersonaMascota);

        menuOpcionVerReportePersonaPasatiempo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        menuOpcionVerReportePersonaPasatiempo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuOpcionVerReportePersonaPasatiempo.setForeground(java.awt.Color.darkGray);
        menuOpcionVerReportePersonaPasatiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reporte.png"))); // NOI18N
        menuOpcionVerReportePersonaPasatiempo.setText("Ver reporte de PersonaPasatiempo");
        menuOpcionVerReportePersonaPasatiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpcionVerReportePersonaPasatiempoActionPerformed(evt);
            }
        });
        menuPersonas.add(menuOpcionVerReportePersonaPasatiempo);

        barraMenus.add(menuPersonas);

        menuMascotas.setForeground(java.awt.Color.blue);
        menuMascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoMenuMascotas.png"))); // NOI18N
        menuMascotas.setMnemonic('M');
        menuMascotas.setText("Mascotas");
        menuMascotas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        menuOpcionAdministrarMascotas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        menuOpcionAdministrarMascotas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuOpcionAdministrarMascotas.setForeground(java.awt.Color.darkGray);
        menuOpcionAdministrarMascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuOpcionAdministrarMascotas.png"))); // NOI18N
        menuOpcionAdministrarMascotas.setMnemonic('m');
        menuOpcionAdministrarMascotas.setText("Administrar Mascotas");
        menuOpcionAdministrarMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpcionAdministrarMascotasActionPerformed(evt);
            }
        });
        menuMascotas.add(menuOpcionAdministrarMascotas);

        menuOpcionAdministrarTiposMascotas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        menuOpcionAdministrarTiposMascotas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuOpcionAdministrarTiposMascotas.setForeground(java.awt.Color.darkGray);
        menuOpcionAdministrarTiposMascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuOpcionAdministrarTiposMascotas.png"))); // NOI18N
        menuOpcionAdministrarTiposMascotas.setMnemonic('i');
        menuOpcionAdministrarTiposMascotas.setText("Administrar Tipos de Mascotas");
        menuOpcionAdministrarTiposMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpcionAdministrarTiposMascotasActionPerformed(evt);
            }
        });
        menuMascotas.add(menuOpcionAdministrarTiposMascotas);

        menuOpcionGenerarReporteMascotas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuOpcionGenerarReporteMascotas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuOpcionGenerarReporteMascotas.setForeground(java.awt.Color.darkGray);
        menuOpcionGenerarReporteMascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reporte.png"))); // NOI18N
        menuOpcionGenerarReporteMascotas.setMnemonic('i');
        menuOpcionGenerarReporteMascotas.setText("Generar reporte mascotas");
        menuOpcionGenerarReporteMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpcionGenerarReporteMascotasActionPerformed(evt);
            }
        });
        menuMascotas.add(menuOpcionGenerarReporteMascotas);

        menuOpcionGenerarReporteTipoMascota.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuOpcionGenerarReporteTipoMascota.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuOpcionGenerarReporteTipoMascota.setForeground(java.awt.Color.darkGray);
        menuOpcionGenerarReporteTipoMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reporte.png"))); // NOI18N
        menuOpcionGenerarReporteTipoMascota.setMnemonic('i');
        menuOpcionGenerarReporteTipoMascota.setText("Generar reporte tipos de mascotas");
        menuOpcionGenerarReporteTipoMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpcionGenerarReporteTipoMascotaActionPerformed(evt);
            }
        });
        menuMascotas.add(menuOpcionGenerarReporteTipoMascota);

        barraMenus.add(menuMascotas);

        setJMenuBar(barraMenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(etiquetaSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(etiquetaPortada)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(etiquetaPortada)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuOpcionAdministrarPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpcionAdministrarPersonasActionPerformed
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personas().setVisible(true);
            }
        });
    }//GEN-LAST:event_menuOpcionAdministrarPersonasActionPerformed

    private void menuOpcionAdministrarMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpcionAdministrarMascotasActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mascota().setVisible(true);
            }
        });
    }//GEN-LAST:event_menuOpcionAdministrarMascotasActionPerformed

    private void menuOpcionVerReportePersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpcionVerReportePersonasActionPerformed
        creaJasper("reportePersonas");
    }//GEN-LAST:event_menuOpcionVerReportePersonasActionPerformed

    private void menuOpcionAdministrarPasatiemposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpcionAdministrarPasatiemposActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasaTiempo().setVisible(true);
            }
        });
    }//GEN-LAST:event_menuOpcionAdministrarPasatiemposActionPerformed

    private void menuOpcionAdministrarTiposMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpcionAdministrarTiposMascotasActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipoMascota().setVisible(true);
            }
        });
    }//GEN-LAST:event_menuOpcionAdministrarTiposMascotasActionPerformed

    private void menuOpcionGenerarReporteMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpcionGenerarReporteMascotasActionPerformed
        creaJasper("reporteMascotas");
    }//GEN-LAST:event_menuOpcionGenerarReporteMascotasActionPerformed

    private void menuOpcionAdministrarPersonaMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpcionAdministrarPersonaMascotaActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonaMascota().setVisible(true);
            }
        });
    }//GEN-LAST:event_menuOpcionAdministrarPersonaMascotaActionPerformed

    private void menuOpcionGenerarReporteTipoMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpcionGenerarReporteTipoMascotaActionPerformed
        creaJasper("reporteTipoMascota");
    }//GEN-LAST:event_menuOpcionGenerarReporteTipoMascotaActionPerformed

    private void menuOpcionVerReportePasatiemposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpcionVerReportePasatiemposActionPerformed
        creaJasper("reportePasatiempos");
    }//GEN-LAST:event_menuOpcionVerReportePasatiemposActionPerformed

    private void menuOpcionVerReportePersonaMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpcionVerReportePersonaMascotaActionPerformed
        creaJasper("reportePersonaMascota");
    }//GEN-LAST:event_menuOpcionVerReportePersonaMascotaActionPerformed

    private void menuOpcionAdministrarPersonaPasatiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpcionAdministrarPersonaPasatiempoActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonaPasatiempo().setVisible(true);
            }
        });
    }//GEN-LAST:event_menuOpcionAdministrarPersonaPasatiempoActionPerformed

    private void menuOpcionVerReportePersonaPasatiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpcionVerReportePersonaPasatiempoActionPerformed
       creaJasper("reportePersonaPasatiempo");
    }//GEN-LAST:event_menuOpcionVerReportePersonaPasatiempoActionPerformed

    public void creaJasper(String nombre){
        JasperPrint jasperPrint = null;
        try {
            ManejadorBD mbd = new ManejadorBD();
            mbd.conectarMySQL8("localhost", "pasatiempos", "root", "root", 3307);
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource(nombre + ".jasper"));
            jasperPrint = JasperFillManager.fillReport(jr, new HashMap(), 
                    mbd.getConexion());
            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
            jasperViewer.setVisible(true);
            mbd.cerrarConexion();
        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenus;
    private javax.swing.JLabel etiquetaPortada;
    private javax.swing.JLabel etiquetaSistema;
    private javax.swing.JMenu menuMascotas;
    private javax.swing.JMenuItem menuOpcionAdministrarMascotas;
    private javax.swing.JMenuItem menuOpcionAdministrarPasatiempos;
    private javax.swing.JMenuItem menuOpcionAdministrarPersonaMascota;
    private javax.swing.JMenuItem menuOpcionAdministrarPersonaPasatiempo;
    private javax.swing.JMenuItem menuOpcionAdministrarPersonas;
    private javax.swing.JMenuItem menuOpcionAdministrarTiposMascotas;
    private javax.swing.JMenuItem menuOpcionGenerarReporteMascotas;
    private javax.swing.JMenuItem menuOpcionGenerarReporteTipoMascota;
    private javax.swing.JMenuItem menuOpcionVerReportePasatiempos;
    private javax.swing.JMenuItem menuOpcionVerReportePersonaMascota;
    private javax.swing.JMenuItem menuOpcionVerReportePersonaPasatiempo;
    private javax.swing.JMenuItem menuOpcionVerReportePersonas;
    private javax.swing.JMenu menuPersonas;
    // End of variables declaration//GEN-END:variables
}

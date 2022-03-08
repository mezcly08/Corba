package cliente.vistas;

import cliente.vistas.GUILogin;
import java.awt.Color;
import javax.swing.JOptionPane;
import s_gestion_pacientes.sop_corba.GestionPersonal;
import s_gestion_pacientes.sop_corba.GestionPersonalHelper;
import org.omg.CosNaming.*;

import cliente.utilidades.UtilidadesConsola;
import javafx.scene.control.Menu;

import javax.rmi.CORBA.Util;

import org.omg.CORBA.*;

import s_gestion_pacientes.sop_corba.GestionPersonalPackage.credencialDTO;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTO;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTOHolder;

public class GUIRegistroCorba extends javax.swing.JFrame {
    private static GestionPersonal ref;
    Color objColorBG = new Color(38, 51, 68);
    int xMouse, yMouse;

    public GUIRegistroCorba() {
        initComponents();
        setLocationRelativeTo(null);
        TextPrompt textdireccionIp = new TextPrompt(" Ingrese la dirección ip", jtdireccionIp);
        TextPrompt textPuerto = new TextPrompt(" Ingrese el puerto", jtPuerto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBackground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtdireccionIp = new javax.swing.JTextField();
        jtPuerto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jsPuerto = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JLabel();
        lblFormatIde = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jpBackground.setBackground(new java.awt.Color(38, 51, 68));
        jpBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 51, 68)));
        jpBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro Corba");
        jpBackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¿Cual es el la direccion ip donde se encuentra  el N_S?");
        jpBackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¿Cual es el numero de puerto por el cual escucha el N_S?");
        jpBackground.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jtdireccionIp.setBackground(new java.awt.Color(38, 51, 68));
        jtdireccionIp.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jtdireccionIp.setForeground(new java.awt.Color(255, 255, 255));
        jtdireccionIp.setBorder(null);
        jtdireccionIp.setCaretColor(new java.awt.Color(255, 255, 255));
        jpBackground.add(jtdireccionIp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 230, 30));

        jtPuerto.setBackground(new java.awt.Color(38, 51, 68));
        jtPuerto.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jtPuerto.setForeground(new java.awt.Color(255, 255, 255));
        jtPuerto.setBorder(null);
        jtPuerto.setCaretColor(new java.awt.Color(255, 255, 255));
        jtPuerto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPuertoKeyTyped(evt);
            }
        });
        jpBackground.add(jtPuerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 230, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/location_25px.png"))); // NOI18N
        jpBackground.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 115, -1, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/usb_connector_25px.png"))); // NOI18N
        jpBackground.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jpBackground.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 280, 10));

        jsPuerto.setForeground(new java.awt.Color(255, 255, 255));
        jpBackground.add(jsPuerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 280, -1));

        jPanel5.setBackground(new java.awt.Color(38, 51, 68));
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel5MouseDragged(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(204, 204, 204));
        btnSalir.setText("    X");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 297, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jpBackground.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 330, 30));

        jPanel1.setBackground(new java.awt.Color(87, 197, 186));

        btnRegistrar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("      Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jpBackground.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 90, 30));

        lblFormatIde.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblFormatIde.setForeground(new java.awt.Color(255, 255, 255));
        jpBackground.add(lblFormatIde, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 280, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel5MouseDragged

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        
        int numPuertoNS = 0;
        String direccionIpNS = "";
        try {
            if (!existenCamposVacios()) {
                String[] vec = new String[4];
                vec[0] = "-ORBInitialPort";
                vec[1] = jtdireccionIp.getText();
                vec[2] = "-ORBInitialPort";
                vec[3] = jtPuerto.getText();

                // crea e inicia el ORB
                ORB orb = ORB.init(vec, null);

                // obtiene la base del naming context
                org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
                // usa NamingContextExt en lugar de NamingContext.Esto es
                // parte del Interoperable naming Service.
                NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

                // Resuelve la referencia del objeto en el N_S
                String name = "objRemotoPersonal";
                ref = GestionPersonalHelper.narrow(ncRef.resolve_str(name));

                System.out.println("Obtenido el manejador sobre el servidor deobjetos: " + ref);
                new GUILogin(ref).setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No pueden haber campos vacios");
            }
        } catch (Exception e) {
            System.out.println("ERROR : " + e);
            e.printStackTrace(System.out);
        }
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void jtPuertoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPuertoKeyTyped
        char num = evt.getKeyChar();
        if (!Character.isDigit(num)) {
            evt.consume();
            lblFormatIde.setText("*Debes ingresar valores númericos");
        } else {
            lblFormatIde.setText("");
        }
    }//GEN-LAST:event_jtPuertoKeyTyped

    private boolean existenCamposVacios() {
        if (jtdireccionIp.getText().isEmpty() || jtPuerto.getText().isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIRegistroCorba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIRegistroCorba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIRegistroCorba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIRegistroCorba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIRegistroCorba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnRegistrar;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel jpBackground;
    private javax.swing.JSeparator jsPuerto;
    private javax.swing.JTextField jtPuerto;
    private javax.swing.JTextField jtdireccionIp;
    private javax.swing.JLabel lblFormatIde;
    // End of variables declaration//GEN-END:variables
}

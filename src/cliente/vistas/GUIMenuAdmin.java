
package cliente.vistas;

import java.awt.BorderLayout;
import s_gestion_pacientes.sop_corba.AdminCllbckint;

import s_gestion_pacientes.sop_corba.GestionPersonal;
public class GUIMenuAdmin extends javax.swing.JFrame {
    
    private static GestionPersonal ref;
    private static AdminCllbckint ref2;
    private int IdPersonal;
    int xMouse, yMouse;
    
    public GUIMenuAdmin(GestionPersonal ref, AdminCllbckint ref2, String nomAdmin) {
        this.ref = ref;
        this.ref2 = ref2;
        initComponents();
        setLocationRelativeTo(null);
        this.lblRecepcionista.setText("Bienvenido "+nomAdmin);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPContenedor = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnRegistrarPersonal = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        lblRecepcionista = new javax.swing.JLabel();
        btnConsultarPersonal = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnSalir1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 51, 68)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPContenedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPContenedorLayout = new javax.swing.GroupLayout(jPContenedor);
        jPContenedor.setLayout(jPContenedorLayout);
        jPContenedorLayout.setHorizontalGroup(
            jPContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPContenedorLayout.setVerticalGroup(
            jPContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jPanel1.add(jPContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 500, 460));

        jPanel2.setBackground(new java.awt.Color(38, 51, 68));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarPersonal.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarPersonal.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnRegistrarPersonal.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/add_user_male_25px.png"))); // NOI18N
        btnRegistrarPersonal.setText("Registrar Personal");
        btnRegistrarPersonal.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnRegistrarPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarPersonalMouseClicked(evt);
            }
        });
        jPanel2.add(btnRegistrarPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 194, -1));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(38, 51, 68));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 214, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/businessman_50px.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        lblRecepcionista.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        lblRecepcionista.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lblRecepcionista, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 156, 22));

        btnConsultarPersonal.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnConsultarPersonal.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/search_property_25px.png"))); // NOI18N
        btnConsultarPersonal.setText("Consultar Personal");
        btnConsultarPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarPersonalMouseClicked(evt);
            }
        });
        jPanel2.add(btnConsultarPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(38, 51, 68));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 214, 10));

        btnSalir.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/cancel_25px.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator3.setForeground(new java.awt.Color(38, 51, 68));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 214, 10));

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator4.setForeground(new java.awt.Color(38, 51, 68));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 214, 10));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/logo.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 540));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
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

        btnSalir1.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnSalir1.setForeground(new java.awt.Color(51, 51, 51));
        btnSalir1.setText("    X");
        btnSalir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalir1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 297, Short.MAX_VALUE)
                .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 330, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarPersonalMouseClicked
        GUIRegistroPersonal jpRegistroUsuarios = new GUIRegistroPersonal(ref);
        jpRegistroUsuarios.setSize(410, 467);
        jpRegistroUsuarios.setLocation(5, 5);

        jPContenedor.removeAll();
        jPContenedor.add(jpRegistroUsuarios, BorderLayout.CENTER);
        jPContenedor.revalidate();
        jPContenedor.repaint();
    }//GEN-LAST:event_btnRegistrarPersonalMouseClicked

    private void btnConsultarPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarPersonalMouseClicked
        GUIConsultarPersonal jpRegistroUsuarios = new GUIConsultarPersonal(ref);
        jpRegistroUsuarios.setSize(410, 467);
        jpRegistroUsuarios.setLocation(5, 5);

        jPContenedor.removeAll();
        jPContenedor.add(jpRegistroUsuarios, BorderLayout.CENTER);
        jPContenedor.revalidate();
        jPContenedor.repaint();
    }//GEN-LAST:event_btnConsultarPersonalMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        dispose();
        new GUILogin(ref, ref2).setVisible(true);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalir1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalir1MouseClicked

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_jPanel5MouseDragged

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GUIMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GUIMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GUIMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GUIMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GUIMenuAdmin().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnConsultarPersonal;
    private javax.swing.JLabel btnRegistrarPersonal;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnSalir1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPContenedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblRecepcionista;
    // End of variables declaration//GEN-END:variables
}

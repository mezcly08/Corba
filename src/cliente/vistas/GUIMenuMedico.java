package cliente.vistas;

import cliente.AdminCllbckImpl;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import s_gestion_pacientes.sop_corba.AdminCllbckint;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTO;
import s_gestion_pacientes.sop_corba.GestionPersonal;

public class GUIMenuMedico extends javax.swing.JFrame {

    private static GestionPersonal ref;
    private static AdminCllbckint ref2;
    private static personalDTO objUsuario;
    int xMouse, yMouse;

    public GUIMenuMedico(GestionPersonal ref, AdminCllbckint ref2, personalDTO objUsuario) {
        this.ref = ref;
        this.ref2 = ref2;
        this.objUsuario = objUsuario;
        initComponents();
        setLocationRelativeTo(null);
        lblMedico.setText("Bienvenido " + objUsuario.nombreCompleto);
        lblOcupacion.setText(objUsuario.ocupacion);

        if (objUsuario.ocupacion.equals("Medico") || objUsuario.ocupacion.equals("Psicologa")) {
            btnSesiones.setVisible(false);
            btnInfoSesiones.setVisible(false);
            separador1.setVisible(false);
            separador2.setVisible(false);
        }
//        try {
//            System.out.println("***Registrando CallBack...");
//            AdminCllbckImpl objAdmin = new AdminCllbckImpl();
//            ref.registrarCallback(objAdmin);
//        } catch (RemoteException e) {
//            System.out.println("Error: Callback no se pudo completar " + e.getMessage());
//        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnValorPaciente = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        lblOcupacion = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        btnHistorialPaciente = new javax.swing.JLabel();
        btnSesiones = new javax.swing.JLabel();
        btnInfoSesiones = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        lblMedico = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPContenedor = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnRegistrarPersonal1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        lblRecepcionista1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        btnSalir1 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnSalir2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(38, 51, 68));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnValorPaciente.setBackground(new java.awt.Color(255, 255, 255));
        btnValorPaciente.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnValorPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnValorPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/medical_doctor_25px.png"))); // NOI18N
        btnValorPaciente.setText("Valorar Paciente");
        btnValorPaciente.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnValorPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnValorPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnValorPacienteMouseClicked(evt);
            }
        });
        jPanel2.add(btnValorPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 194, -1));

        separador2.setBackground(new java.awt.Color(102, 102, 102));
        separador2.setForeground(new java.awt.Color(38, 51, 68));
        jPanel2.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 214, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/businessman_50px.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        lblOcupacion.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        lblOcupacion.setForeground(new java.awt.Color(255, 255, 255));
        lblOcupacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 156, 22));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(38, 51, 68));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 214, 10));

        btnSalir.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/cancel_25px.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator4.setForeground(new java.awt.Color(38, 51, 68));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 214, 10));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/logo.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jSeparator9.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator9.setForeground(new java.awt.Color(38, 51, 68));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 214, 10));

        btnHistorialPaciente.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnHistorialPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorialPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/obituary_25px.png"))); // NOI18N
        btnHistorialPaciente.setText("Historial Paciente");
        btnHistorialPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHistorialPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHistorialPacienteMouseClicked(evt);
            }
        });
        jPanel2.add(btnHistorialPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 190, 30));

        btnSesiones.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnSesiones.setForeground(new java.awt.Color(255, 255, 255));
        btnSesiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/Logout_25px.png"))); // NOI18N
        btnSesiones.setText("Sesiones Paciente");
        btnSesiones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSesiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSesionesMouseClicked(evt);
            }
        });
        jPanel2.add(btnSesiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        btnInfoSesiones.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnInfoSesiones.setForeground(new java.awt.Color(255, 255, 255));
        btnInfoSesiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/resume_25px.png"))); // NOI18N
        btnInfoSesiones.setText("Info Sesiones");
        btnInfoSesiones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInfoSesiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInfoSesionesMouseClicked(evt);
            }
        });
        jPanel2.add(btnInfoSesiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 180, -1));

        separador1.setBackground(new java.awt.Color(102, 102, 102));
        separador1.setForeground(new java.awt.Color(38, 51, 68));
        jPanel2.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 214, 20));

        lblMedico.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        lblMedico.setForeground(new java.awt.Color(255, 255, 255));
        lblMedico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 156, 22));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 540));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 51, 68)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPContenedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPContenedorLayout = new javax.swing.GroupLayout(jPContenedor);
        jPContenedor.setLayout(jPContenedorLayout);
        jPContenedorLayout.setHorizontalGroup(
            jPContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPContenedorLayout.setVerticalGroup(
            jPContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jPanel1.add(jPContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 480, 490));

        jPanel3.setBackground(new java.awt.Color(38, 51, 68));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarPersonal1.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarPersonal1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnRegistrarPersonal1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarPersonal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/add_user_male_25px.png"))); // NOI18N
        btnRegistrarPersonal1.setText("Registrar Personal");
        btnRegistrarPersonal1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnRegistrarPersonal1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarPersonal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarPersonal1MouseClicked(evt);
            }
        });
        jPanel3.add(btnRegistrarPersonal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 194, -1));

        jSeparator5.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator5.setForeground(new java.awt.Color(38, 51, 68));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 214, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/businessman_50px.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        lblRecepcionista1.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        lblRecepcionista1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(lblRecepcionista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 156, 22));

        jSeparator6.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator6.setForeground(new java.awt.Color(38, 51, 68));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 214, 10));

        btnSalir1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnSalir1.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/cancel_25px.png"))); // NOI18N
        btnSalir1.setText("Salir");
        btnSalir1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalir1MouseClicked(evt);
            }
        });
        jPanel3.add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jSeparator7.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator7.setForeground(new java.awt.Color(38, 51, 68));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 214, 10));

        jSeparator8.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator8.setForeground(new java.awt.Color(38, 51, 68));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 214, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/logo.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 540));

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

        btnSalir2.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnSalir2.setForeground(new java.awt.Color(51, 51, 51));
        btnSalir2.setText("    X");
        btnSalir2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalir2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 297, Short.MAX_VALUE)
                .addComponent(btnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 330, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValorPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValorPacienteMouseClicked

//            if (ref.) { validacion que si existe pacientes
        GUIValoracionPaciente jpRegistroUsuarios = new GUIValoracionPaciente(ref, objUsuario);
        jpRegistroUsuarios.setSize(469, 443);
        jpRegistroUsuarios.setLocation(5, 5);

        jPContenedor.removeAll();
        jPContenedor.add(jpRegistroUsuarios, BorderLayout.CENTER);
        jPContenedor.revalidate();
        jPContenedor.repaint();
//            } else {
//                JOptionPane.showMessageDialog(null, "No hay pacientes para valorar!");
//            }

    }//GEN-LAST:event_btnValorPacienteMouseClicked


    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
//        try {
//            System.out.println("***Eliminando CallBack...");
//            AdminCllbckImpl objAdmin = new AdminCllbckImpl();
//            objRemoto.eliminarCallback(objAdmin);
//        } catch (RemoteException e) {
//            System.out.println("Error: Callback no se pudo completar " + e.getMessage());
//        }
        dispose();
        new GUILogin(ref, ref2).setVisible(true);

    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnRegistrarPersonal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarPersonal1MouseClicked
        GUIRegistrarPaciente jpRegistroUsuarios = new GUIRegistrarPaciente(ref);
        jpRegistroUsuarios.setSize(410, 467);
        jpRegistroUsuarios.setLocation(5, 5);

        jPContenedor.removeAll();
        jPContenedor.add(jpRegistroUsuarios, BorderLayout.CENTER);
        jPContenedor.revalidate();
        jPContenedor.repaint();
    }//GEN-LAST:event_btnRegistrarPersonal1MouseClicked

    private void btnSalir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalir1MouseClicked
        dispose();
        new GUILogin(ref,ref2).setVisible(true);
    }//GEN-LAST:event_btnSalir1MouseClicked

    private void btnSalir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalir2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalir2MouseClicked

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel5MouseDragged

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed

    private void btnHistorialPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistorialPacienteMouseClicked
        GUIConsultarValoracion jpRegistroUsuarios = new GUIConsultarValoracion(ref, objUsuario);
        jpRegistroUsuarios.setSize(469, 369);
        jpRegistroUsuarios.setLocation(5, 5);

        jPContenedor.removeAll();
        jPContenedor.add(jpRegistroUsuarios, BorderLayout.CENTER);
        jPContenedor.revalidate();
        jPContenedor.repaint();
    }//GEN-LAST:event_btnHistorialPacienteMouseClicked

    private void btnSesionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSesionesMouseClicked

        String idPaciente = JOptionPane.showInputDialog("Ingrese el id del paciente");

        boolean bandera = false;

        bandera = ref.validarEstadoPaciente(idPaciente);

        if (bandera) {
            JOptionPane.showMessageDialog(null, "El paciente se encuentra sano por lo tanto está inhabilitado.");
        } else {
            GUIFormFisio jpRegistroUsuarios = new GUIFormFisio(ref, objUsuario);
            jpRegistroUsuarios.setSize(471, 483);
            jpRegistroUsuarios.setLocation(5, 5);

            jPContenedor.removeAll();
            jPContenedor.add(jpRegistroUsuarios, BorderLayout.CENTER);
            jPContenedor.revalidate();
            jPContenedor.repaint();
        }
    }//GEN-LAST:event_btnSesionesMouseClicked

    private void btnInfoSesionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoSesionesMouseClicked
        GUIConsultarFormFisio jpRegistroUsuarios = new GUIConsultarFormFisio(ref, objUsuario);
        jpRegistroUsuarios.setSize(471, 483);
        jpRegistroUsuarios.setLocation(5, 5);

        jPContenedor.removeAll();
        jPContenedor.add(jpRegistroUsuarios, BorderLayout.CENTER);
        jPContenedor.revalidate();
        jPContenedor.repaint();
    }//GEN-LAST:event_btnInfoSesionesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnHistorialPaciente;
    private javax.swing.JLabel btnInfoSesiones;
    private javax.swing.JLabel btnRegistrarPersonal1;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnSalir1;
    private javax.swing.JLabel btnSalir2;
    private javax.swing.JLabel btnSesiones;
    private javax.swing.JLabel btnValorPaciente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPContenedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblMedico;
    private javax.swing.JLabel lblOcupacion;
    private javax.swing.JLabel lblRecepcionista1;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    // End of variables declaration//GEN-END:variables
}

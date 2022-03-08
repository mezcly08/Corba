package cliente.vistas;

import cliente.utilidades.UtilidadesConsola;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import s_gestion_pacientes.sop_corba.GestionPersonal;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.credencialDTO;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTOHolder;


public class GUILogin extends javax.swing.JFrame {

    private static GestionPersonal ref;
    int xMouse, yMouse;

    public GUILogin(GestionPersonal ref) {
        this.ref = ref;
        initComponents();
        setLocationRelativeTo(null);
        TextPrompt textUsuario = new TextPrompt(" Ingrese su usuario", jtUsuario);
        TextPrompt textContraseña = new TextPrompt(" Ingrese su contraseña", jtContrasena);
        TextPrompt textId = new TextPrompt(" Ingrese su identificación", jtIdentificacion);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtUsuario = new javax.swing.JTextField();
        Identificación = new javax.swing.JLabel();
        jtIdentificacion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JLabel();
        jtContrasena = new javax.swing.JPasswordField();
        lblFormatIde = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(87, 197, 186));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(38, 51, 68)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/Fundación.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 450));

        jPanel3.setBackground(new java.awt.Color(38, 51, 68));
        jPanel3.setForeground(new java.awt.Color(38, 51, 68));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Iniciar Sesión");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("USUARIO");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("CONTRASEÑA");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jtUsuario.setBackground(new java.awt.Color(38, 51, 68));
        jtUsuario.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jtUsuario.setBorder(null);
        jtUsuario.setCaretColor(new java.awt.Color(204, 204, 204));
        jPanel3.add(jtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 150, 210, 25));

        Identificación.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Identificación.setForeground(new java.awt.Color(204, 204, 204));
        Identificación.setText("IDENTIFICACIÓN");
        jPanel3.add(Identificación, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jtIdentificacion.setBackground(new java.awt.Color(38, 51, 68));
        jtIdentificacion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtIdentificacion.setForeground(new java.awt.Color(255, 255, 255));
        jtIdentificacion.setBorder(null);
        jtIdentificacion.setCaretColor(new java.awt.Color(204, 204, 204));
        jtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIdentificacionKeyTyped(evt);
            }
        });
        jPanel3.add(jtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 210, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/user_25px.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/password_25px.png"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/identification_documents_25px.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(87, 197, 186));
        jSeparator1.setForeground(new java.awt.Color(87, 197, 186));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 251, -1));

        jSeparator2.setBackground(new java.awt.Color(87, 197, 186));
        jSeparator2.setForeground(new java.awt.Color(87, 197, 186));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 251, 10));

        jSeparator3.setBackground(new java.awt.Color(87, 197, 186));
        jSeparator3.setForeground(new java.awt.Color(87, 197, 186));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 251, 10));

        jPanel4.setBackground(new java.awt.Color(87, 197, 186));

        btnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresar.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("           INGRESAR");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 130, 40));

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

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 330, 30));

        jtContrasena.setBackground(new java.awt.Color(38, 51, 68));
        jtContrasena.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtContrasena.setForeground(new java.awt.Color(255, 255, 255));
        jtContrasena.setBorder(null);
        jPanel3.add(jtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 210, 30));

        lblFormatIde.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblFormatIde.setForeground(new java.awt.Color(204, 204, 204));
        jPanel3.add(lblFormatIde, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 250, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 330, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
       System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_jPanel5MouseDragged

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        try {
            String user = jtUsuario.getText();
            String password = jtContrasena.getText();
            int id = Integer.parseInt(jtIdentificacion.getText());
            boolean login = false;
            credencialDTO varCredencial = new credencialDTO(user, password, id);
            login = ref.abrirSesion(varCredencial);
            if (login) {
                boolean resultado;
                personalDTOHolder objPersonal = new personalDTOHolder();
                resultado = ref.consultarPersonal(id, objPersonal);
                if (resultado == true && objPersonal != null) {
                    switch (objPersonal.value.ocupacion) {
                        case "Admin":
                            dispose();
                            new GUIMenuAdmin(ref,"Administrador").setVisible(true);
                            break;
                        case "Recepcionista":
                            dispose();
                            new GUIMenuRecepcionista(ref,varCredencial.usuario).setVisible(true);
                            break;
                        case "Psicologa":
                            //MenuValoracion();
                            break;
                        case "Medico":
                            //MenuValoracion();
                            break;
                        case "Fisioterapeuta":
                            //MenuFisio();
                            break;
                        default:
                            break;
                    }
                }
            } else {
                System.out.println("El personal " + user + " NO está autorizado para ingresar al sistema.");
                System.out.println("***Verificar que el Usuario y Clave sean correctas***");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void jtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdentificacionKeyTyped
      char num = evt.getKeyChar();
        if (!Character.isDigit(num)) {
            evt.consume();
            lblFormatIde.setText("*Debes ingresar valores númericos");
        } else {
            lblFormatIde.setText("");
        }
    }//GEN-LAST:event_jtIdentificacionKeyTyped
    
    private void LimpiarCampos() {
        this.jtUsuario.setText(null);
        this.jtContrasena.setText(null);
        this.jtIdentificacion.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Identificación;
    private javax.swing.JLabel btnIngresar;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPasswordField jtContrasena;
    private javax.swing.JTextField jtIdentificacion;
    private javax.swing.JTextField jtUsuario;
    private javax.swing.JLabel lblFormatIde;
    // End of variables declaration//GEN-END:variables
}

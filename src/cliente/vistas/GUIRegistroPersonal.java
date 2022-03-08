package cliente.vistas;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.omg.CORBA.BooleanHolder;
import s_gestion_pacientes.sop_corba.GestionPersonal;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTO;

public class GUIRegistroPersonal extends javax.swing.JPanel {

    private static GestionPersonal ref;

    public GUIRegistroPersonal(GestionPersonal ref) {
        this.ref = ref;
        initComponents();
        TextPrompt textNombre = new TextPrompt(" Ingrese el nombre completo", jTextNombre);
        TextPrompt textId = new TextPrompt(" Ingrese la ID", jTextIdentificacion);
        TextPrompt textUsuario = new TextPrompt(" Ingrese el usuario", jTextUsuario);
        TextPrompt textClave = new TextPrompt(" Ingrese la clave", jTextClave);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextIdentificacion = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        jTextClave = new javax.swing.JTextField();
        jTextUsuario = new javax.swing.JTextField();
        jfechaIngreso = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        cbxOcupacion = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbxTipoId = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnRegistrarPersonal = new javax.swing.JLabel();
        lblFormatIde = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Registro Personal");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Identificación");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Fecha de ingreso");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Profesión ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Clave");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jTextIdentificacion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextIdentificacion.setForeground(new java.awt.Color(51, 51, 51));
        jTextIdentificacion.setBorder(null);
        jTextIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextIdentificacionKeyTyped(evt);
            }
        });
        jPanel1.add(jTextIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 130, 20));

        jTextNombre.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextNombre.setForeground(new java.awt.Color(51, 51, 51));
        jTextNombre.setBorder(null);
        jPanel1.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 270, 20));

        jTextClave.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextClave.setForeground(new java.awt.Color(51, 51, 51));
        jTextClave.setBorder(null);
        jPanel1.add(jTextClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 330, 29));

        jTextUsuario.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextUsuario.setForeground(new java.awt.Color(51, 51, 51));
        jTextUsuario.setBorder(null);
        jPanel1.add(jTextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 330, 29));

        jfechaIngreso.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jfechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 290, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Nombre Completo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        cbxOcupacion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        cbxOcupacion.setForeground(new java.awt.Color(51, 51, 51));
        cbxOcupacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recepcionista", "Medico", "Psicologa", "Fisioterapeuta" }));
        jPanel1.add(cbxOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 330, 30));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Tipo Id");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        cbxTipoId.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        cbxTipoId.setForeground(new java.awt.Color(51, 51, 51));
        cbxTipoId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula de ciudania\t", "Tarjeta de identidad", "Pasaporte ", " " }));
        jPanel1.add(cbxTipoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 120, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 280, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 130, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 330, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 330, -1));

        jPanel2.setBackground(new java.awt.Color(87, 197, 186));

        btnRegistrarPersonal.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnRegistrarPersonal.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarPersonal.setText("         Registrar");
        btnRegistrarPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarPersonalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, 30));

        lblFormatIde.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        lblFormatIde.setForeground(new java.awt.Color(87, 197, 186));
        lblFormatIde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblFormatIdeKeyTyped(evt);
            }
        });
        jPanel1.add(lblFormatIde, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 184, 210, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarPersonalMouseClicked
        if (!existenCamposVacios()) {
            if (validarDatos()) {
                JOptionPane.showMessageDialog(null, "Error de datos ingresados.");
            } else {
//                boolean valor;
                personalDTO objPersonal = new personalDTO(cbxTipoId.getSelectedItem().toString(), Integer.parseInt(jTextIdentificacion.getText()),
                        jTextNombre.getText(), cbxOcupacion.getSelectedItem().toString(), jTextUsuario.getText(), jTextClave.getText());
                //personalDTO objPersonalAux = ref.consultarPersonal(WIDTH, objPersonal);
                BooleanHolder res = new BooleanHolder();
                ref.registrarPersonal(objPersonal, res);
                if (res.value == true) {
                    System.out.println("***Personal Registrado Exitosamente***");
                } else {
                    System.out.println("ERROR: NO se pudo registrar el Personal");
                }
                if (res.value == true) {
//                        PersonalDTO objUsuario = new PersonalDTO(cbxTipoId.getSelectedItem().toString(), Integer.parseInt(jTextIdentificacion.getText()),
//                                jTextNombre.getText(), cbxOcupacion.getSelectedItem().toString(), jTextUsuario.getText(), jTextClave.getText(),jfechaIngreso.getDate().toString());
//                        valor = objRemoto.registrarPersonal(objUsuario);
//                        if (valor) {
                    JOptionPane.showMessageDialog(null, "Personal registrado exitosamente!");
                    LimpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "Personal no registrado");
                }
//                    } else{
//                        JOptionPane.showMessageDialog(null, "El id "+objPersonal.getId()+" ya se encuentra en uso");
//                    }
            }

        } else {
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios");
        }
    }//GEN-LAST:event_btnRegistrarPersonalMouseClicked

    private void lblFormatIdeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblFormatIdeKeyTyped
        char num = evt.getKeyChar();
        if (!Character.isDigit(num)) {
            evt.consume();
            lblFormatIde.setText("*Debes ingresar valores númericos");
        } else {
            lblFormatIde.setText("");
        }
    }//GEN-LAST:event_lblFormatIdeKeyTyped

    private void jTextIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextIdentificacionKeyTyped
        char num = evt.getKeyChar();
        if (!Character.isDigit(num)) {
            evt.consume();
            lblFormatIde.setText("*Debes ingresar valores númericos");
        } else {
            lblFormatIde.setText("");
        }
    }//GEN-LAST:event_jTextIdentificacionKeyTyped

    private boolean existenCamposVacios() {

        if (jTextNombre.getText().isEmpty() || jTextIdentificacion.getText().isEmpty() || jTextUsuario.getText().isEmpty() || jTextClave.getText().isEmpty() || jfechaIngreso.getDate() == null) {
            return true;
        }
        return false;
    }

    private boolean validarDatos() {
        if (jTextNombre.getText().length() > 64 || Integer.parseInt(jTextIdentificacion.getText()) < 1 || jTextUsuario.getText().length() < 8 || jTextClave.getText().length() < 8) {
            return true;
        }
        return false;
    }

    private void LimpiarCampos() {
        this.jTextNombre.setText(null);
        this.jTextIdentificacion.setText(null);
        this.jTextUsuario.setText(null);
        this.jTextClave.setText(null);
        this.jfechaIngreso.setDate(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnRegistrarPersonal;
    private javax.swing.JComboBox<String> cbxOcupacion;
    private javax.swing.JComboBox<String> cbxTipoId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextClave;
    private javax.swing.JTextField jTextIdentificacion;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextUsuario;
    private com.toedter.calendar.JDateChooser jfechaIngreso;
    private javax.swing.JLabel lblFormatIde;
    // End of variables declaration//GEN-END:variables
}

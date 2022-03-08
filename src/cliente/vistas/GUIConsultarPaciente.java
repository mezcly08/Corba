package cliente.vistas;

import java.util.Date;
import javax.swing.JOptionPane;
import s_gestion_pacientes.sop_corba.GestionPersonal;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.PacienteDTO;

public class GUIConsultarPaciente extends javax.swing.JPanel {

    private static GestionPersonal ref;

    public GUIConsultarPaciente(GestionPersonal ref) {
        this.ref = ref;
        initComponents();
        TextPrompt textID = new TextPrompt(" Buscar un paciente", jTextIdentificacion);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextIdentificacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextNomPaciente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextIdPaciente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFechaIngresoPaciente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextOrdenPaciente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextHistoriaPaciente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnBuscarPaciente = new javax.swing.JLabel();
        lblFormatIde = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextIdentificacion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextIdentificacion.setBorder(null);
        jTextIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextIdentificacionKeyTyped(evt);
            }
        });
        jPanel1.add(jTextIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 200, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Nombre Completo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jTextNomPaciente.setEditable(false);
        jTextNomPaciente.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextNomPaciente.setBorder(null);
        jPanel1.add(jTextNomPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 180, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Identificacion:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jTextIdPaciente.setEditable(false);
        jTextIdPaciente.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextIdPaciente.setBorder(null);
        jPanel1.add(jTextIdPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 180, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Fecha Ingreso");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jTextFechaIngresoPaciente.setEditable(false);
        jTextFechaIngresoPaciente.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextFechaIngresoPaciente.setBorder(null);
        jPanel1.add(jTextFechaIngresoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 180, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Orden apoyo EPS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jTextOrdenPaciente.setEditable(false);
        jTextOrdenPaciente.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextOrdenPaciente.setBorder(null);
        jPanel1.add(jTextOrdenPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 180, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Historia Clinica");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jTextHistoriaPaciente.setEditable(false);
        jTextHistoriaPaciente.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextHistoriaPaciente.setBorder(null);
        jPanel1.add(jTextHistoriaPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 180, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Consultar Paciente");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 180, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 180, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 180, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 180, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 180, 10));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 200, 20));

        jPanel2.setBackground(new java.awt.Color(87, 197, 186));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarPaciente.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnBuscarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/search_15px.png"))); // NOI18N
        btnBuscarPaciente.setText(" Buscar");
        btnBuscarPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarPacienteMouseClicked(evt);
            }
        });
        jPanel2.add(btnBuscarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 0, 80, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 90, 30));

        lblFormatIde.setBackground(new java.awt.Color(87, 197, 186));
        lblFormatIde.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        lblFormatIde.setForeground(new java.awt.Color(87, 197, 186));
        jPanel1.add(lblFormatIde, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 200, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarPacienteMouseClicked
        int id = 0;
        if (!existenCamposVacios()) {
            try {
                boolean resultado;
                id = Integer.parseInt(jTextIdentificacion.getText());

                if (ref.existenPacientes(id)) {
                    PacienteDTO objPaciente = ref.consultarPaciente(id);
                    limpiarCampos();
                    jTextNomPaciente.setText(objPaciente.nombreCompleto);
                    jTextIdPaciente.setText(objPaciente.id + "");
                    jTextFechaIngresoPaciente.setText(objPaciente.fechaIngreso);
                    jTextOrdenPaciente.setText(objPaciente.ordenApoyo);
                    jTextHistoriaPaciente.setText(objPaciente.hostoriaClinica);
                } else {
                    JOptionPane.showMessageDialog(null, "Paciente NO encontrado");
                }
            } catch (Exception e) {
                System.out.println("La operacion no se pudo completar, intente nuevamente...");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios");
        }
    }//GEN-LAST:event_btnBuscarPacienteMouseClicked

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
        if (jTextIdentificacion.getText().isEmpty()) {
            return true;
        }
        return false;
    }

    private void limpiarCampos() {
        this.jTextIdentificacion.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuscarPaciente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextFechaIngresoPaciente;
    private javax.swing.JTextField jTextHistoriaPaciente;
    private javax.swing.JTextField jTextIdPaciente;
    private javax.swing.JTextField jTextIdentificacion;
    private javax.swing.JTextField jTextNomPaciente;
    private javax.swing.JTextField jTextOrdenPaciente;
    private javax.swing.JLabel lblFormatIde;
    // End of variables declaration//GEN-END:variables
}

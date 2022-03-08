package cliente.vistas;

import javax.swing.JOptionPane;
import s_gestion_pacientes.sop_corba.GestionPersonal;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTOHolder;

public class GUIConsultarPersonal extends javax.swing.JPanel {

    private static GestionPersonal ref;

    public GUIConsultarPersonal(GestionPersonal ref) {
        this.ref = ref;
        initComponents();
        TextPrompt textID = new TextPrompt(" Buscar un personal por ID", jTextIdentificacion);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextIdentificacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextUsuario = new javax.swing.JTextField();
        jTextTipoId = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextOcupacion = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jTextNoId = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnBuscarPersonal = new javax.swing.JLabel();
        lblFormatIde = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Consultar Personal");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, 40));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Identificación");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jTextIdentificacion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextIdentificacion.setBorder(null);
        jTextIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextIdentificacionKeyTyped(evt);
            }
        });
        add(jTextIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 170, 20));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("No. ID");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Nombre");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Ocupación");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Usuario");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jTextUsuario.setEditable(false);
        jTextUsuario.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextUsuario.setBorder(null);
        jPanel1.add(jTextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 250, 20));

        jTextTipoId.setEditable(false);
        jTextTipoId.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextTipoId.setBorder(null);
        jPanel1.add(jTextTipoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 250, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 250, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Tipo id");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jTextNombre.setEditable(false);
        jTextNombre.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextNombre.setBorder(null);
        jPanel1.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 250, 20));

        jTextOcupacion.setEditable(false);
        jTextOcupacion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextOcupacion.setBorder(null);
        jPanel1.add(jTextOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 250, 20));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 250, 20));

        jTextNoId.setEditable(false);
        jTextNoId.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextNoId.setBorder(null);
        jPanel1.add(jTextNoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 250, 20));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 250, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 250, 20));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 250, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 370, 260));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 170, 10));

        jPanel2.setBackground(new java.awt.Color(87, 197, 186));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarPersonal.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnBuscarPersonal.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/search_15px.png"))); // NOI18N
        btnBuscarPersonal.setText(" Buscar");
        btnBuscarPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarPersonalMouseClicked(evt);
            }
        });
        jPanel2.add(btnBuscarPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 0, 80, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 90, 30));

        lblFormatIde.setBackground(new java.awt.Color(87, 197, 186));
        lblFormatIde.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        lblFormatIde.setForeground(new java.awt.Color(87, 197, 186));
        add(lblFormatIde, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 190, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarPersonalMouseClicked
        int id = 0;
        if (!existenCamposVacios()) {
            try {
                boolean resultado;
                id = Integer.parseInt(jTextIdentificacion.getText());

                if (ref.consulPersonal(id)) {
                    personalDTOHolder objPersonal = new personalDTOHolder();
                    resultado = ref.consultarPersonal(id, objPersonal);
                    limpiarCampos();
                    jTextNoId.setText(objPersonal.value.id + "");
                    jTextNombre.setText(objPersonal.value.nombreCompleto);
                    jTextOcupacion.setText(objPersonal.value.ocupacion);
                    jTextTipoId.setText(objPersonal.value.tipo_id);
                    jTextUsuario.setText(objPersonal.value.usuario);
                } else {
                    JOptionPane.showMessageDialog(null, "Personal NO encontrado");
                }
            } catch (Exception e) {
                System.out.println("La operacion no se pudo completar, intente nuevamente...");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios");
        }
    }//GEN-LAST:event_btnBuscarPersonalMouseClicked

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
    private javax.swing.JLabel btnBuscarPersonal;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextIdentificacion;
    private javax.swing.JTextField jTextNoId;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextOcupacion;
    private javax.swing.JTextField jTextTipoId;
    private javax.swing.JTextField jTextUsuario;
    private javax.swing.JLabel lblFormatIde;
    // End of variables declaration//GEN-END:variables
}

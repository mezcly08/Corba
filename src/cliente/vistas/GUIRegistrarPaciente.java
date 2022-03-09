package cliente.vistas;

import javax.swing.JOptionPane;
import s_gestion_pacientes.sop_corba.GestionPersonal;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.PacienteDTO;

public class GUIRegistrarPaciente extends javax.swing.JPanel {

    private static GestionPersonal ref;

    public GUIRegistrarPaciente(GestionPersonal ref) {
        this.ref = ref;
        initComponents();
        TextPrompt textNombre = new TextPrompt(" Ingrese el nombre completo", jtNombreCompleto);
        TextPrompt textID = new TextPrompt(" Ingrese la ID", jtIdentificacion);
        TextPrompt textOrden = new TextPrompt(" Ingrese el codigo de la Orden", jtOrdenEps);
        TextPrompt textHistoria = new TextPrompt(" Ingrese el codigo de la Historia", jtHistoriaClinica);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtNombreCompleto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtIdentificacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jdcFechaIngreso = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jtOrdenEps = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtHistoriaClinica = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnRegistrarPaciente = new javax.swing.JLabel();
        lblFormatIde = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Nombre completo");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jtNombreCompleto.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtNombreCompleto.setForeground(new java.awt.Color(51, 51, 51));
        jtNombreCompleto.setBorder(null);
        add(jtNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 220, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Identificación");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jtIdentificacion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtIdentificacion.setForeground(new java.awt.Color(51, 51, 51));
        jtIdentificacion.setBorder(null);
        jtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIdentificacionKeyTyped(evt);
            }
        });
        add(jtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 220, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Fecha de Ingreso");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));
        add(jdcFechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 219, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Orden de apoyo EPS");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jtOrdenEps.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtOrdenEps.setForeground(new java.awt.Color(51, 51, 51));
        jtOrdenEps.setBorder(null);
        add(jtOrdenEps, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 220, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Historia Clinica");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jtHistoriaClinica.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtHistoriaClinica.setForeground(new java.awt.Color(51, 51, 51));
        jtHistoriaClinica.setBorder(null);
        add(jtHistoriaClinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 219, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 220, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 220, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 220, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 220, 20));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Registrar Paciente");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(87, 197, 186));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarPaciente.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnRegistrarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarPaciente.setText("       Registrar");
        btnRegistrarPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarPacienteMouseClicked(evt);
            }
        });
        jPanel1.add(btnRegistrarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -1, 90, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 90, 30));

        lblFormatIde.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        lblFormatIde.setForeground(new java.awt.Color(87, 197, 186));
        add(lblFormatIde, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 220, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarPacienteMouseClicked
        try {

            if (campoVacio() != true) {
                int id = Integer.parseInt(jtIdentificacion.getText());
                if (validarDatos()) {
                    JOptionPane.showMessageDialog(null, "Error de datos ingresados");
                } else {
                    if (ref.existenPacientes(id)) {
                        JOptionPane.showMessageDialog(null, "El id " + jtIdentificacion.getText() + " Ya se encuentra en uso");
                    } else {
                        PacienteDTO objPaciente = new PacienteDTO(jtNombreCompleto.getText(), Integer.parseInt(jtIdentificacion.getText()), jdcFechaIngreso.getDate().toString(),
                                jtOrdenEps.getText(), jtHistoriaClinica.getText());
                        boolean valor = ref.registrarPaciente(objPaciente);
                        if (valor) {
                            JOptionPane.showMessageDialog(null, "Paciente registrado exitosamente!");
                            limpiarCampos();
                        } else {
                            JOptionPane.showMessageDialog(null, "Paciente no registrado");
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "No pueden haber campos vacios!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La operacion no se pudo completar, intente nuevamente...");
        }
    }//GEN-LAST:event_btnRegistrarPacienteMouseClicked

    private void jtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdentificacionKeyTyped
        char num = evt.getKeyChar();
        if (!Character.isDigit(num)) {
            evt.consume();
            lblFormatIde.setText("*Debes ingresar valores númericos");
        } else {
            lblFormatIde.setText("");
        }
    }//GEN-LAST:event_jtIdentificacionKeyTyped

    private boolean campoVacio() {
        if (jtNombreCompleto.getText().isEmpty() || jtIdentificacion.getText().isEmpty() || jdcFechaIngreso.getDate() == null
                || jtOrdenEps.getText().isEmpty() || jtHistoriaClinica.getText().isEmpty()) {
            return true;
        }
        return false;
    }

    private boolean validarDatos() {
        if (jtNombreCompleto.getText().length() > 64
                || Integer.parseInt(jtIdentificacion.getText()) < 1
                || jtOrdenEps.getText().length() > 40
                || jtHistoriaClinica.getText().length() > 40) {
            return true;
        }
        return false;
    }

    private void limpiarCampos() {
        this.jtNombreCompleto.setText(null);
        this.jtIdentificacion.setText(null);
        this.jtHistoriaClinica.setText(null);
        this.jtOrdenEps.setText(null);
        this.jdcFechaIngreso.setDate(null);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnRegistrarPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private com.toedter.calendar.JDateChooser jdcFechaIngreso;
    private javax.swing.JTextField jtHistoriaClinica;
    private javax.swing.JTextField jtIdentificacion;
    private javax.swing.JTextField jtNombreCompleto;
    private javax.swing.JTextField jtOrdenEps;
    private javax.swing.JLabel lblFormatIde;
    // End of variables declaration//GEN-END:variables
}

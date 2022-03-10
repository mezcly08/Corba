package cliente.vistas;

import javax.swing.JOptionPane;
import s_gestion_pacientes.sop_corba.GestionPersonal;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.InfoSesionDTO;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.PacienteDTO;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTO;

public class GUIFormFisio extends javax.swing.JPanel {

    private static GestionPersonal ref;
    private static personalDTO objUsuario;

    public GUIFormFisio(GestionPersonal ref, personalDTO objUsuario) {
        this.ref = ref;
        this.objUsuario = objUsuario;
        initComponents();
        TextPrompt textId = new TextPrompt(" Ingrese la identificación", jTextIdentificacion);
        TextPrompt texPresion = new TextPrompt(" Ingrese la presión arterial", jTextPresionArterial);
        TextPrompt textFrecuenciaIncial = new TextPrompt(" Ingrese la frecuencia inicial", jTextFrecuenciaInicial);
        TextPrompt textFrecuenciaFinal = new TextPrompt(" Ingrese la frecuencia final", jTextFrecuenciaFinal);
        TextPrompt textSaturacion = new TextPrompt(" Ingrese la saturacion", jTextSaturacion);
        TextPrompt textObservaciones = new TextPrompt(" Ingrese las observaciones", jTextObservaciones);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextSaturacion = new javax.swing.JTextField();
        jFechaSesion = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextIdentificacion = new javax.swing.JTextField();
        jTextPresionArterial = new javax.swing.JTextField();
        jTextFrecuenciaInicial = new javax.swing.JTextField();
        jTextFrecuenciaFinal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextObservaciones = new javax.swing.JTextArea();
        cbxEstadoPaciente = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnRegistrarFRCP3 = new javax.swing.JLabel();
        jtNumFase = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jtNumSesion = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Identificación");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Número fase");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Saturación de oxigeno");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Número Sesión");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Observaciones");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Información Paciente");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jTextSaturacion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextSaturacion.setBorder(null);
        jPanel1.add(jTextSaturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 200, 30));
        jPanel1.add(jFechaSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 300, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Estado");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Fecha sesión");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Presión arterial");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Frecuencia cardiaca inicial");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Frecuencia cardiaca final");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jTextIdentificacion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextIdentificacion.setBorder(null);
        jPanel1.add(jTextIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 280, 30));

        jTextPresionArterial.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextPresionArterial.setBorder(null);
        jPanel1.add(jTextPresionArterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 150, 30));

        jTextFrecuenciaInicial.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextFrecuenciaInicial.setBorder(null);
        jPanel1.add(jTextFrecuenciaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 200, 30));

        jTextFrecuenciaFinal.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextFrecuenciaFinal.setBorder(null);
        jPanel1.add(jTextFrecuenciaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 150, 30));

        jTextObservaciones.setColumns(20);
        jTextObservaciones.setRows(5);
        jScrollPane1.setViewportView(jTextObservaciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 200, 80));

        cbxEstadoPaciente.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        cbxEstadoPaciente.setForeground(new java.awt.Color(51, 51, 51));
        cbxEstadoPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deficiente", "Evolucionado\t", "Estable" }));
        jPanel1.add(cbxEstadoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 150, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 280, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 150, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 200, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 150, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 200, 10));

        jPanel2.setBackground(new java.awt.Color(87, 197, 186));

        btnRegistrarFRCP3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnRegistrarFRCP3.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarFRCP3.setText("         Registrar");
        btnRegistrarFRCP3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarFRCP3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarFRCP3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarFRCP3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarFRCP3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, 30));

        jtNumFase.setEditable(false);
        jtNumFase.setBackground(new java.awt.Color(255, 255, 255));
        jtNumFase.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtNumFase.setBorder(null);
        jPanel1.add(jtNumFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 50, 20));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 132, 50, 10));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 132, 50, 10));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 50, 10));

        jtNumSesion.setEditable(false);
        jtNumSesion.setBackground(new java.awt.Color(255, 255, 255));
        jtNumSesion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtNumSesion.setBorder(null);
        jPanel1.add(jtNumSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 50, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarFRCP3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarFRCP3MouseClicked
        if (existenCamposVacios() != true) {
            int numerofase = 0;
            int numerosesion = 0;
            int id = Integer.parseInt(jTextIdentificacion.getText());
            InfoSesionDTO objInfo = new InfoSesionDTO();
            objInfo = null;
            if (validarDatos()) {
                JOptionPane.showMessageDialog(null, "Error de datos ingresados");
            } else {
                boolean valor;
                try {
                    if (ref.existeSesion(id)) {
                        objInfo = ref.consultarInfoSesion(Integer.parseInt(jTextIdentificacion.getText()));
                        if (objInfo.numSesion == 12) {
                            JOptionPane.showMessageDialog(null, "Acabamos la fase ");
                            //ref.eliminarList(id);
                        }
                    }

                    if (ref.validaTodoVal(id)) {
                        PacienteDTO objPacienteReg = ref.consultarPaciente(Integer.parseInt(jTextIdentificacion.getText()));
                        if (objPacienteReg != null) {
                            if (objInfo == null) {
                                numerofase++;
                                numerosesion = numerosesion + 1;
                            } else {
                                numerofase = objInfo.numFase;
                                numerosesion = objInfo.numSesion + 1;
                            }
                            InfoSesionDTO objInfoSesion = new InfoSesionDTO(Integer.parseInt(jTextIdentificacion.getText()),
                                    numerofase, jFechaSesion.getDate().toString(),
                                    numerosesion, Integer.parseInt(jTextPresionArterial.getText()),
                                    Integer.parseInt(jTextFrecuenciaInicial.getText()), Integer.parseInt(jTextFrecuenciaFinal.getText()),
                                    Integer.parseInt(jTextSaturacion.getText()), cbxEstadoPaciente.getSelectedItem().toString(), jTextObservaciones.getText());
                            valor = ref.guardarInfoSesion(objInfoSesion);
                            jtNumFase.setText(numerofase + "");
                            jtNumSesion.setText(numerosesion + "");

                            if (valor) {
                                JOptionPane.showMessageDialog(null, "Información del paciente registrada!!");
                                LimpiarCampos();
                            } else {
                                JOptionPane.showMessageDialog(null, "No se pudo registrar la información");
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "El id " + objPacienteReg.id + " Ya se encuentra en uso");

                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Hacen falta valoraciones");
                    }

                } catch (Exception e) {
                    System.out.println("La operacion no se pudo completar, intente nuevamente...");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacios!");

        }
    }//GEN-LAST:event_btnRegistrarFRCP3MouseClicked

    private boolean existenCamposVacios() {

        if (jTextIdentificacion.getText().isEmpty() || jTextPresionArterial.getText().isEmpty()
                || jTextFrecuenciaInicial.getText().isEmpty() || jTextFrecuenciaFinal.getText().isEmpty()
                || jFechaSesion.getDate() == null || jTextSaturacion.getText().isEmpty()
                || jTextObservaciones.getText().isEmpty()) {
            return true;
        }
        return false;
    }

    private boolean validarDatos() {
        if (Integer.parseInt(jTextIdentificacion.getText()) < 1) {
            return true;
        }
        return false;
    }

    private void LimpiarCampos() {
        this.jTextIdentificacion.setText(null);
        this.jTextPresionArterial.setText(null);
        this.jTextFrecuenciaInicial.setText(null);
        this.jTextFrecuenciaFinal.setText(null);
        this.jTextSaturacion.setText(null);
        this.jFechaSesion.setDate(null);
        this.jTextObservaciones.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnRegistrarFRCP3;
    private javax.swing.JComboBox<String> cbxEstadoPaciente;
    private com.toedter.calendar.JDateChooser jFechaSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextFrecuenciaFinal;
    private javax.swing.JTextField jTextFrecuenciaInicial;
    private javax.swing.JTextField jTextIdentificacion;
    private javax.swing.JTextArea jTextObservaciones;
    private javax.swing.JTextField jTextPresionArterial;
    private javax.swing.JTextField jTextSaturacion;
    private javax.swing.JTextField jtNumFase;
    private javax.swing.JTextField jtNumSesion;
    // End of variables declaration//GEN-END:variables
}

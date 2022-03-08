package cliente.vistas;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


import s_gestion_pacientes.sop_corba.GestionPersonal;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.InfoSesionDTO;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.PacienteDTO;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTO;

public class GUIConsultarFormFisio extends javax.swing.JPanel {

    private static GestionPersonal ref;
    private static personalDTO objUsuario;

    public GUIConsultarFormFisio(GestionPersonal ref, personalDTO objUsuario) {
        this.ref = ref;
        this.objUsuario = objUsuario;
        initComponents();

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
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jFechaSesion = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jtEstado = new javax.swing.JTextField();
        jtNumFase = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jtNumSesion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnBuscarPersonal = new javax.swing.JLabel();

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

        jTextSaturacion.setEditable(false);
        jTextSaturacion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextSaturacion.setBorder(null);
        jPanel1.add(jTextSaturacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 200, 30));

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
        jPanel1.add(jTextIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 190, 30));

        jTextPresionArterial.setEditable(false);
        jTextPresionArterial.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextPresionArterial.setBorder(null);
        jPanel1.add(jTextPresionArterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 150, 30));

        jTextFrecuenciaInicial.setEditable(false);
        jTextFrecuenciaInicial.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextFrecuenciaInicial.setBorder(null);
        jPanel1.add(jTextFrecuenciaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 200, 30));

        jTextFrecuenciaFinal.setEditable(false);
        jTextFrecuenciaFinal.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jTextFrecuenciaFinal.setBorder(null);
        jPanel1.add(jTextFrecuenciaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 150, 30));

        jTextObservaciones.setEditable(false);
        jTextObservaciones.setColumns(20);
        jTextObservaciones.setRows(5);
        jScrollPane1.setViewportView(jTextObservaciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 200, 80));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 190, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 150, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 200, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 150, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 200, 10));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 280, -1));

        jFechaSesion.setEditable(false);
        jFechaSesion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jFechaSesion.setBorder(null);
        jPanel1.add(jFechaSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 280, 30));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 150, -1));

        jtEstado.setEditable(false);
        jtEstado.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtEstado.setBorder(null);
        jPanel1.add(jtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 150, 30));

        jtNumFase.setEditable(false);
        jtNumFase.setBackground(new java.awt.Color(255, 255, 255));
        jtNumFase.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtNumFase.setBorder(null);
        jPanel1.add(jtNumFase, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 110, 70, 30));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 70, -1));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 70, -1));

        jtNumSesion.setEditable(false);
        jtNumSesion.setBackground(new java.awt.Color(255, 255, 255));
        jtNumSesion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtNumSesion.setBorder(null);
        jPanel1.add(jtNumSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 70, 30));

        jPanel2.setBackground(new java.awt.Color(87, 197, 186));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarPersonal.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnBuscarPersonal.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/search_15px.png"))); // NOI18N
        btnBuscarPersonal.setText(" Buscar");
        btnBuscarPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarPersonalMouseClicked(evt);
            }
        });
        jPanel2.add(btnBuscarPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 0, 80, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 90, 30));

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

    private void btnBuscarPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarPersonalMouseClicked
        boolean valor;
        try {
            PacienteDTO objPaciente = ref.consultarPaciente(Integer.parseInt(jTextIdentificacion.getText()));
            if (objPaciente != null) {
                InfoSesionDTO objInfoSesion = ref.consultarInfoSesion(Integer.parseInt(jTextIdentificacion.getText()));
                if (objInfoSesion != null) {
                    jtNumFase.setText(objInfoSesion.numFase + "");
                    jtNumSesion.setText(objInfoSesion.numSesion + "");
                    jFechaSesion.setText(objInfoSesion.fechaSesion);
                    jTextPresionArterial.setText(objInfoSesion.presionArterial + "");
                    jTextFrecuenciaInicial.setText(objInfoSesion.frecuenciaInicial + "");
                    jTextFrecuenciaFinal.setText(objInfoSesion.frecuenciaFinal + "");
                    jTextSaturacion.setText(objInfoSesion.saturacionOxigeno + "");
                    jtEstado.setText(objInfoSesion.estadoPaciente);
                    jTextObservaciones.setText(objInfoSesion.observaciones);

                } else {
                    JOptionPane.showMessageDialog(null, "No ha valorado al paciente");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El paciente no se encuentra registrado");
            }
        } catch (Exception e) {
            System.out.println("La operacion no se pudo completar, intente nuevamente...");
        }
    }//GEN-LAST:event_btnBuscarPersonalMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuscarPersonal;
    private javax.swing.JTextField jFechaSesion;
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
    private javax.swing.JTextField jtEstado;
    private javax.swing.JTextField jtNumFase;
    private javax.swing.JTextField jtNumSesion;
    // End of variables declaration//GEN-END:variables
}

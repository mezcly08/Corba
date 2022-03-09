package cliente.vistas;

import javax.swing.JOptionPane;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.PacienteDTO;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTO;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.ValorarPacienteDTO;
import s_gestion_pacientes.sop_corba.GestionPersonal;

public class GUIConsultarValoracion extends javax.swing.JPanel {
    
    private static GestionPersonal ref;
    private static personalDTO objUsuario;
    boolean bandera1 = false, bandera2 = false, bandera3 = false;
    
    public GUIConsultarValoracion(GestionPersonal ref, personalDTO objUsuario) {
        this.ref = ref;
        this.objUsuario = objUsuario;
        initComponents();
        this.jtProfesion.setText(objUsuario.ocupacion);
        this.jtNomEspecialista.setText(objUsuario.nombreCompleto);
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
        jtIdPaciente = new javax.swing.JTextField();
        jtConceptoPaciente = new javax.swing.JTextField();
        jtObsPaciente = new javax.swing.JTextField();
        jtNomEspecialista = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtProfesion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnConsulValo = new javax.swing.JLabel();
        lblFormatIde = new javax.swing.JLabel();
        jtFechaValoracion = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Id paciente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Concepto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Observaciones ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Fecha valoración ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Profesión");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Nombre profesion");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jtIdPaciente.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtIdPaciente.setForeground(new java.awt.Color(51, 51, 51));
        jtIdPaciente.setBorder(null);
        jtIdPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIdPacienteKeyTyped(evt);
            }
        });
        jPanel1.add(jtIdPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 190, -1));

        jtConceptoPaciente.setEditable(false);
        jtConceptoPaciente.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtConceptoPaciente.setForeground(new java.awt.Color(51, 51, 51));
        jtConceptoPaciente.setBorder(null);
        jPanel1.add(jtConceptoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 280, -1));

        jtObsPaciente.setEditable(false);
        jtObsPaciente.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtObsPaciente.setForeground(new java.awt.Color(51, 51, 51));
        jtObsPaciente.setBorder(null);
        jPanel1.add(jtObsPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 280, -1));

        jtNomEspecialista.setEditable(false);
        jtNomEspecialista.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtNomEspecialista.setForeground(new java.awt.Color(51, 51, 51));
        jtNomEspecialista.setBorder(null);
        jPanel1.add(jtNomEspecialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 280, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Historial Paciente");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jtProfesion.setEditable(false);
        jtProfesion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtProfesion.setForeground(new java.awt.Color(51, 51, 51));
        jtProfesion.setBorder(null);
        jPanel1.add(jtProfesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 280, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 190, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 280, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 280, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 280, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 280, 10));

        jPanel2.setBackground(new java.awt.Color(87, 197, 186));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConsulValo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnConsulValo.setForeground(new java.awt.Color(255, 255, 255));
        btnConsulValo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cliente/recursos/search_15px.png"))); // NOI18N
        btnConsulValo.setText("Consultar");
        btnConsulValo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConsulValo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsulValoMouseClicked(evt);
            }
        });
        jPanel2.add(btnConsulValo, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 0, 90, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 100, 30));

        lblFormatIde.setBackground(new java.awt.Color(87, 197, 186));
        lblFormatIde.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        lblFormatIde.setForeground(new java.awt.Color(87, 197, 186));
        jPanel1.add(lblFormatIde, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 190, 20));

        jtFechaValoracion.setEditable(false);
        jtFechaValoracion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtFechaValoracion.setForeground(new java.awt.Color(51, 51, 51));
        jtFechaValoracion.setBorder(null);
        jPanel1.add(jtFechaValoracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 280, -1));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 280, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsulValoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsulValoMouseClicked
    int id= Integer.parseInt(jtIdPaciente.getText());
        try {
            if(ref.existenPacientes(id)){
                if(ref.existevaloracion(id, objUsuario.ocupacion)){
                    ValorarPacienteDTO objValoracion = ref.consultarValoracion(jtIdPaciente.getText(),jtProfesion.getText());
                    jtConceptoPaciente.setText(objValoracion.concepto);
                    jtObsPaciente.setText(objValoracion.obversaciones);
                    jtFechaValoracion.setText(objValoracion.fechaValoracion);
                }else{
                    JOptionPane.showMessageDialog(null, "No ha valorado al paciente");
                }         
            
            } else {
                JOptionPane.showMessageDialog(null, "El paciente no se encuentra registrado");
            }
        } catch (Exception e) {
            System.out.println("La operacion no se pudo completar, intente nuevamente...");
        }
    }//GEN-LAST:event_btnConsulValoMouseClicked

    private void jtIdPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdPacienteKeyTyped
       char num = evt.getKeyChar();
        if (!Character.isDigit(num)) {
            evt.consume();
            lblFormatIde.setText("*Debes ingresar valores númericos");
        } else {
            lblFormatIde.setText("");
        }
    }//GEN-LAST:event_jtIdPacienteKeyTyped
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnConsulValo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jtConceptoPaciente;
    private javax.swing.JTextField jtFechaValoracion;
    private javax.swing.JTextField jtIdPaciente;
    private javax.swing.JTextField jtNomEspecialista;
    private javax.swing.JTextField jtObsPaciente;
    private javax.swing.JTextField jtProfesion;
    private javax.swing.JLabel lblFormatIde;
    // End of variables declaration//GEN-END:variables
}

package cliente;

import javax.swing.JOptionPane;
import s_gestion_pacientes.sop_corba.AdminCllbckintPOA;

public class AdminCllbckImpl extends AdminCllbckintPOA{

    public AdminCllbckImpl(){
        super();
    }


    @Override
    public void notificar(String nombreCompleto, int id) {
        JOptionPane.showMessageDialog(null, "Tiene nuevo paciente por valorar");
        System.out.println("***El paciente " + nombreCompleto + " identificado con id " + id + " necesita ser valorado***");
    }
    
}

package uce.edu.pa2.api.citas;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import uce.edu.pa2.api.principal.NotificadorMail;

@ApplicationScoped
public class CitaService {
    @Inject
    private NotificadorMail notificadorMail;
    public void agendar(Cita cita){
        System.out.println("Agendando la cita:");
        System.out.println("Paciente: " + cita.getPaciente());
        System.out.println("Medico: " + cita.getMedico()); 
        System.out.println("Especialidad: " + cita.getEspecialidad());
        System.out.println("Fecha: " + cita.getFecha());
        System.out.println("Correo del paciente: " + cita.getCorreo());
        System.out.println("Guardando en la base de datos");
        notificadorMail.enviar(cita.getCorreo(), "Se ha agendado una cita para el paciente " + cita.getPaciente() + " con el medico " + cita.getMedico() + " para la fecha " + cita.getFecha());

    }

}


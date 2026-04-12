package uce.edu.pa2.api.bodega;

public class Cita {
    private String paciente;
    private String medico;
    private String especialidad;
    private String fecha;
    private String correo;
    public Cita() {
    }
    public Cita(String paciente, String medico, String especialidad, String fecha,String correo) {
        this.paciente = paciente;
        this.medico = medico;
        this.especialidad = especialidad;
        this.fecha = fecha;
        this.correo=correo;
    }
    public String getPaciente() {
        return paciente;
    }
    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
    public String getMedico() {
        return medico;
    }
    public void setMedico(String medico) {
        this.medico = medico;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    @Override
    public String toString() {
        return "Cita [paciente=" + paciente + ", medico=" + medico + ", especialidad=" + especialidad + ", fecha="
                + fecha + ", correo=" + correo + "]";
    }
    


}


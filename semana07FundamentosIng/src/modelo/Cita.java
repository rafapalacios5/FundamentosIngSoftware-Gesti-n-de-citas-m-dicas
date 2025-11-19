
package modelo;

import java.util.Date;

public class Cita {
    private String diagnostico;
    private Estados estado; 
    private String fecha; 
    private String hora;
    
    private Paciente paciente;
    private Doctor doctor;

    public Cita(String fecha, String hora, Paciente paciente, Doctor doctor) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.doctor = doctor;
        this.estado = Estados.pendiente; 
        this.diagnostico = "";
        
        System.out.println("    -> Cita: Objeto creado para " + paciente.getNombre());
    }

    public void agendar() {
       
    }
    
    public void cancelar() {
        this.estado = Estados.cancelada;
        System.out.println("    -> Cita: Estado actualizado a CANCELADA.");
    }
    
    public void cita() {
    }

    public void confirmar() {
        this.estado = Estados.confirmada;
        System.out.println("    -> Cita: Estado actualizado a CONFIRMADA.");
    }

    public Estados getEstado() { return estado; }
    public Paciente getPaciente() { return paciente; }
    public Doctor getDoctor() { return doctor; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
}


package logica;

import modelo.Paciente;
import modelo.Doctor;
import modelo.Cita;
import java.util.ArrayList;

public class GestorCitas {

    private ArrayList<Cita> listaCitas;

    public GestorCitas() {
        this.listaCitas = new ArrayList<>();
    }

    
    public Cita solicitarCita(String fecha, String hora, Doctor doctor, Paciente paciente) {
        
        System.out.println("\n -> GestorCitas: Inicia el proceso de solicitud...");
        
        boolean disponible = validarDisponibilidad(fecha, hora, doctor);
        
        if (disponible) {
            
            Cita nuevaCita = crearCita(fecha, hora, paciente, doctor);
            
            nuevaCita.confirmar(); 
            
            enviarConfirmacion(nuevaCita);
            
            return nuevaCita;
            
        } else {
            System.out.println(" -> GestorCitas: Cita NO creada. Doctor no disponible.");
            return null;
        }
    }
    
    public boolean validarDisponibilidad(String fecha, String hora, Doctor doctor) {
        System.out.println(" -> GestorCitas: Validando disponibilidad...");
        
        
        boolean disponible = doctor.obtenerCitas(fecha, hora); 
        
        if (disponible) {
            System.out.println(" -> GestorCitas: Disponibilidad(): true. Doctor está libre.");
        } else {
            System.out.println(" -> GestorCitas: Disponibilidad(): false. Doctor ocupado.");
        }
        
        return disponible;
    }
    
   
    public Cita crearCita(String fecha, String hora, Paciente paciente, Doctor doctor) {
        System.out.println(" -> GestorCitas: Creando objeto Cita...");
        Cita nuevaCita = new Cita(fecha, hora, paciente, doctor);
        this.listaCitas.add(nuevaCita);
        System.out.println(" -> GestorCitas: citaCreada(). Cita guardada en la lista.");
        return nuevaCita;
    }
    
    public void enviarConfirmacion(Cita cita) {
        
        NotificacionCorreo notificador = new NotificacionCorreo(cita.getPaciente().getCorreo());
        notificador.enviarCorreo(cita);
    }
}


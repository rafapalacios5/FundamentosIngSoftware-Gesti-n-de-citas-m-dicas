
package logica;

import modelo.Cita;
public class NotificacionCorreo {
    
    private String correo; 
    
    
    public NotificacionCorreo(String correo) {
        this.correo = correo;
    }
    
    
    public void enviarCorreo(Cita cita) {
        
        System.out.println("  -> NotificacionCorreo: Correo enviado. Asunto: Confirmación de Cita con Dr. " + cita.getDoctor().getNombre());
    }

    
    public String getCorreo() {
        return correo;
    }
}

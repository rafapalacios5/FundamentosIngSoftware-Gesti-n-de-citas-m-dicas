
package modelo;

import modelo.Cita;

public class Doctor {
    private String especialidad;
    private String nombre;
    private java.util.List<Cita> citasProgramadas; 

    public Doctor(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.citasProgramadas = new java.util.ArrayList<>();
    }

    public void doctor() {
    } 
    
    public boolean obtenerCitas(String fecha, String hora) {
   
        System.out.println("  -> Doctor: Verificando disponibilidad para " + fecha + " " + hora + ".");
        
        return true; 
    }

    public java.util.List<Cita> getCitasProgramadas() {
        return citasProgramadas;
    }

    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
}

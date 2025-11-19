
package modelo;

public class Paciente {
    private String correo;
    private int edad;
    private String nombre;

    public Paciente(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    public void actualizarDatos() {
        System.out.println("Datos de " + nombre + " actualizados.");
    }

    public void paciente() {
    }
    
    public void registrar() {
        System.out.println("Paciente " + nombre + " registrado en el sistema.");
    }

    public String getNombre() { return nombre; }
    public String getCorreo() { return correo; }
    public int getEdad() { return edad; }
}

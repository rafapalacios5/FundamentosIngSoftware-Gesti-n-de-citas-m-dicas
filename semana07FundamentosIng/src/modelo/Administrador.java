
package modelo;

import logica.ControlReportes;

public class Administrador {
    private String nivelAcceso;
    
    public Administrador(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public void administrador() {}
    
    private ControlReportes controlReportes = new ControlReportes();

    public void generarReportesCitas() {
        System.out.println("Administrador solicita: ");
        controlReportes.generarReportesCitas();
    }
    
    public void generarReportesDoctores() {
        System.out.println("Administrador solicita: ");
        controlReportes.generarReportesDoctores();
    }
    
    public void generarReportesPacientes() {
        System.out.println("Administrador solicita: ");
        controlReportes.generarReportesPacientes();
    }
}


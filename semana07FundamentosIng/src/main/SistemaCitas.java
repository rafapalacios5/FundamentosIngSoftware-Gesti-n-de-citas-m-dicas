
package main;

import logica.GestorCitas;
import modelo.Paciente;
import modelo.Doctor;
import modelo.Cita;
import java.util.Scanner;

public class SistemaCitas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--------------------------------------------");
        System.out.println("  SISTEMA DE GESTIÓN DE CITAS - AGENDAR CITA");
        System.out.println("--------------------------------------------");

        Doctor doctorPerez = new Doctor("Dr. Pérez (Cardiólogo)", "Cardiología");
        GestorCitas gestor = new GestorCitas();

        System.out.println("\n--- DATOS DEL PACIENTE ---");
        
        
        System.out.print("Ingrese su nombre completo: ");
        String nombrePaciente = scanner.nextLine();
        
        System.out.print("Ingrese su edad: ");
        int edadPaciente = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese su correo electrónico: ");
        String correoPaciente = scanner.nextLine();
        
        Paciente paciente = new Paciente(nombrePaciente, edadPaciente, correoPaciente);
        paciente.registrar();

        System.out.println("\n--- SOLICITUD PARA AGENDAR TURNO (SECUENCIA) ---");
        System.out.println("Doctor disponible: " + doctorPerez.getNombre());
        
        System.out.print("Ingrese la fecha deseada (Ej: 2026-03-15): ");
        String fechaSolicitada = scanner.nextLine();
        
        System.out.print("Ingrese la hora deseada (Ej: 11:30): ");
        String horaSolicitada = scanner.nextLine();

        scanner.close(); 
        
        System.out.println("\n-> Paciente: solicitarCita(" + fechaSolicitada + ", " + horaSolicitada + ", Dr. Pérez)");
        
        
        Cita citaAgendada = gestor.solicitarCita(fechaSolicitada, horaSolicitada, doctorPerez, paciente);

        
        if (citaAgendada != null) {
            System.out.println("\n-> :Form: confirmacion() exitosa.");
            System.out.println("--------------------------------------------");
            System.out.println(" TURNO CONFIRMADO:");
            System.out.println("   Paciente: " + citaAgendada.getPaciente().getNombre());
            System.out.println("   Doctor: " + citaAgendada.getDoctor().getNombre());
            System.out.println("   Fecha/Hora: " + citaAgendada.getFecha() + " a las " + citaAgendada.getHora());
            System.out.println("   Estado: " + citaAgendada.getEstado());
            System.out.println("--------------------------------------------");
        }
    }
}
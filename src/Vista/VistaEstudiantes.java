package Vista;

import Controlador.ControladorEstudiantes;
import Modelo.Estudiante;
import java.util.Scanner;

public class VistaEstudiantes {
static Estudiante e = new Estudiante();
private static double promedioEstudiante;

    public static void main(String[] args) {
        ControladorEstudiantes controlador = new ControladorEstudiantes();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ControladorEstudiantes.MAX_ESTUDIANTES; i++) {
            
            System.out.println("Ingrese nombre del estudiante " + (i + 1) + ":");
            String nombre = scanner.next();
            
            System.out.println("Ingrese el documeto " + (i + 1) + ":");
            String documento = scanner.next();
            
            System.out.println("Ingrese la edad " + (i + 1) + ":");
            int edad = scanner.nextInt();

            System.out.println("Ingrese nota de Inglés para el estudiante " + (i + 1) + ":");
            double notaIngles = Double.parseDouble(scanner.next());

            System.out.println("Ingrese nota de Matemáticas para el estudiante " + (i + 1) + ":");
            double notaMatematicas = Double.parseDouble(scanner.next());

            System.out.println("Ingrese nota de Ciencias para el estudiante " + (i + 1) + ":");
            double notaCiencias = Double.parseDouble(scanner.next());
            
            promedioEstudiante = ControladorEstudiantes.calcularPromedio(notaIngles, notaCiencias, notaMatematicas);
            e.setPromedioE(promedioEstudiante);

            controlador.agregarEstudiante(nombre, notaIngles, notaMatematicas, notaCiencias, documento, edad);
        }
        

        System.out.println("\nNotas de menor a mayor:");
        controlador.ordenarNotasMenorAMayor();
        controlador.imprimirNotas();

        System.out.println("\nPromedios de mayor a menor:");
        controlador.ordenarPromediosMayorAMenor();
        controlador.imprimirNotas();

        scanner.close();
    }
}

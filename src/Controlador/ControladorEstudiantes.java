package Controlador;
import Modelo.Estudiante;
import java.util.Arrays;

public class ControladorEstudiantes {
    public static int MAX_ESTUDIANTES = 3;
    private Estudiante[] estudiantes;
    private int numEstudiantes;

    public ControladorEstudiantes() {
        estudiantes = new Estudiante[MAX_ESTUDIANTES];
        numEstudiantes = 0;
    }

    public boolean agregarEstudiante(String nombre, double notaIngles, double notaMatematicas, double notaCiencias,String documento, int edad) {
        if (numEstudiantes < MAX_ESTUDIANTES) {
            estudiantes[numEstudiantes++] = new Estudiante(nombre, notaIngles, notaMatematicas, notaCiencias, documento, edad );
            return true;
        }
        return false;
    }
    
    public void ordenarNotasMenorAMayor() {
        Arrays.sort(estudiantes, 0, numEstudiantes, (est1, est2) -> {
            double promedio1 = est1.getPromedio();
            double promedio2 = est2.getPromedio();
            return Double.compare(promedio1, promedio2);
        });
    } 
    
    public void ordenarPromediosMayorAMenor() {
        Arrays.sort(estudiantes, 0, numEstudiantes, (est1, est2) -> {
            double promedio1 = est1.getPromedio();
            double promedio2 = est2.getPromedio();
            return Double.compare(promedio2, promedio1);
        });
    }

    public void imprimirNotas() {
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println(estudiantes[i]);
        }
    }
    
    public static double calcularPromedio(double nota1, double nota2, double nota3){
        return (nota1+nota2+nota3)/3;
    }
    
}
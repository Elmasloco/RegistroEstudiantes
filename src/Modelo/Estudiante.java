package Modelo;

import java.util.Arrays;
import java.util.Scanner;

// Modelo: Clase Estudiante
public class Estudiante {
    private String nombre;
    private String documento;
    private int edad;
    private double notaIngles;
    private double notaMatematicas;
    private double notaCiencias;
    private double promedioE;

    public Estudiante() {
    }
    
    public Estudiante(String nombre, double notaIngles, double notaMatematicas, double notaCiencias, String documento, int edad   ) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.notaIngles = notaIngles;
        this.notaMatematicas = notaMatematicas;
        this.notaCiencias = notaCiencias;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaIngles() {
        return notaIngles;
    }

    public void setNotaIngles(double notaIngles) {
        this.notaIngles = notaIngles;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaCiencias() {
        return notaCiencias;
    }

    public void setNotaCiencias(double notaCiencias) {
        this.notaCiencias = notaCiencias;
    } 
    
    public String getNombre() {
        return nombre;
    }

    public double getPromedioE() {
        return promedioE;
    }

    public void setPromedioE(double promedioE) {
        this.promedioE = promedioE;
    }
    
    public double getPromedio() {
        return (notaIngles + notaMatematicas + notaCiencias) / 3;
    }
    
    @Override
    public String toString() {
        return nombre + ": Inglés " + notaIngles + ", Matemáticas " + notaMatematicas + ", Ciencias " + notaCiencias + ", promedio " + promedioE;
    }
}


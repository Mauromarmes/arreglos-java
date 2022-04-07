package co.edu.cesde;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double promedio = 0;
        int nestudiante;
        System.out.println("Ingrese Cantidad de Estudiantes");
        nestudiante = scanner.nextInt();
        double[] estuadiantes = new double[nestudiante];
        String[] nombres = new String[nestudiante];

        for (int i = 0; i < nestudiante; i++) {
            double pestudiante = 0;

            System.out.println("Ingrese Nombre: ");
            nombres[i] = scanner.next();
            for (int t = 0; t < 3; t++) {
                System.out.println("Ingrese Nota: " + (t + 1));
                double nota = scanner.nextDouble();
                pestudiante = pestudiante + nota;
            }
            pestudiante = pestudiante / 3;
            estuadiantes[i] = pestudiante;

            promedio = promedio + pestudiante;
        }

        System.out.println("Nota Pomedio es: " + numeroround(promedio/nestudiante));
        for (int i = 0; i < nestudiante; i++) {
            System.out.println("Estudiante: " + nombres[i] + "Nota:" + numeroround(estuadiantes[i]));
        }
    }
    static double numeroround(double variable){
            return Math.round(variable*100.0)/100.0;
        }

}


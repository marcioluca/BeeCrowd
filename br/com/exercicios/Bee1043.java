package br.com.exercicios;

import java.util.Scanner;

public class Bee1043 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Lê três valores reais
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        // Verifica se os valores formam um triângulo (condição da desigualdade triangular)
        if (a + b > c && a + c > b && b + c > a) {
            // Calcula o perímetro do triângulo
            double perimetroTriangulo = a + b + c;
            System.out.printf("Perimetro = %.1f%n", perimetroTriangulo);
        } else {
            // Caso contrário, calcula a área do trapézio com bases A e B, e altura C
            double areaTrapezio = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f%n", areaTrapezio);
        }
    }
}

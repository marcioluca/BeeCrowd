package br.com.exercicios;

import java.util.Scanner;

public class Bee2029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            double V = scanner.nextDouble();
            double D = scanner.nextDouble();

            double r = D / 2;
            double altura = V / (3.14 * r * r); // Altura do recipiente
            double area = 3.14 * r * r; // Área da boca do recipiente

            System.out.printf("ALTURA = %.2f\n", altura);
            System.out.printf("AREA = %.2f\n", area);
        }

        scanner.close();
    }
}

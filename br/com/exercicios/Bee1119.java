package br.com.exercicios;

import java.util.Scanner;

public class Bee1119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            if (Y == 0) {
                System.out.println("divisao impossivel");
            } else {
                double resultado = (double) X / Y;
                System.out.printf("%.1f\n", resultado); // Imprime o resultado com 1 casa decima
            }
        }

        scanner.close();
    }
}

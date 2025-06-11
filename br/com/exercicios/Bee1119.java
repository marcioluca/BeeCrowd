package br.com.exercicios;

import java.util.Scanner;

public class Bee1119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Lê a quantidade de pares
        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt(); // Lê o primeiro número
            int Y = scanner.nextInt(); // Lê o segundo número

            if (Y == 0) {
                System.out.println("divisao impossivel"); // Verifica se é possível dividir
            } else {
                double resultado = (double) X / Y; // Realiza a divisão com cast
                System.out.printf("%.1f\n", resultado); // Imprime o resultado com 1 casa decimal
            }
        }

        scanner.close(); // Fecha o scanner
    }
}

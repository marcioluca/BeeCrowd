package br.com.exercicios;

import java.util.Scanner;

public class Bee1099 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            // Determinar o menor e maior valor
            int menor = Math.min(X, Y);
            int maior = Math.max(X, Y);
            int soma = 0;

            // Somar os números ímpares no intervalo (exclusivo)
            for (int j = menor + 1; j < maior; j++) {
                if (j % 2 != 0) {
                    soma += j;
                }
            }

            System.out.println(soma);
        }

        scanner.close();
    }
}
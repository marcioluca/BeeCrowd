package br.com.exercicios;

import java.util.Scanner;

/** Bee 1113 - Crescente e Decrescente */
public class Bee1113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;

        do {
            x = scanner.nextInt();
            y = scanner.nextInt();

            if (x < y) {
                System.out.println("Crescente");
            } else if (x > y) {
                System.out.println("Decrescente");
            }

        } while (x != y);
        scanner.close();
    }
}

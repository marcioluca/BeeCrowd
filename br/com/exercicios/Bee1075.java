package br.com.exercicios;

import java.util.Scanner;

/**
 * Bee 1075 - Resto 2
 *
 * Problema: Dado um número inteiro N, imprimir todos os números entre 1 e 10000 que, quando divididos por N, deixam resto 2.
 *
 * Entrada:
 * - Um número inteiro N (2 ≤ N ≤ 1000).
 *
 * Saída:
 * - Todos os números entre 1 e 10000 que deixam resto 2 quando divididos por N, um por linha.
 *
 */
public class Bee1075 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer n = s.nextInt();

        for (int i = 1; i <= 10000; i++) {
            if( i % n == 2) {
                System.out.println(i);
            }
        }
        s.close();
    }
}

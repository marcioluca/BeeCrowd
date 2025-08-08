package br.com.exercicios;

import java.util.Scanner;

/**
 * Esta classe resolve o problema 1151 do BeeCrowd, que consiste em
 * gerar e imprimir os N primeiros termos da sequência de Fibonacci.
 * A sequência é impressa em uma única linha, separada por espaços,
 * sem um espaço extra no final.
 *
 * A sequência de Fibonacci é definida pela seguinte regra:
 * - O primeiro termo é 0.
 * - O segundo termo é 1.
 * - Cada termo subsequente é a soma dos dois termos anteriores.
 * (Ex: 0, 1, 1, 2, 3, 5, 8...)
 */

public class Bee1151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        if (n >= 1) {
            System.out.print(n1);
        }
        if (n >= 2) {
            System.out.print(" " + n2);
        }
        for (int i = 2; i < n; i++) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
        sc.close();
    }
}

package br.com.exercicios;

import java.util.Scanner;


// tacógrafo
public class Bee2388 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int distanciaTotalPercorrida = 0;
        n = sc.nextInt();
        do {
            int t = sc.nextInt();
            int v = sc.nextInt();

            distanciaTotalPercorrida += t * v;

            n--;
        } while (n != 0);

        System.out.println(distanciaTotalPercorrida);
    }
}

package br.com.exercicios;

import java.util.Scanner;

public class Bee1178 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Double[] n = new Double[100];

        n[0] = s.nextDouble();

        for (int i = 1; i < n.length; i++) {
            n[i] = n[i - 1] / 2;
        }
        for (int i = 0; i < n.length; i++) {
            System.out.printf("N[%d] = %.4f%n", i, n[i]);
        }
        s.close();
    }
}

package br.com.exercicios;

import java.util.Scanner;

public class Bee1079 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Double[] n = new Double[3];
        Integer nCasos = s.nextInt();
        Double mediaPonderada = 0.0;
        while (nCasos != 0) {
            for (int i = 0; i < n.length; i++) {
                n[i] = s.nextDouble();
            }
            n[0] *= 2;
            n[1] *= 3;
            n[2] *= 5;
            mediaPonderada = (n[0] + n[1] + n[2]) / 10;
            System.out.printf("%.1f%n", mediaPonderada);
            nCasos--;
        }
        ;

    }
}

package br.com.exercicios;

import java.util.Scanner;

public class Bee1182 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float[][] M = new float[12][12];

        int c = s.nextInt();
        char T = s.next().charAt(0);

        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 12; j++) {
                M[i][j] = s.nextFloat();
            }
        }

        float soma = 0;
        for (int i = 0; i < 12; i++) {
            soma+= M[i][c];
        }
        if(T == 'S') {
            System.out.printf("%.1f\n", soma);
        } else if(T == 'M') {
            System.out.printf("%.1f\n", soma / 12);
        }
        s.close();
    }

}

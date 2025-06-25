package br.com.exercicios;

import java.util.Scanner;

public class Bee1172 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer[] x = new Integer[10];

        for (int i = 0; i < x.length ; i++) {
            x[i] = s.nextInt();

            if(x[i] <= 0) {
                x[i] = 1;
            }
            System.out.println("X[" + i + "]" + " = " + x[i]);
        }

    }

}

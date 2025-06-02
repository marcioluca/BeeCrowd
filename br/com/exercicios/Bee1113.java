package br.com.exercicios;

import java.util.Scanner;

public class Bee1113 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer[] numeros = new Integer[2];
        int x, y;
        do {
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = s.nextInt();
            }
            x = numeros[0];
            y = numeros[1];
            if( x > y) {
                System.out.println("Decrescente");
            } else if( y > x) {
                System.out.println("Crescente");
            }
        } while (x != y);
    }
}

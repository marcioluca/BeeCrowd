package br.com.exercicios;

import java.util.Scanner;

public class Bee1133 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int inicio;
        int fim;
        if (x > y) {
            inicio = y;
            fim = x;
        } else {
            inicio = x;
            fim = y;
        }
        if( x < 1 || y < 1) {
            return;
        }
        for (int i = inicio + 1; i <= fim ; i++) {
            if(i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }

        }
    }
}

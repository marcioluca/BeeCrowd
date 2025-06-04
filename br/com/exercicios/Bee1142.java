package br.com.exercicios;

import java.util.Scanner;

public class Bee1142 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int contador = 1;
        for (int i = 0; i < n ; i++) {
            System.out.print(contador + " " + (contador + 1) + " " + (contador + 2) + " PUM\n");
            contador +=4;
        }
        s.close();
    }
}

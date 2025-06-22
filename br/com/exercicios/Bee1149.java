package br.com.exercicios;

import java.util.Scanner;

public class Bee1149 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int n;
        do {
            n = s.nextInt();
        } while (n <= 0);
        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma += a + i;
        }
        System.out.println(soma);
    }


}

package br.com.exercicios;

import java.util.Scanner;

// fatorial
public class Bee1153 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int fatorial = 1;
        if(n > 0 && n <= 13) {
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }
            System.out.println(fatorial);
        }
    }
}

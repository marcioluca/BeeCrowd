package br.com.exercicios;

import java.util.Scanner;

public class Bee1101 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();

        if(m <= 0 || n <= 0) {
            return;
        }
        int sum = 0;
        int inicio;
        int fim;
        if(m > n) {
            inicio = n;
            fim = m;
        } else {
            inicio = m;
            fim = n;
        }

        for (int i = inicio; i <= fim ; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("Sum=" + sum);
    }
}

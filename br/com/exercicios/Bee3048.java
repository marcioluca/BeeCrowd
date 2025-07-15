package br.com.exercicios;

import java.util.Scanner;

public class Bee3048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n ; i++) {
            v[i] = sc.nextInt();
        }
        int sequenciaMax = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || v[i] != v[i - 1]) {
                sequenciaMax++;
            }
        }
        System.out.println(sequenciaMax);
        sc.close();
    }
}

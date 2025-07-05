package br.com.exercicios;

import java.util.Scanner;

public class Bee1177 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[1000];
        int t = sc.nextInt();

        for (int i = 0; i < n.length; i++) {
            n[i] = i % t;
            System.out.println("N[" + i + "] = " + n[i]);

        }
        sc.close();
    }

}

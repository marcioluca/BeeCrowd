package br.com.exercicios;

import java.util.Scanner;

public class Bee1144 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + (i * i) + " " + (i * i * i));
            System.out.println(i + " " + ((i * i) + 1) + " " +   ((i * i * i) + 1));
        }
        s.close();
    }
}

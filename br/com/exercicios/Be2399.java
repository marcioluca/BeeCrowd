package br.com.exercicios;

import java.util.Scanner;

public class Be2399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int p = sc.nextInt();
        int f = sc.nextInt();

        if(c * f <= p) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

    }
}

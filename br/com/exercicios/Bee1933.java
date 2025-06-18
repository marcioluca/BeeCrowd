package br.com.exercicios;

import java.util.Scanner;

public class Bee1933 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if(a >= 1 && b >= 1 &&  a <= 13 && b <= 13) {
            int c = Math.max(a, b);
            System.out.println(c);
        }

    }
}

package br.com.exercicios;

import java.util.Scanner;

public class Bee1145 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        for (int i = 1; i <= y ; i++) {
            System.out.print(i);
            if(i % x == 0 || i == y) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }

}

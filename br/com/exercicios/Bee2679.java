package br.com.exercicios;

import java.util.Scanner;

public class Bee2679 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        do { x++; }while (x % 2 != 0);

        System.out.println(x);

        sc.close();
    }

}

package br.com.exercicios;

import java.util.Scanner;

public class Bee2344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();

        if (nota >= 0 && nota <= 100) {
            System.out.println(obterConceito(nota));
        }
    }
    public static String obterConceito(int nota) {

        if (nota == 0) return "E";
        if (nota <= 35) return "D";
        if (nota <= 60) return "C";
        if (nota <= 85) return "B";

        return "A";
    }
}
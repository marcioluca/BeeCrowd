package br.com.exercicios;

import java.util.Scanner;

public class Bee1074 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int qtdeDeNumeros  = s.nextInt();
        for (int i = 1; i <= qtdeDeNumeros; i++) {
            int numeros = s.nextInt();
            if(numeros == 0){
                System.out.println("NULL");
            } else if(numeros % 2 == 0) {
                if(numeros > 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("EVEN NEGATIVE");
                }
            } else {
                if(numeros > 0) {
                    System.out.println("ODD POSITIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            }
        }
        s.close();
    }
}

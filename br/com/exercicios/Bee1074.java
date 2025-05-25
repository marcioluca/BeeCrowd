package br.com.exercicios;

import java.util.Scanner;

public class Bee1074 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Integer qtdeDeNumeros  = s.nextInt();
//        Integer[] numeros = new Integer[qtdeDeNumeros];
        for (int i = 1; i <= qtdeDeNumeros; i++) {
            Integer numeros = s.nextInt();
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
    }
}

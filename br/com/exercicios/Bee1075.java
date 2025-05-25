package br.com.exercicios;

import java.util.Scanner;

// Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão resto igual a 2.
public class Bee1075 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer n = s.nextInt();

        for (int i = 1; i <= 10000; i++) {
            if( i % n == 2) {
                System.out.println(i);
            }
        }
    }
}

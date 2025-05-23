package br.com.exercicios;

import java.util.Scanner;

// Pares, Ímpares, Positivos e Negativos
public class Bee1066 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int par = 0, impar = 0, positivo = 0, negativo = 0;
        for (int i = 0; i < 5 ; i++) {
            int n = s.nextInt();
            if(n % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            if(n < 0) {
                negativo++;
            } else if(n > 0) {
                positivo++;
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
        s.close();
    }
}

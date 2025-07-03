package br.com.exercicios;

import java.util.Scanner;

// Número Perfeito
public class Bee1164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casosTeste = sc.nextInt();

        if (casosTeste >= 1 &&  casosTeste <= 100) {

            while (casosTeste > 0) {
                int numero = sc.nextInt();
                int divisores = 0;

                for (int i = 1; i < numero ; i++) {
                    if(numero % i == 0) {
                        divisores += i;
                    }
                }
                if (divisores == numero) {
                    System.out.println(numero + " eh perfeito");
                } else {
                    System.out.println(numero + " nao eh perfeito");
                }

                casosTeste--;
            }

        }
        sc.close();
    }
}

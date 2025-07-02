package br.com.exercicios;

import java.util.Scanner;

// número primo
public class Bee1165 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosTeste = sc.nextInt();

        if (casosTeste >= 1 &&  casosTeste <= 100) {

            while (casosTeste > 0) {
                int numero = sc.nextInt();
                int divisores = 0;
                for (int i = 2; i * i <= numero ; i++) {
                    if (numero % i == 0) {
                        divisores++;
                        break;
                    }
                }
                if (numero == 1 || divisores > 0) {
                    System.out.println(numero + " nao eh primo");
                } else {
                    System.out.println(numero + " eh primo");
                }
                casosTeste--;
            }

        }



    }
}

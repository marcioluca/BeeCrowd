package br.com.exercicios;

import java.util.Scanner;

public class Bee1065 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer[] numeros = new Integer[5];
        int numerosPares = 0;
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = s.nextInt();
            if(numeros[i] % 2 == 0) {
                numerosPares++;
            }

        }
        System.out.println(numerosPares + " valores pares");

    }
}

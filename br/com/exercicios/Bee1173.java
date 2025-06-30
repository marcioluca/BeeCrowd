package br.com.exercicios;

import java.util.Scanner;

public class Bee1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int v =  sc.nextInt();
        numeros[0] = v;
        System.out.println("N[0]" + " = " + numeros[0]);
        for (int i = 1; i < numeros.length ; i++) {
            numeros[i] = numeros[i - 1] * 2;
            System.out.println("N[" + i + "] = " + numeros[i]);
        }

    }
}

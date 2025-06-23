package br.com.exercicios;

import java.util.Scanner;

// Ultrapassando Z..
public class Bee1150 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int z;

        do {
            z = s.nextInt();
        } while (z <= x);

        int proximo = x + 1;
        int cont = 1;

        while (x < z) {
            x += proximo;
            proximo++;
            cont++;
        }
        System.out.println(cont);
    }
}

package br.com.exercicios;

import java.util.Scanner;

public class Bee1943 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        int colocacoes[]  = {1, 3, 5, 10, 25, 50, 100};

        if(k == colocacoes[0]) {
            System.out.println("Top " + colocacoes[0]);
        } else if (k <= 3) {
            System.out.println("Top " + colocacoes[1]);
        } else if (k <= 5) {
            System.out.println("Top " + colocacoes[2]);
        } else if (k <= 10) {
            System.out.println("Top " + colocacoes[3]);
        } else if (k <= 25) {
            System.out.println("Top " + colocacoes[4]);
        } else if (k <= 50) {
            System.out.println("Top " + colocacoes[5]);
        } else if (k <= 100) {
            System.out.println("Top " + colocacoes[6]);
        }
        sc.close();
    }
}

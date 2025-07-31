package br.com.exercicios;

import java.util.Scanner;

public class Bee3046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(calcularTotalPecas(n));
        sc.close();
    }
    public static int calcularTotalPecas (int quantidade) {

        return ((quantidade + 1) * (quantidade + 2)) / 2;
    }
}

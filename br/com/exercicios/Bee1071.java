package br.com.exercicios;

import java.util.Scanner;

// Soma de Impares Consecutivos I
public class Bee1071 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Integer x = s.nextInt();
        Integer y = s.nextInt();
        Integer menor = Math.min(x, y);
        Integer maior = Math.max(x, y);
        Integer soma = 0;
        for (int i = menor + 1; i < maior ; i++) {
            if(i % 2 != 0) {
                soma += i;
            }
        }
        System.out.println(soma);
        s.close();
    }
}

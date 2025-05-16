package br.com.exercicios;

import java.util.Scanner;

public class Bee1930 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Integer[] tomadas = new Integer[4];
        Integer limiteDeAparelhos = 1;
        for (int i = 0; i < tomadas.length; i++) {
            tomadas[i] = s.nextInt();
            limiteDeAparelhos += tomadas[i];
            limiteDeAparelhos--;
        }
        System.out.println(limiteDeAparelhos);
    }

}

package br.com.exercicios;

import java.util.Scanner;

public class Bee1115 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer[] cordenadas = new Integer[2];
        Integer x;
        Integer y;
        do{
            for (int i = 0; i < cordenadas.length ; i++) {
                cordenadas[i] = s.nextInt();
            }
            x = cordenadas[0];
            y = cordenadas[1];
            if(x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if(x > 0 && y < 0) {
                System.out.println("quarto");
            }
        } while (x != 0 || y != 0);

    }
}

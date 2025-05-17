package br.com.exercicios;

import java.util.Scanner;

public class Bee1070 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer x = s.nextInt();
        Integer cont = 0;
        while (cont < 6) {
            if(x % 2 != 0) {
                System.out.println(x);
                cont++;
            }
            x++;
        }

    }
}

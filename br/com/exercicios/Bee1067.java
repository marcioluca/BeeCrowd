package br.com.exercicios;

import java.util.Scanner;
// Números Ímpares
public class Bee1067 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Integer x = s.nextInt();
        for (int i = 1; i <= x; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        s.close();
    }
}

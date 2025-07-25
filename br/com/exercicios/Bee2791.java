package br.com.exercicios;

import java.util.Scanner;

// Feijão

public class Bee2791 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            if(sc.nextInt() == 1) {
                System.out.println(i);
                break;
            }
        }
    }
}

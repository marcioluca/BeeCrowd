package br.com.exercicios;

import java.util.Scanner;

public class Bee1866 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        int n;
        for(int i = 1; i <= c ; i++) {
            n = s.nextInt();
            if(n >= 1 && n <= 1000){
                if(n % 2 == 0) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }

            }
        }
    }
}

package br.com.exercicios;

import java.io.IOException;
import java.util.Scanner;

public class Bee1146 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        while( x != 0) {

            for (int i = 1; i <= x ; i++) {
                if (i == x) System.out.print(i + "\n");
                else System.out.print(i + " ");
            }
            x = s.nextInt();
        }
    }
}

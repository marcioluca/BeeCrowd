package br.com.exercicios;
import java.util.Arrays;
import java.util.Scanner;

public class Bee1175 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] n = new int[20];

        for (int i = 0; i < n.length; i++) {
            n[i] = s.nextInt();
        }

        for (int i = 0; i < n.length / 2 ; i++) {
            int aux = n[i];
            n[i] = n[n.length - 1 - i] ;
            n[n.length - 1 - i]  = aux;
        }

        for (int i = 0; i < n.length; i++) {
            System.out.println("N[" + i + "] = " + n[i]);
        }
        s.close();
    }
}

package br.com.exercicios;
import java.util.Scanner;

public class Bee1044 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numeros  = new int[2];

        for (int i = 0; i < 2; i++) {
            numeros[i] = s.nextInt();
        }

        int a =  numeros[0];
        int b =  numeros[1];

        if(b % a == 0 || a % b == 0 ){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        s.close();
    }
}

package br.com.exercicios;

import java.util.Scanner;

// soma dos ímpares consecutivos III
public class Bee1158 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x, y;

        while (n != 0) {
            x = s.nextInt();
            y = s.nextInt();

            int soma = 0;
            int contador = 0;

            //  se x não for impar, ajusta-se para o proximo valor impar.
            if(x % 2 == 0) {
                x++;
            }

            //  soma os y números consecutivos começando com x
            while(contador < y) {
                soma += x;
                x += 2;
                contador++;
            }
            System.out.println(soma);
            n--;
        }

    }
}

package br.com.exercicios;


import java.util.Scanner;

// Soma de pares consecutivos
public class Bee1159 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        do {
            x = sc.nextInt();
            if (x == 0) break;

            if (x % 2 != 0) {
                x++; // garante que começa com número par
            }

            int soma = 0; // reinicia a soma a cada novo número

            for (int i = 0; i < 5; i++) {
                soma += x;
                x += 2;
            }

            System.out.println(soma);
        } while (x != 0);

    }

}

package br.com.exercicios;

import java.util.Scanner;

public class Bee1154 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int idade;
        int quantidadeIdades = 0;
        int totalDeIdades = 0;
        double mediaDasIdades;

        while (true) {
            idade = s.nextInt();

            if(idade < 0) {
                break;
            }

            totalDeIdades += idade;
            quantidadeIdades += 1;
        }
        mediaDasIdades = (double) totalDeIdades / quantidadeIdades;
        System.out.printf("%.2f\n", mediaDasIdades);
    }
}

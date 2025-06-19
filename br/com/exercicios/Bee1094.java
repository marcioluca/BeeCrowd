package br.com.exercicios;

import java.util.Scanner;

public class Bee1094 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int totalCobaias = 0, totalCoelhos = 0, totalSapos = 0, totalRatos = 0;
        while (n != 0) {
            int qtdeCobaia = leitor.nextInt();
            char tipoCobaia = leitor.next().charAt(0);
            switch (tipoCobaia) {
                case 'C':
                    totalCoelhos += qtdeCobaia;
                    break;
                case 'R':
                    totalRatos += qtdeCobaia;
                    break;
                case 'S':
                    totalSapos += qtdeCobaia;
                    break;
            }
            totalCobaias += qtdeCobaia;
            n--;
        }


        double percentualCoelho = ((double) (totalCoelhos * 100)/ totalCobaias);
        double percentualRato = ((double) (totalRatos * 100) / totalCobaias);
        double percentualSapo = ((double)  (totalSapos * 100) / totalCobaias);
        System.out.println("Total: " + totalCobaias +" cobaias");
        System.out.println("Total de coelhos: " + totalCoelhos);
        System.out.println("Total de ratos: " + totalRatos);
        System.out.println("Total de sapos: " + totalSapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentualCoelho);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentualRato);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentualSapo);



    }
}

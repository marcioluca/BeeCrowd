package br.com.exercicios;
import java.util.Scanner;

/*
    * Problema Bee 1080 - Maior e Posição
    *
    * Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.
    *
    * Entrada
    * A entrada contém 100 números inteiros, positivos e distintos.
    *
    * Saída
    * O primeiro valor da saída é o maior dos 100 valores lidos. A segunda linha deve apresentar a posição do maior valor, considerando a primeira posição como 1 (um).
 */


public class Bee1080 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Integer[] valores = new Integer[100];

        for (int i = 0; i < 100; i++) {
            valores[i] = s.nextInt();
        }
        int valorMaximo = 0;
        int posicaovalorMaximo = 0;
        for (int i = 1; i < 100; i++) {
            if(valores[i] > valorMaximo) {
                valorMaximo = valores[i];
                posicaovalorMaximo = i;
                posicaovalorMaximo += 1;

            }

        }
        System.out.println(valorMaximo);
        System.out.println(posicaovalorMaximo);
        s.close();
    }

}

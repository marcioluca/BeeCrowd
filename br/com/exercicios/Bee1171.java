package br.com.exercicios;
import java.util.Scanner;

/**
 * Bee 1171 - Frequência de Números
 *
 * Descrição: Este programa lê uma quantidade de números inteiros e conta a frequência
 * de cada número no intervalo de 0 a 2000. Em seguida, imprime cada número e sua
 * respectiva frequência.
 *
 * Entrada: A primeira linha contém um inteiro N (1 ≤ N ≤ 1000), o número de casos de teste.
 * Em seguida, N linhas, cada uma contendo um inteiro X (0 ≤ X ≤ 2000).
 *
 * Saída: Para cada número que aparece pelo menos uma vez, imprima o número e a quantidade
 * de vezes que ele aparece.
 */


public class Bee1171 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadeDeNumeros = sc.nextInt();
        int[] frequencias = new int[2001];

        for (int i = 0; i < quantidadeDeNumeros; i++) {
            int numero = sc.nextInt();
            frequencias[numero]++;
        }
        for (int i = 0; i < frequencias.length; i++) {
            if (frequencias[i] > 0) {
                System.out.println(i + " aparece " + frequencias[i] + " vez(es)");
            }
        }

        sc.close();
    }}


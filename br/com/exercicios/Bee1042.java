package br.com.exercicios;
import java.util.Scanner;
import java.util.Arrays;

public class Bee1042 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numeros = new int[3];

        for (int i = 0; i < 3; i++) {
            numeros[i] = s.nextInt();
        }

        // Criar uma cópia do array original para manter a ordem inicial
        int[] original = numeros.clone();

        // Ordenar o array
        Arrays.sort(numeros);

        // Imprimir em ordem crescente
        for (int num : numeros) {
            System.out.println(num);
        }

        // Linha em branco
        System.out.println();

        // Imprimir na ordem original
        for (int num : original) {
            System.out.println(num);
        }

        s.close();
    }
}
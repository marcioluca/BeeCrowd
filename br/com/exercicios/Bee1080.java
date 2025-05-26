package br.com.exercicios;
import java.util.Scanner;
// Maior e Posição
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
    }

}

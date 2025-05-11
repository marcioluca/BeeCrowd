package br.com.exercicios;


import java.util.Scanner;

// São lidos 6 valores e o console exibe apenas os valores positivos.
public class Bee1060 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Double[] numeros = new Double[6];
        int valoresPositivos = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = s.nextDouble();
            if(numeros[i] > 0){
                valoresPositivos++;
            }
        }
        System.out.println(valoresPositivos + " valores positivos");
    }
}

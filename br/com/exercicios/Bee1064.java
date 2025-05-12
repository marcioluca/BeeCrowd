package br.com.exercicios;

import java.util.Scanner;

public class Bee1064 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Double[] valores = new Double[6];
        Integer valoresPositivos = 0;
        Double somaValoresPositivos = 0.0;
        Double media = 0.0;
        for (int i = 0; i < valores.length; i++) {
            valores[i] = s.nextDouble();
            if(valores[i] > 0) {
                valoresPositivos++;
                somaValoresPositivos += valores[i];
            }
        }
        media = somaValoresPositivos / valoresPositivos;
        System.out.println(valoresPositivos + " valores positivos");
        System.out.printf("%.1f\n", media);

    }
}

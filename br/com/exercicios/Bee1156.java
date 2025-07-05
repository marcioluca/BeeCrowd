package br.com.exercicios;

public class Bee1156 {
    public static void main(String[] args) {
        double s = 0.0;
        int denominador = 1;

        for (int numerador = 1; numerador <= 39 ; numerador+=2) {
            s += (double) numerador / denominador;
            denominador *= 2;
        }
        System.out.printf("%.2f\n" ,s);
    }
}

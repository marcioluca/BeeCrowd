package br.com.exercicios;
import java.util.Scanner;

public class Bee1117 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int notasValidas = 0;
        double soma = 0.0;

        while (notasValidas < 2) {
            double nota = s.nextDouble();

            if (nota >= 0.0 && nota <= 10.0) {
                soma += nota;
                notasValidas++;
            } else {
                System.out.println("nota invalida");
            }
        }

        double media = soma / 2.0;


        System.out.printf("media = %.2f\n", media);

        s.close();
    }
}

package br.com.exercicios;

import java.util.Scanner;

public class Bee1043 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        // verificar se é um triangulo
        if( a + b > c && a + c > b && b + c > a){
            double p = a + b + c;
            System.out.printf("Perimetro = %.1f%n", p);

        } else {
            double p = (a + b) * c;
            System.out.printf("Area = %.1f%n", p);
        }
        s.close();
    }
}

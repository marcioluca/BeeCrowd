package br.com.exercicios;
import java.util.Arrays;
import java.util.Scanner;

public class Bee1045 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Double[] lados = new Double[3];

        lados[0] = s.nextDouble();
        lados[1] = s.nextDouble();
        lados[2] = s.nextDouble();
        Arrays.sort(lados);
        double a = lados[2];
        double b = lados[1];
        double c = lados[0];

        if(a >= b + c){
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            boolean retangulo = (a * a) == (b * b) + (c * c);
            boolean obtusangulo = (a * a) > (b * b) + (c * c);
            boolean acutangulo = (a * a) < (b * b) + (c * c);
            if(retangulo){
                System.out.println("TRIANGULO RETANGULO");
            } if(obtusangulo) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } if(acutangulo) {
                System.out.println("TRIANGULO ACUTANGULO");
            } if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } if((a == b || b == c || a == c) && !(a == b && b == c)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        s.close();
    }
}

package br.com.exercicios;
// Desafio: Tabuada
import java.util.Scanner;
public class Bee1078 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Integer n = s.nextInt();

        for (int i = 1; i < 11; i++) {
            Integer rst = i * n;
            System.out.println(i + " x " + n + " = " + rst);
        }
        s.close();
    }
}

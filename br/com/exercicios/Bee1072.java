package br.com.exercicios;

import java.util.Scanner;


// Intervalo 2
public class Bee1072 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Integer n = s.nextInt();
        Integer in = 0;
        Integer out = 0;
        for(int i = 0; i < n; i++) {
            Integer x = s.nextInt();
            if(x >= 10 && x <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        s.close();

    }
}

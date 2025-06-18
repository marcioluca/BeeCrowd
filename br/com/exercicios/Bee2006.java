package br.com.exercicios;

import java.util.Scanner;

public class Bee2006 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        if(t >= 1 && t <= 4) {
            int respCompetidor;
            int quantidadeAcertos = 0;
            for (int i = 1; i <= 5; i++) {
                respCompetidor = s.nextInt();
                if(respCompetidor == t) {
                    quantidadeAcertos++;
                }
            }
            System.out.println(quantidadeAcertos);
            s.close();
        }
    }
}

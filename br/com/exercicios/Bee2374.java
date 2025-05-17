package br.com.exercicios;

import java.util.Scanner;

public class Bee2374 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer pressaoSolicitada = s.nextInt();
        Integer pressaoLida = s.nextInt();
        Integer pressaoFinal  = pressaoSolicitada - pressaoLida;
        System.out.println(pressaoFinal);
    }
}

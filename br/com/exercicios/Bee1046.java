package br.com.exercicios;

import java.util.Scanner;

// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar
// em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

public class Bee1046 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer hInicial = s.nextInt();
        Integer hFinal = s.nextInt();
        Integer dia = 24;
        Integer duracaoJogo;
        if(hInicial < hFinal) {
         duracaoJogo = hFinal - hInicial;
        } else {
            duracaoJogo = (dia - hInicial) + hFinal;
        }
        if(hInicial == 0 && hFinal == 0){
            duracaoJogo = dia;
        }
        System.out.println("O JOGO DUROU " + duracaoJogo  +" HORA(S)");
    }
}

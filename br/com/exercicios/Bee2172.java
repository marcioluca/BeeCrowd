package br.com.exercicios;
import java.util.Scanner;

/**
 * Solução para o problema 2172 (Evento) do Beecrowd.
 * O programa lê um multiplicador de aumento e uma quantidade de experiência (XP).
 * Ele calcula e imprime o XP total até que a entrada seja "0 0".
 */

public class Bee2172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int multiplicador = sc.nextInt();
            long xpMonstro = sc.nextLong();

            if(multiplicador == 0 && xpMonstro == 0) {
                break;
            }
            long xpTotal = xpMonstro * multiplicador;
            System.out.println(xpTotal);
        }
        sc.close();
    }
}

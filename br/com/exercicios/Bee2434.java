package br.com.exercicios;

import java.util.Scanner;

/**
 * Solução para o problema 2434 do BeeCrowd ("Saldo do Vovô").
 * O programa lê um saldo inicial e uma série de transações,
 * e então exibe o menor saldo registrado durante o período.
 */

public class Bee2434 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDias = scanner.nextInt();
        int saldoAtual = scanner.nextInt();

        int menorSaldo = saldoAtual;

        for (int i = 0; i < numDias; i++) {
            int valorTransacao = scanner.nextInt();

            saldoAtual += valorTransacao;

            if (saldoAtual < menorSaldo) {
                menorSaldo = saldoAtual;
            }
        }

        System.out.println(menorSaldo);

        scanner.close();
    }
}

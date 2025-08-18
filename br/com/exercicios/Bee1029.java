package br.com.exercicios;
import java.util.Scanner;

/**
 * Bee 1029 - Fibonacci com Contagem de Chamadas
 *
 * Descrição: Este programa calcula o n-ésimo número de Fibonacci e conta o número
 * de chamadas recursivas feitas durante o cálculo.
 *
 * Entrada: A primeira linha contém um inteiro N (1 ≤ N ≤ 40), o número de casos de teste.
 * Em seguida, N linhas, cada uma contendo um inteiro X (0 ≤ X ≤ 40).
 *
 * Saída: Para cada caso de teste, imprima a quantidade de chamadas recursivas e o valor
 * do n-ésimo número de Fibonacci.
 */

public class Bee1029 {

    static int numChamadas;

    public static int fibonacci(int n) {
        numChamadas++;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            numChamadas = 0;
            int resultado = fibonacci(X);
            System.out.println("fib(" + X + ") = " + (numChamadas - 1) + " calls = " + resultado);
        }
        scanner.close();
    }
}
package br.com.exercicios;
import java.util.Scanner;

public class Bee1129 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }

            for (int i = 0; i < n; i++) {
                int[] respostas = new int[5];
                for (int j = 0; j < 5; j++) {
                    respostas[j] = scanner.nextInt();
                }

                char resultado = processarRespostas(respostas);
                System.out.println(resultado);
            }
        }

        scanner.close();
    }

    private static char processarRespostas(int[] respostas) {
        int countPreto = 0;
        int indiceMarcado = -1;

        for (int i = 0; i < 5; i++) {
            if (respostas[i] <= 127) {
                countPreto++;
                indiceMarcado = i;
            }
        }

        if (countPreto == 1) {
            return (char) ('A' + indiceMarcado);
        } else {
            return '*';
        }
    }
}

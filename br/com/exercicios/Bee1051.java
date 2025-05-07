package br.com.exercicios;

import java.util.Scanner;
import java.util.Locale;

public class Bee1051 {
    public static void main(String[] args) {
        // Garante que o ponto seja usado como separador decimal, não a vírgula
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Lê o salário com ponto flutuante
        double salario = sc.nextDouble();
        double imposto = 0.0; // Variável para armazenar o total de imposto

        if (salario <= 2000.00) {
            // Se o salário for até 2000, não paga imposto
            System.out.println("Isento");
        } else if (salario <= 3000.00) {
            // Se estiver entre 2000.01 e 3000.00, paga 8% apenas sobre o que passa de 2000
            imposto = (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        } else if (salario <= 4500.00) {
            // Se estiver entre 3000.01 e 4500.00
            // Paga 8% sobre os 1000 da segunda faixa (2000.01 a 3000.00)
            // E 18% sobre o que passa de 3000.00
            imposto = (1000.00 * 0.08) + ((salario - 3000.00) * 0.18);
            System.out.printf("R$ %.2f%n", imposto);
        } else {
            // Se for acima de 4500.00
            // Paga 8% sobre os 1000 da segunda faixa
            // 18% sobre os 1500 da terceira faixa
            // 28% sobre o que ultrapassa os 4500.00
            imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + ((salario - 4500.00) * 0.28);
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close(); // Fecha o scanner para liberar o recurso
    }
}

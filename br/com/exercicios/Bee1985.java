package br.com.exercicios;
import java.util.Scanner;

// Preço do Produto
// https://www.beecrowd.com.br/judge/pt/problems/view/1985

public class Bee1985 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        double valorTotal  = 0.0;
        while(p != 0) {
            int codigo = sc.nextInt();
            int quantidade = sc.nextInt();
            double produto = 0.0;

            switch (codigo) {
                case 1001:
                    produto = 1.50;
                    break;
                case 1002:
                    produto = 2.50;
                    break;
                case 1003:
                    produto = 3.50;
                    break;
                case 1004:
                    produto = 4.50;
                    break;
                case 1005:
                    produto = 5.50;
                    break;
            }

            valorTotal += calcularValorTotal(produto, quantidade);
            p--;
        }
        System.out.printf("%.2f", valorTotal);
        sc.close();
    }
    public static double calcularValorTotal(double produto, double quantidade) {
        return (produto * quantidade);
    }
}
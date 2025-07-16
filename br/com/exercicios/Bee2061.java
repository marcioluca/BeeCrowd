package br.com.exercicios;


import java.util.Scanner;

// As abas de Péricles
public class Bee2061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            String opcao = sc.nextLine();
            if(opcao.equals("fechou")) {
                m += 1;
            } else if (opcao.equals("clicou")) {
                m -= 1;
            }
        }
        System.out.println(m);
    }
}

package br.com.exercicios;

import java.util.Scanner;

public class Bee1114 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int senhaCorreta = 2002;
        int senha;

        while (true) {
            senha = s.nextInt();
            if (senha == senhaCorreta) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        }
        s.close();
    }
 }

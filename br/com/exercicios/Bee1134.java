package br.com.exercicios;

import java.util.Scanner;
// Tipo de Combustível
public class Bee1134 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tipoCombustivel = 0, diesel = 0, gasolina = 0, alcool = 0;
        while (tipoCombustivel != 4) {
            tipoCombustivel = s.nextInt();
            switch (tipoCombustivel){
                case 1: alcool++; break;
                case 2: gasolina++; break;
                case 3: diesel++; break;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        s.close();
    }
}

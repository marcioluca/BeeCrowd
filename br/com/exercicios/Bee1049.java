package br.com.exercicios;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Bee1049 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String animal = s.nextLine();
        String tipoAnimal = s.nextLine();
        String tipoAlimentacao = s.nextLine();
        if (animal.equals("vertebrado") && tipoAnimal.equals("ave") && tipoAlimentacao.equals("carnivoro")) {
            System.out.println("aguia");
        } else if (animal.equals("vertebrado") && tipoAnimal.equals("ave") && tipoAlimentacao.equals("onivoro")) {
            System.out.println("pomba");
        } else if (animal.equals("vertebrado") && tipoAnimal.equals("mamifero") && tipoAlimentacao.equals("onivoro")) {
            System.out.println("homen");
        } else if (animal.equals("vertebrado") && tipoAnimal.equals("mamifero") && tipoAlimentacao.equals("herbivoro")) {
            System.out.println("vaca");
        } else if (animal.equals("invertebrado") && tipoAnimal.equals("inseto") && tipoAlimentacao.equals("hematofago")) {
            System.out.println("pulga");
        } else if (animal.equals("invertebrado") && tipoAnimal.equals("inseto") && tipoAlimentacao.equals("herbivoro")) {
            System.out.println("lagarta");
        } else if (animal.equals("invertebrado") && tipoAnimal.equals("anelideo") && tipoAlimentacao.equals("hematofago")) {
            System.out.println("sanguessuga");
        } else if (animal.equals("invertebrado") && tipoAnimal.equals("anelideo") && tipoAlimentacao.equals("onivoro")) {
            System.out.println("minhoca");
        }
    }
}

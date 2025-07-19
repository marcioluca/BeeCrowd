package br.com.exercicios;

import java.util.Scanner;

public class Bee2936 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int portionsCurupira = scanner.nextInt();
        int portionsBoitata = scanner.nextInt();
        int portionsBoto = scanner.nextInt();
        int portionsMapinguari = scanner.nextInt();
        int portionsIara = scanner.nextInt();


        int curupira = 300;
        int boitata = 1500;
        int boto = 600;
        int mapinguari = 1000;
        int iara = 150;
        int donaChica = 225;


        int totalMandioca = (portionsCurupira * curupira) +
                (portionsBoitata * boitata) +
                (portionsBoto * boto) +
                (portionsMapinguari * mapinguari) +
                (portionsIara * iara) +
                donaChica;
        System.out.println(totalMandioca);

        scanner.close();}
}

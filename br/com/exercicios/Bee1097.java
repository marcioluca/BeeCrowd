package br.com.exercicios;

public class Bee1097 {
    public static void main(String[] args) {
        int i = 1;
        int j = 7;
        do {
            System.out.println("I=" + i  + " J=" + j) ;
            j -= 1;
            System.out.println("I=" + i  + " J=" + j) ;
            j -= 1;
            System.out.println("I=" + i  + " J=" + j) ;
            j += 4;
            i += 2;
        } while (i < 10);

    }
}

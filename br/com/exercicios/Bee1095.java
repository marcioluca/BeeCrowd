package br.com.exercicios;

// Sequencia IJ 1
public class Bee1095 {
    public static void main(String[] args) {
        int n = 1;
        int n2 = 60;
        for (int i = 0; i <= 12; i++) {
            System.out.println("I=" + n + " J=" + n2);
            n += 3;
            n2 -= 5;
        }
    }
}

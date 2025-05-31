package br.com.exercicios;

// Sequencia IJ 1
public class Bee1095 {
    public static void main(String[] args) {
        int i = 1;
        int j = 60;
        for (int n = 0; n <= 12; n++) {
            System.out.println("I=" + i + " J=" + j);
            i += 3;
            j -= 5;
        }
    }
}

package br.com.exercicios;
import java.util.Scanner;

public class Bee1858 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int t[] = new int[n];
        for (int i = 0; i < t.length; i++) {
            t[i] = s.nextInt();
        }
        int minimo = t[0];
        int melhorPessoa = 1;

        for (int i = 1; i < n; i++) {
            if(t[i] < minimo) {
                minimo = t[i];
                melhorPessoa = i + 1;
            } else if(t[i] == minimo && (i + 1) < melhorPessoa) {
                melhorPessoa = i + 1;
            }
        }
        System.out.println(melhorPessoa);
        s.close();
    }

}

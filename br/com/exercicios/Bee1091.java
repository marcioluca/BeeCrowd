package br.com.exercicios;
import java.util.Scanner;

//  Divisão da Nlogônia
public class Bee1091 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int K = scanner.nextInt();
            if (K == 0) {
                break;
            }
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            for (int i = 0; i < K; i++) {
                int X = scanner.nextInt();
                int Y = scanner.nextInt();

                if (X == N || Y == M) {
                    System.out.println("divisa");
                } else if (X < N && Y > M) {
                    System.out.println("NO");
                } else if (X > N && Y > M) {
                    System.out.println("NE");
                } else if (X > N && Y < M) {
                    System.out.println("SE");
                } else {
                    System.out.println("SO");
                }
            }
        }
        scanner.close();
    }
}

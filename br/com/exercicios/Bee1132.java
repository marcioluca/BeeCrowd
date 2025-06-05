    package br.com.exercicios;
    import java.util.Scanner;

    // Múltiplos de 13
    public class Bee1132 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            int x = s.nextInt();
            int y = s.nextInt();
            int soma = 0;

            int menor = Math.min(x, y);
            int maior = Math.max(x, y);
            for (int i = menor; i <= maior; i++) {
                if(i % 13 != 0) {
                    soma += i;
                }
            }
            System.out.println(soma);
            s.close();
        }
    }

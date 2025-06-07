package br.com.exercicios;

import java.util.Scanner;
// Funções
public class Bee1555 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casosTestes = s.nextInt();
        int x, y ;
        while (casosTestes > 0) {
            x = s.nextInt();
            y = s.nextInt();
            casosTestes--;
            if(x >= 1 && x <= 100 && y >= 1 && y <= 100) {
            double rafaelFuncao =  Math.pow(3 * x, 2) + Math.pow(y, 2);
            double betoFuncao = 2 * Math.pow(x, 2) + Math.pow(5 * y, 2);
            double carlosFuncao = -100 * x + Math.pow(y, 3);

            if(rafaelFuncao > betoFuncao && rafaelFuncao > carlosFuncao) {
                System.out.println("Rafael ganhou");
            } else if (betoFuncao > rafaelFuncao && betoFuncao > carlosFuncao) {
                System.out.println("Beto ganhou");
            } else if (carlosFuncao > betoFuncao && carlosFuncao > rafaelFuncao) {
                System.out.println("Carlos ganhou");
            }
            }
}


        s.close();


    }

}

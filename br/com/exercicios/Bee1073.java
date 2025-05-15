package br.com.exercicios;

import java.util.Scanner;

public class Bee1073 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Integer n = s.nextInt();
        Integer rst;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0){
               rst = i * i;
                System.out.println(i + "^" + 2 + " = " + rst);
            }
        }
    }
}

package br.com.exercicios;

import java.util.Scanner;

// Grenais
public class Bee1131 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int resposta;
        int inter, gremio;
        int totalDeGrenais = 0,vitoriasGremio = 0, vitoriasInter = 0, empate = 0;
        do {
            inter = leitor.nextInt();
            gremio = leitor.nextInt();
            System.out.println("Novo grenal (1-sim 2-nao)");
            resposta = leitor.nextInt();
            if(gremio > inter) {
               vitoriasGremio += 1;
            } else if (inter > gremio) {
               vitoriasInter += 1;
            } else {
                empate += 1;
            }
            totalDeGrenais +=1 ;
        } while (resposta != 2);
        String maisVitorioso = "";
        if(vitoriasGremio > vitoriasInter) {
            maisVitorioso = "Gremio";
        } else if(vitoriasInter > vitoriasGremio){
            maisVitorioso = "Inter";
        }
        System.out.println(totalDeGrenais + " grenais");
        System.out.println("Inter:" + vitoriasInter);
        System.out.println("Gremio:" + vitoriasGremio);
        System.out.println("Empates:" + empate);
        System.out.println( maisVitorioso + " venceu mais");
        leitor.close();
    }
}

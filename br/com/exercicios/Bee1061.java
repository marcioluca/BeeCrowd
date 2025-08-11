package br.com.exercicios;

import java.util.Scanner;

// Bee 1061 - Tempo de um Evento
// https://www.beecrowd.com.br/judge/pt/problems/view/1061
public class Bee1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diaInicio = Integer.parseInt(sc.nextLine().split(" ")[1]);
        String[] horaInicioStr = sc.nextLine().replaceAll(" ", "").split(":");
        int horaInicio = Integer.parseInt(horaInicioStr[0]);
        int minutoInicio = Integer.parseInt(horaInicioStr[1]);
        int segundoInicio = Integer.parseInt(horaInicioStr[2]);

        int diaFim = Integer.parseInt(sc.nextLine().split(" ")[1]);
        String[] horaFimStr = sc.nextLine().replaceAll(" ", "").split(":");
        int horaFim = Integer.parseInt(horaFimStr[0]);
        int minutoFim = Integer.parseInt(horaFimStr[1]);
        int segundoFim = Integer.parseInt(horaFimStr[2]);

        int inicioEmSegundos = ((diaInicio * 24 + horaInicio) * 60 + minutoInicio) * 60 + segundoInicio;
        int fimEmSegundos = ((diaFim * 24 + horaFim) * 60 + minutoFim) * 60 + segundoFim;
        int duracao = fimEmSegundos - inicioEmSegundos;

        int dias = duracao / (24 * 60 * 60);
        duracao %= (24 * 60 * 60);
        int horas = duracao / (60 * 60);
        duracao %= (60 * 60);
        int minutos = duracao / 60;
        int segundos = duracao % 60;

        System.out.printf("%d dia(s)\n", dias);
        System.out.printf("%d hora(s)\n", horas);
        System.out.printf("%d minuto(s)\n", minutos);
        System.out.printf("%d segundo(s)\n", segundos);

        sc.close();
    }
}

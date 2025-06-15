package br.com.exercicios;
public class Bee2747 {
    public static void main(String[] args) {

        String linhaSuperiorInferior = new String(new char[39]).replace("\0", "-");
        System.out.println(linhaSuperiorInferior);

        for (int i = 0; i < 5; i++) {
            System.out.println("|                                     |");
        }

        System.out.println(linhaSuperiorInferior);
    }
}
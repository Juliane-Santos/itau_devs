package exercicios.aulasDaPlaylistDoProfessorIsidro;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número.");
        numero = teclado.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Você digitou 1");
                break;
            case 2:
                System.out.println("Você digitou 2");
                break;
            default:
                System.out.println("Você digitou outro valor.");
        }

    }
}
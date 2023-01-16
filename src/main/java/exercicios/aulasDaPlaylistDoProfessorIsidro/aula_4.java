package exercicios.aulasDaPlaylistDoProfessorIsidro;

/*Programa que pede para digitar um número de 1 a 3, caso a solicitação seja atendidda ele vai exibir o número digitado, caso não exibirá que nem um dos números solicitados foi digitado.*/

import java.util.Scanner;

public class aula_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int valor;
        System.out.println("Digite um valor de 1 a 3:");
valor = teclado.nextInt();
        switch (valor) {
            case 1:
                System.out.println("Você digitou o valor 1.");
                break;
            case 2:
                System.out.println("Você digitou o valor 2.");
                break;
            case 3:
                System.out.println("Você digitou o valor 3.");
                break;
            default:
                System.out.println("Você não digitou nem 1, nem 2 e 3.");
        }
    }
}
package exercicios.aulasDaPlaylistDoProfessorIsidro;

/*Programa que recebe um valor e imprime a contagem enquanto for < ou = a 1.*/

import java.util.Scanner;

public class Aula_5_while {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, contador;
        System.out.println("Digite um valor:");
        valor = teclado.nextInt();
        System.out.println("Contando de um até o valor:");
        contador = 1;
                while (contador <= valor) {
                    System.out.println("Contador vale " +contador);
                    contador++;
                }
    }
}

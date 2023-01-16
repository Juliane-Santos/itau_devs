package exercicios.aulasDaPlaylistDoProfessorIsidro;

import java.util.Scanner;

public class aula_5_for {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;
System.out.println("Digite um número:");
        valor = teclado.nextInt();
                System.out.println("Contando de 1 até o valor:");
        for (int contador =1; contador <= valor; contador++) {
                    System.out.println("Valor vale " + contador);
                }
    }
}

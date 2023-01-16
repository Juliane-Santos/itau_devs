package exercicios.aulasDaPlaylistDoProfessorIsidro;

import java.util.Scanner;

public class aula_5_do_while {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, contador;
        System.out.println("Digite um número:");
        valor = teclado.nextInt();
        System.out.println("Contando de 1 até o valor:");
        contador = 1;
        do {
            System.out.println("Contador vale " + contador);
            contador++;
    } while (contador <= valor) ;
    }
}

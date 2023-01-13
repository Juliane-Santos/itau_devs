package exercicios.aulasDaPlaylistDoProfessorIsidro;

/*O programa vai pedir um valor inteiro, caso receba o que pedio vai imprimir uma mensagem, caso não imprimirá uma outra finalizando o programa*/

import java.util.Scanner;

public class aula_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;
        System.out.println("Digite um valor inteiro:");
        valor = teclado.nextInt();
        if (valor >= 0) {
System.out.println("O valor " + valor + " é positivo.");
        } else {
        System.out.println("Fim do programa."); }
    }
}
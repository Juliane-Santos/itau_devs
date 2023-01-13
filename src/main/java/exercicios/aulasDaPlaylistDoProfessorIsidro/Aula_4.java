package exercicios.aulasDaPlaylistDoProfessorIsidro;

/*O programa vai receber o valor, caso seja positivo ele vai imprimir uma mensagem informando isso ao usuário e caso não exibirá outra finalizando o programa*/

import java.util.Scanner;

public class Aula_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;
        System.out.println("Digite um valor:");
        valor = teclado.nextInt();
        if (valor >= 0) {
            System.out.println("O valor " + valor + " é positivo.");
        } else {
        System.out.println("Fim do programa."); }
    }
}
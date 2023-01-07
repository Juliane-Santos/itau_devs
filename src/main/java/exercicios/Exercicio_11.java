
package exercicios;

/* 11. Fazer um programa que leia a data de nascimento de uma pessoa e verifique se ela nasceu
em um ano bissexto ou não. */
import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anoNascimento;
        System.out.println("Digite o ano de nascimento.");
        anoNascimento = teclado.nextInt();
        if ((anoNascimento % 4) == 0 && (anoNascimento % 100) != 0) {
            System.out.println("Que legal! Você nasceu em um ano bissexto");
} else {
            System.out.println("Você não nasceu em um ano bissexto.");
        }
    }
}

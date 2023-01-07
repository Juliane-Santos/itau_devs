package exercicios;

/*16. Faça um programa que entre com a idade de uma pessoa e informe:
a. se é maior de idade
b. se é menor de idade
c. se é maior de 65 anos. */

import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        System.out.println("Informe sua idade.");
        idade = teclado.nextInt();
        if (idade >= 65) {
            System.out.println("Você está na terceira idade.");
        } else if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}

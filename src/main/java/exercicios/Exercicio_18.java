package exercicios;

/*18. Faça um programa que leia duas notas bimestrais de um aluno, calcule sua média e
        imprima:
        se média entre 9 e 10 aprovado com conceito A
        se média entre 8 e 9 aprovado com conceito B
        se média entre 6 e 8 aprovado com conceito C
        se média entre 3 e 6 em exame
        se média menor que 3 reprovado*/

import java.util.Scanner;

public class Exercicio_18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;
        System.out.println("Informe a primeira nota:");
        nota1 = teclado.nextDouble();
        System.out.println("Informe a segunda nota:");
        nota2 = teclado.nextDouble();
        media = (nota1 + nota2)/2;
System.out.println("Sua nota foi: " + media)    ;
        if (media >= 9 && media <= 10){
            System.out.println("Você foi aprovado com o conceito A!");
        } else if (media >= 8 && media < 9) {
            System.out.println("Você foi aprovado com o conceito B!");
        } else if (media >= 6 && media < 8) {
            System.out.println("Você foi aprovado com o conceito C!");
        } else if (media >= 3 && media < 6) {
            System.out.println("Em exame.");
        } else {
            System.out.println("Você foi reprovado.");
        }
    }
}

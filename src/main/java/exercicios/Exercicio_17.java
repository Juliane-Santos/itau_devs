package exercicios;

/*17. Faça um programa que leia o salário de uma pessoa e calcule o imposto devido, segundo
as regras:
a. se o salário é menor que $1000, então a pessoa está isenta de impostos
b. se o salário está entre $1000 e $2500, desconte 12,5% do salário
c. se o salário está entre $2500 e $5000, desconte 25% do salário
d. se o salário for maior que $5000, desconte um valor fixo de $1300.*/

import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            double salario, desconto;
        System.out.println("Informe o seu salário.");
        salario = teclado.nextDouble();
        if (salario < 1000) {
            System.out.println("Você está isento de imposto.");
        } else if (salario >= 1000 && salario <=2500){
            desconto = (salario * 12.5) / 100;
            System.out.println("Você tem um imposto de R$" + desconto);
        } else if (salario >= 2500 && salario < 5000) {
            desconto = (salario * 25) / 100;
            System.out.println("Você tem um desconto de R$" + desconto);
        } else {
            System.out.println("Você tem um desconto fixo de R$1300 ");
        }
    }
}

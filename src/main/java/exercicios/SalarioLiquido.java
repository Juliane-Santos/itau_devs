package exercicios;

import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Double valorHora, quantidadeHora, salarioBruto, salarioLiquido, desconto;
        System.out.println("Informe o valor por horas trabalhadas:");
        valorHora = teclado.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas:");
        quantidadeHora = teclado.nextDouble();
        System.out.println("Informe o valor do desconto do INSS:");
        desconto =  teclado.nextDouble();
        desconto /= 100;
        salarioBruto = valorHora * quantidadeHora;
        salarioLiquido = salarioBruto - (salarioBruto * desconto );
        System.out.println("O salário líquido é:"+ salarioLiquido);
    }
}

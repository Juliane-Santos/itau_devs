package exercicios;
/*
15.     Faça um programa para ler 3 valores e verificar se esses valores podem ser lados em um
        triângulo (a soma de 2 lados deve sempre ser maior que o 3o lado, independente de quais
        lados estejamos falando)*/

import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int v1, v2, v3;
        System.out.println("Digite trêz valores.");
        v1 = teclado.nextInt();
        v2 = teclado.nextInt();
        v3 = teclado.nextInt();
        if ((v1 + v2) > v3 && (v2 + v3) > v1 && (v3 + v1) > v2) {
            System.out.println("Esses valores podem ser lados em um triângulo.");
        } else {
            System.out.println("Esses valores não podem ser lados em um triângulo.");
        }
    }
}

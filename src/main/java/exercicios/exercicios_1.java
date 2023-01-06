package exercicios;

import java.util.Scanner;

public class exercicios_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Insira trêz números:");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();
        System.out.println("O número invertido é: "+n3+n2+n1);
    }
}

import java.util.Scanner;
public class Exercicio_1{
    public static void main(String abc[]){

        Scanner teclado= new Scanner (System.in);
        double n1, n2, media;
        System.out.println(" Digite a primeira nota ");
        n1= teclado.nextDouble();
        System.out.println(" Digite a segunda nota ");
        n2= teclado.nextDouble();
        media= (n1+n2)/2;
        System.out.println(" A sua média é:"+media+"pontos");
        if(media>= 6){
            System.out.println("Parabêns, você foi aprovado!");

        }
        else {
            System.out.println("Que pena, você foi reprovado");
        }
    }
}
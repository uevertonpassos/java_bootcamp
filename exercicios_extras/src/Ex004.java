//Elabore um programa em Java que solicite ao usuário um número de 1 a 7 e, em seguida, imprima o dia da semana correspondente utilizando um bloco switch case.

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número correspondente ao dia da semana: ");
        int DiaDaSemana = scanner.nextInt();

        switch(DiaDaSemana){

            case 1:
                System.out.println("Hoje é domingo!");
                break;
            case 2:
                System.out.println("Hoje é segunda!");
                break;
            case 3:
                System.out.println("Hoje é quarta!");
                break;
            case 4:
                System.out.println("Hoje é quinta!");
                break;
            case 5:
                System.out.println("Hoje é sexta!");
                break;
            case 6:
                System.out.println("Hoje é Sábado!");
                break;

        }
        scanner.close();




        
    }
}

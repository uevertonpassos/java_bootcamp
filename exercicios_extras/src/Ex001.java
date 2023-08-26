import java.util.Scanner;

public class Ex001 {

    //Escreva um programa em Java que recebe a idade de uma pessoa e verifica se ela é maior de idade (idade maior ou igual a 18) ou menor de idade.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert ur age: ");
        int idade = scanner.nextInt();

        if (idade >= 18)
            System.out.println("the user is at the legal age");
        else
            System.out.println("the user is not at the legal age");

    }



    
}


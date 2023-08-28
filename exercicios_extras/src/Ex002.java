import java.util.Scanner;
public class Ex002 {

   
//Crie um programa que determine se um número inteiro inserido pelo usuário é par ou ímpar usando estruturas de controle if/else.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert a number: ");
        int valor = scanner.nextInt();

        if (valor % 2 == 0)
            System.out.println("thi number is even!");
        else
            System.out.println("this number is odd");
        
    }
}


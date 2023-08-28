//Crie um programa que peça ao usuário para adivinhar um número secreto entre 1 e 100. Use um loop while para dar dicas se o número fornecido é maior ou menor que o número secreto, até que o usuário acerte.
import java.util.Scanner;
public class Ex009 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int MagicNumber = 14;

       while(true){
        System.out.print("Digite um numero entre 1 e 100 e tente acertar o número mágico: ");
        int usuario = scanner.nextInt();
        if(usuario < MagicNumber){
            System.out.println("Você chutou um número menor que o número mágico");
            
        }
        else if(usuario > MagicNumber){
            System.out.println("Você chutou um número maior que o número mágico");

        }
        else{
            System.out.println("Você acertou!");
            break;
            
        }
       }
       scanner.close();




    }
    
}

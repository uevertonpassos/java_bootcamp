//Desenvolva um programa que solicite repetidamente ao usuário para digitar uma senha. Use um loop do-while para continuar pedindo a senha até que o usuário digite a senha correta "senha123".
import java.util.Scanner;
public class Ex010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senha = "senha123";
        String usuarioEntrada;

        do{
             System.out.print("Digite a senha: ");
             usuarioEntrada = scanner.nextLine();
        }
        while(!usuarioEntrada.equals(senha));
        scanner.close();
        
    System.out.println("Senha correta, acesso permitido");

        

    }
    
}

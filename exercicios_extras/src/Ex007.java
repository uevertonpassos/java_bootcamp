//Escreva um programa em Java que utilize um loop do-while para solicitar que o usuário insira números inteiros positivos. O loop deve continuar até que o usuário insira um número negativo. O programa deve então exibir a soma dos números positivos inseridos.
import java.util.Scanner;
public class Ex007 {
    public static void main(String[] args) {
        
        int soma = 0;
        
        Scanner scanner = new Scanner(System.in);
        int valor;
        do{
            System.out.print("Digite um valor, se ele for negativo, o programa se encerrará: ");
            valor = scanner.nextInt();
            if(valor >=0){
                soma +=valor;
            }
        } 
        while(valor >=0);

        System.out.println("A soma de todos os valores positivos digitados foi: " + soma);
        scanner.close();

    }
}

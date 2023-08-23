import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        int numUM = scanner.nextInt();
        System.out.print("Digite outro valor inteiro: ");
        int numDois = scanner.nextInt();

        if(numUM > numDois)
            System.out.println("O numero maior é o: "+numUM);
        else
            System.out.println("o numero maior é o: "+numDois);

        scanner.close();

    }
}
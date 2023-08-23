import java.util.Scanner;

public class ifandelse{

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int numUM = scanner.nextInt();
        System.out.println("Digite outro valor inteiro: ");
        int numDois = scanner.nextInt();

        if(numUM > numDois)
            System.out.println("O numero maior é o: "+numUM);
        else
            System.out.println("o numero maior é o: "+numDois);

        scanner.close();

    }
}
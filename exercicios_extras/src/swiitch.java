import java.util.Scanner;

public class swiitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha entre A, B, C ou D: ");
        String Escolha = scanner.nextLine();

        switch(Escolha){
            case "A":
                System.out.println("você escolheu a letra A");
                break;
            case "B":
                System.out.println("Você escolheu a letra B");
                break;
            case "C":
                System.out.println("Você escolheu a letra C");
                break;
            case "D":
                System.out.println("Você escolheu a letra D");
                break;
            default:
                System.out.println("Opcao inválida");
        }
        scanner.close();
    }
    
}

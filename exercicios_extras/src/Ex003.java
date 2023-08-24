//Desenvolva um programa que receba as notas de três provas de um aluno e calcule a média. Se a média for maior ou igual a 7, o programa deve exibir "Aprovado", caso contrário, exiba "Reprovado".

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double notaUm = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double notaDois = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double notaTres = scanner.nextDouble();

        double Media = (notaUm + notaDois + notaTres)/3;

        if(Media >= 7)
            System.out.println("Aluno Aprovado!");
        
        else
            System.out.println("Aluno Reprovado :c");

        

        scanner.close();
    }

}

//Escreva um programa em Java que utilize um loop while para calcular a soma dos números ímpares de 1 a 100.

public class Ex006 {
    public static void main(String[] args) {
        int valor = 1;
        int soma = 0;
        while(valor<=100){
           
            if (valor %2 ==1){
                soma += valor;

            }
            valor++;
                
        }
         
            
        System.out.println("A soma de tudo é: " + soma);
            
    }
}

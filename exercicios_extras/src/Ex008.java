// Escreva um programa que utilize um loop for para imprimir os números pares de 0 a 20, pulando de 2 em 2.

public class Ex008 {
    public static void main(String[] args) {
        

        for(int x=1; x<=20; x++){
            if(x % 2==0){
                System.out.println(x);
            }
        }
    }
}

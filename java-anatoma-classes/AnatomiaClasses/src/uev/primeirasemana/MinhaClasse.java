package uev.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {

        // criando variáveis e chamando dentro do método criado abaixo

        String PrimeiroNome = "Ueverton";
        String SegundoNome = "Passos";

        String NomeCompleto = NomeCompleto(PrimeiroNome, SegundoNome);

        System.out.println(NomeCompleto);
    }

    // Aprendendo a usar métodos em Java
    public static String NomeCompleto(String PrimeiroNome, String SegundoNome){

        return "O nome completo é: " + PrimeiroNome + " " + SegundoNome;

    }
}




public class SelfChallenge {

    public static void main(String[] args) {
        double NumeroUm = 10;
        double NumeroDois = 8;
        double NumeroTres = 6;
        double NumeroQuatro = 7;
        double Media = Media(NumeroUm, NumeroDois, NumeroTres, NumeroQuatro);

        System.out.println("A média dos valores equivale a: " + Media);
    }


    public static double Media(double NumeroUm, double NumeroDois, double NumeroTres, double NumeroQuatro){


        // não posso retornar um texto junto com uma equação desse tipo
        return  (NumeroUm + NumeroDois+NumeroTres+NumeroQuatro)/4;

    }
    
}

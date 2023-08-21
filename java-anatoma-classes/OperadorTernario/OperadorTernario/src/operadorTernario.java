public class operadorTernario {
    public static void main(String[] args) throws Exception {
        
        int a, b;
        a = 5;
        b = 6;
        
        // aprendendo operadores ternários

        String resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado);
        
        System.out.println("isto é um operador ternario em JAVA");
        String teste = a <= b ? "verdadeiro" : "falso";
        System.out.println(teste);

        // é assim que se faz um if em java 

        if (a <= b && b >= a){
            System.out.println("testando if ");
        }
        else{
            System.out.println("falsinho'");
        }
    }
}

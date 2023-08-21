package fundamentos;
/**
 * @author Ueverton Passos <uevertonpassos96@gmail.com>
 * @since 1.0
 * 
 * isso aqui é o java doc
 * colocando dois * no começo
 */
public class PrimeiroPrograma {
	
	/*
	 * update
	 */

	public static void main(String[] args) {
		
		//testing comentarios
		
		/*
		 * pode ser assim
		 * também, para comentar
		 * textos
		 */
		
		/*p1.setNome("uev");
		p1.setEmail("jureminha@gmail.com");
		p1.setIdade(27);*/
		
		
		PessoaFisica p2 = new PessoaFisica();
		p2.setNome("Nelson");
		p2.setEmail("nelsinhodamassa@gmail.com");
		p2.setIdade(72);
		p2.setCpf("22.323.232.4");
		
		p2.CalcularSalario(2000.0, 5);
		
		
		
		
		System.out.println(p2.getCpf());
		System.out.println(p2.getNome());
		System.out.println(p2.getIdade());
		System.out.println(p2.getEmail());
		System.out.println(p2.getsalario());
		
		System.out.println("primeiro programa!");
		
	}

}


package fundamentos;

public class PessoaFisica extends Pessoa implements Salario{
	
	String cpf;
	double salario;

	public PessoaFisica(String nome, int idade, String email, String cpf) {
		super(nome, idade, email);
		this.cpf = cpf;
		
	}
	


	public PessoaFisica() {
		super();
	}
	
	public double CalcularSalario(double salarioBase, double horaTrabalhada) {
		
		double horaExtra = 10.0;
		double SalarioTotal = salarioBase + (horaTrabalhada * horaExtra);
		salario = SalarioTotal;
		return salario;
	}
	
	
	public double getsalario() {
		return salario;
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}

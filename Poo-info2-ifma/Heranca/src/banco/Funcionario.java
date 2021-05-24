package banco;

public class Funcionario {
	private String nome;
	private double salario;
	
	public double calculaBonificacao () {
		return this.salario * 0.1;
	}

	public void mostraDados() {
		System.out.println("FUNCION�RIO");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Sal�rio: " + this.getSalario());
		System.out.println("Bonifica��o: " + this.calculaBonificacao()) ;
	} 
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}

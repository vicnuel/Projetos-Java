package exComplementares;

public class Telefonista extends Funcionario {
	private int estacaoDeTrabalho;

	public Telefonista(String nome, double salario, int estacaoDeTrabalho) {
		super(nome, salario);
		this.estacaoDeTrabalho = estacaoDeTrabalho;
	}

	public int getEstacaoDeTrabalho() {
		return estacaoDeTrabalho;
	}

	public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
		this.estacaoDeTrabalho = estacaoDeTrabalho;
	}

	@Override
	public String toString() {
		return "Telefonista [estacaoDeTrabalho=" + estacaoDeTrabalho + ", toString()=" + super.toString() + "]";
	}
	
	
}

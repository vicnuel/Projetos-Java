package banco;

public class Telefonista extends Funcionario {
	private int estacaoDeTrabalho;
	
	public void mostraDados() {
		System.out.println("TELEFONISTA") ;
		System.out.println("Nome: " + this.getNome());
		System.out.println("Salário: " + this.getSalario());
		System.out.println("Estacao de trabalho: " + this.getEstacaoDeTrabalho());
		System.out.println("Bonificação: " + this.calculaBonificacao()) ;
	} 

	public int getEstacaoDeTrabalho() {
		return estacaoDeTrabalho;
	}
	
	public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
		this.estacaoDeTrabalho = estacaoDeTrabalho;
	}
	
	

}

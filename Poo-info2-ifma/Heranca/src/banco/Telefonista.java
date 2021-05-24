package banco;

public class Telefonista extends Funcionario {
	private int estacaoDeTrabalho;
	
	public void mostraDados() {
		System.out.println("TELEFONISTA") ;
		System.out.println("Nome: " + this.getNome());
		System.out.println("Sal�rio: " + this.getSalario());
		System.out.println("Estacao de trabalho: " + this.getEstacaoDeTrabalho());
		System.out.println("Bonifica��o: " + this.calculaBonificacao()) ;
	} 

	public int getEstacaoDeTrabalho() {
		return estacaoDeTrabalho;
	}
	
	public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
		this.estacaoDeTrabalho = estacaoDeTrabalho;
	}
	
	

}

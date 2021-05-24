package banco;

public class Secretaria extends Funcionario {
	private int ramal;
	
	public void mostraDados() {
		System.out.println("SECRETARIA");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Salário: " + this.getSalario());
		System.out.println("Ramal: " + this.getRamal());
		System.out.println("Bonificação: " + this.calculaBonificacao()) ;
	} 

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	

}

package test;

public class Cliente {
	String nome;
	String cpf;
	String rg;
	public Cliente(String nome, String cpf, String rg) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}
}

}

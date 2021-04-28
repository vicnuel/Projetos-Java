package biblioteca;

public class Autor {
	private String nome,dataNascimento, rg, cpf;

	public Autor(String nome, String dataNascimento, String rg, String cpf) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.rg = rg;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", dataNascimento=" + dataNascimento + ", rg=" + rg + ", cpf=" + cpf + "]";
	}
	
	
}

package banco;

public class Gerente extends Funcionario {
	private String usuario;
	private String senha;
	
	public double calculaBonificacao () {
		return this.getSalario() * 0.6 + 100;
	}
	
	public void mostraDados() {
		System.out.println("GERENTE");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Salário: " + this.getSalario());
		System.out.println("Usuário: " + this.getUsuario());
		System.out.println("Senha: " + this.getSenha());
		System.out.println("Bonificação: " + this.calculaBonificacao()) ;
	} 
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}

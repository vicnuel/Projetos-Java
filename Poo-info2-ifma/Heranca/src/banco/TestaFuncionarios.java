package banco;

public class TestaFuncionarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Gerente g = new Gerente();
		 g.setNome ("Rafael Cosentino");
		 g.setSalario (2000) ;
		 g.setUsuario ("rafael.cosentino");
		 g.setSenha ("12345");
		 
		 Telefonista t = new Telefonista();
		 t.setNome("Carolina Mello");
		 t.setSalario(1000);
		 t.setEstacaoDeTrabalho(13);
		 
		 Secretaria s = new Secretaria();
		 s.setNome("Tatiane Andrade");
		 s.setSalario(1500);
		 s.setRamal(198);
		 
		 g.mostraDados();
		 		 
		 t.mostraDados();
		 		 
		 s.mostraDados();
		 
	}

}

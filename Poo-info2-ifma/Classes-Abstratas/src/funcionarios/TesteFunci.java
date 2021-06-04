package funcionarios;

public class TesteFunci {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Victor");
		g1.setSalario(10000.);
		g1.setUsuario("user_vic");
		g1.setSenha("We@f$R&w#@r434@23");
		
		System.out.println("Bonificação: R$ " + g1.calcularBonificacao());
	}

}

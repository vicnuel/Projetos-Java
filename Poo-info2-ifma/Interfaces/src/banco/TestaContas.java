package banco;

public class TestaContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente c1 = new ContaCorrente();
		ContaPoupanca c2 = new ContaPoupanca();
		
		c1.deposita(500);
		c2.deposita(500);

		c1.saca(100);
		c2.saca(100);
		
		GeradorDeExtrato g = new GeradorDeExtrato () ;
		g.geraExtrato(c1);
		g.geraExtrato(c2);


	}

}

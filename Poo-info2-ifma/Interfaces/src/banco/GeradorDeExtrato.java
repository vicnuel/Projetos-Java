package banco;

public class GeradorDeExtrato {
	public void geraExtrato (Conta c) {
		System.out.println("EXTRATO");
		System.out.println("SALDO: " + c.getSaldo());
	}

}

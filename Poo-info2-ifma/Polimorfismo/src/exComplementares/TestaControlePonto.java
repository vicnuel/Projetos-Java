package exComplementares;

public class TestaControlePonto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g1 = new Gerente("Adèle Castillon", 10000.0, "g001", "Adele01223");
		Telefonista t1 = new Telefonista("João Victor", 2000.0, 2);
		
		ControlePonto controle = new ControlePonto();
		// Entrada
		controle.registrarEntrada(g1);
		controle.registrarEntrada(t1);
		
		// Saida
		
		controle.registrarSaida(g1);
		controle.registrarSaida(t1);
		
	}

}

package banco;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {
	private int diaDoAniversario;

	public int getDiaDoAniversario() {
		return diaDoAniversario;
	}

	public void setDiaDoAniversario(int diaDoAniversario) {
		this.diaDoAniversario = diaDoAniversario;
	}

	@Override
	public void imprimeExtratoDetalhado() {
		System.out.println("EXTRATO DETALHADO DE CONTA POUPANÇA ") ;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();

		System.out.println("DATA: " + sdf.format(agora));
		System.out.println("SALDO: " + this.getSaldo());
		System.out.println("ANIVERSÁRIO: " + this.diaDoAniversario);

		
	}
}

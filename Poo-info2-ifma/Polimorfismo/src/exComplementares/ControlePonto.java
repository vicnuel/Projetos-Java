package exComplementares;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ControlePonto {
	public static void registrarEntrada(Funcionario f) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/ yyyy HH:mm:ss");
		Date agora = new Date ();
		System.out.println("ENTRADA: " + f.getNome());
		System.out.println("DATA: " + sdf.format(agora));	
	}
	public static void registrarSaida(Funcionario f) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/ yyyy HH:mm:ss");
		Date agora = new Date ();
		System.out.println("SAIDA: " + f.getNome());
		System.out.println("DATA: " + sdf.format(agora));
	}
}

package questoes;

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o pre�o de farbrica: "); 
		double preco_fabrica = sc.nextDouble();
		double lucro = preco_fabrica * 0.05;
		double imposto = preco_fabrica * 0.03;
		double preco_final = preco_fabrica + lucro + imposto;
		System.out.println("O valor do Lucro do distribuidor �: " + lucro);
		System.out.println("O valor do imposto �: " + imposto);
		System.out.println("O pre�o final �: " + preco_final);
	}

}

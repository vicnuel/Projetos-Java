package questoes;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, newSalario;
		System.out.print("Digite o salario atual: ");
		salario = sc.nextDouble();
		salario = salario + (salario * 0.05);
		newSalario = salario - (salario * 0.07);
		System.out.println("O novo salario é: "+ newSalario);
	}
}

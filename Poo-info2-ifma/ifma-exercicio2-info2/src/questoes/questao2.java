package questoes;

import java.util.Scanner;

public class questao2 {
	public static void main(String[] args) {
		System.out.println("Reaguste de salario");
		Scanner sc = new Scanner(System.in);
		double salario, newSalario;
		System.out.print("Digite o salario atual: ");
		salario = sc.nextDouble();
		newSalario = salario + (salario * 0.25);
		System.out.println("O novo salario é: "+ newSalario);
	}
}

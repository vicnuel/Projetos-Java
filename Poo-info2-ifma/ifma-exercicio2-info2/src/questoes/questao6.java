package questoes;

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		System.out.println("Cargo | Código\r\n"
				+ "ESCRITURÁRIO 1\r\n"
				+ "SECRETÁRIO 2\r\n"
				+ "CAIXA 3\r\n"
				+ "GERENTE 4\r\n"
				+ "DIRETOR 5");
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o salário atual: ");
		double salario = sc.nextDouble(), newsalario;
		System.out.print("Digite o código do funcionário: ");
		int cod = sc.nextInt();
		switch(cod) {
			case 1:
				newsalario = salario * 1.5;
				System.out.println("ESCRITURÁRIO: O seu novo salário é: " + newsalario);
				break;
			case 2:
				newsalario = salario * 1.35;
				System.out.println("SECRETÁRIO: O seu novo salário é: " + newsalario);
				break;
			case 3:
				newsalario = salario * 1.2;
				System.out.println("CAIXA: O seu novo salario é: " + newsalario);
				break;
			case 4:
				newsalario = salario + salario * 0.10;
				System.out.println("GERENTE: O seu novo salário é: " + newsalario);
				break;
			case 5:
				newsalario = salario;
				System.out.println("DIRETOR: Não tem aumento. O salário permanece " + newsalario);
				break;
			default:
				System.out.println("Código inexistente");
		}

	}

}

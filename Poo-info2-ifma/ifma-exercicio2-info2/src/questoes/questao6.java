package questoes;

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		System.out.println("Cargo | C�digo\r\n"
				+ "ESCRITUR�RIO 1\r\n"
				+ "SECRET�RIO 2\r\n"
				+ "CAIXA 3\r\n"
				+ "GERENTE 4\r\n"
				+ "DIRETOR 5");
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o sal�rio atual: ");
		double salario = sc.nextDouble(), newsalario;
		System.out.print("Digite o c�digo do funcion�rio: ");
		int cod = sc.nextInt();
		switch(cod) {
			case 1:
				newsalario = salario * 1.5;
				System.out.println("ESCRITUR�RIO: O seu novo sal�rio �: " + newsalario);
				break;
			case 2:
				newsalario = salario * 1.35;
				System.out.println("SECRET�RIO: O seu novo sal�rio �: " + newsalario);
				break;
			case 3:
				newsalario = salario * 1.2;
				System.out.println("CAIXA: O seu novo salario �: " + newsalario);
				break;
			case 4:
				newsalario = salario + salario * 0.10;
				System.out.println("GERENTE: O seu novo sal�rio �: " + newsalario);
				break;
			case 5:
				newsalario = salario;
				System.out.println("DIRETOR: N�o tem aumento. O sal�rio permanece " + newsalario);
				break;
			default:
				System.out.println("C�digo inexistente");
		}

	}

}

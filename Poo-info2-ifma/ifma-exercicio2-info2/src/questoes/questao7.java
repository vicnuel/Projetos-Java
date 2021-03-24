package questoes;

import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o intervalo de numeros:");
		System.out.print("Inicio: ");
		int inicio = sc.nextInt();
		System.out.print("Final: ");
		long nfinal = sc.nextInt();
		long numIm = 0;
		while (inicio > nfinal) {
			System.out.print("Digite um numero final maior ou igual ao inicial:");
			nfinal = sc.nextInt();
		}
		for (int i = inicio; i <= nfinal; i++) {
			if (i % 2 != 0)
				numIm += i;
		}
		System.out.println("O soma dos numeros ímpas é: " + numIm);

	}

}

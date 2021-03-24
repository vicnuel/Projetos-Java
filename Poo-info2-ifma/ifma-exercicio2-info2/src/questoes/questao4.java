package questoes;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os dados do triângulo:");
		System.out.print("Digite a base:");
		float base = sc.nextFloat();
		System.out.print("Digite a altura:");
		float altura = sc.nextFloat();
		float area = (base * altura)/2;
		System.out.println("A area é: "+ area);
	}
}

package questoes;

import java.util.Scanner;

public class questao1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n[]= new float [4];
		for (int i = 0; i<4; i++) {
			System.out.print("Digite a nota "+i+": ");
			n[i] = sc.nextFloat();
		}
		float media = 0;
		for (int i = 0; i<4; i++) {
			media += n[i];
		}
		media /= 4;
		System.out.println("A media do aluno é: "+ media);
	}

}

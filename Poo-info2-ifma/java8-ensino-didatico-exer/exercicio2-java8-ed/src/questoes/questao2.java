package questoes;

import java.util.Scanner;

/*Usando a classe Scanner para entrada de dados, faça uma classe que receba dois valores inteiros. 
O primeiro valor corresponde à quantidade de pontos do líder do campeonato brasileiro de futebol. 
O segundo valor corresponde à quantidade de pontos do time lanterna. Considerando que
cada vitória vale 3 pontos, elabore uma classe que calcule o número de vitórias necessárias para 
que o time lanterna alcance (ou ultrapasse) o líder. Por exemplo, supondo que as quantidades de 
ponto fornecidas sejam 40 e 22, então o número de vitórias apresentada na saída deverá ser 6, 
pois (40-22) / 3 = 6.*/
public class questao2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o pontos do time lider: ");
		int lider = teclado.nextInt();
		System.out.print("Digite o pontos do time lanterna: ");
		int lanterna = teclado.nextInt();
		int vit_nece = (int) (lider - lanterna)/3;
		vit_nece = (lanterna + 3 * vit_nece)>= lider? vit_nece: vit_nece + 1;
		System.out.println("Vitórias necessárias: "+ vit_nece);
	}
}

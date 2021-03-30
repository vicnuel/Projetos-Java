package questoes;

import java.util.Scanner;

/*Usando a classe Scanner para entrada de dados, fa�a uma classe que receba dois valores inteiros. 
O primeiro valor corresponde � quantidade de pontos do l�der do campeonato brasileiro de futebol. 
O segundo valor corresponde � quantidade de pontos do time lanterna. Considerando que
cada vit�ria vale 3 pontos, elabore uma classe que calcule o n�mero de vit�rias necess�rias para 
que o time lanterna alcance (ou ultrapasse) o l�der. Por exemplo, supondo que as quantidades de 
ponto fornecidas sejam 40 e 22, ent�o o n�mero de vit�rias apresentada na sa�da dever� ser 6, 
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
		System.out.println("Vit�rias necess�rias: "+ vit_nece);
	}
}

package questoes;
/*Considere a seguinte informa��o a respeito do c�lculo da aposentadoria. Para se aposentar por 
idade, as mulheres precisam ter atingido 60 anos de idade e os homens, 65. J� na aposentadoria por 
tempo de contribui��o, o tempo m�nimo exigido � de 30 anos para as mulheres e de 35 anos para os 
homens. Com base nessas informa��es, elabore uma classe que receba a idade de uma pessoa, seu 
sexo e a quantidade de anos de contribui��o. A seguir, calcule a quantidade de anos que falta de 
contribui��o para se aposentar, ou ent�o emita a mensagem: �voc� j� tem o direito a aposentadoria�.*/
import java.util.Scanner;
public class questao5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a seu sexo [F/M]: ");
		String sexo = sc.nextLine();
		System.out.print("Digite a quantidade de anos de contribui��o: ");
		int anos = sc.nextInt();
		
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		
		if (sexo.equals("f") || sexo.equals("F") || sexo.equals("feminino") || sexo.equals("Feminino")) {
			if (idade >= 60 || 30-anos<=0) {
				System.out.println("voc� j� tem o direito a aposentadoria");
			}	
			else
				System.out.println("Faltam "+(30-anos)+" anos de contrubui��o");
		}
		else if (sexo.equals("m") || sexo.equals("M") || sexo.equals("Masculino") || sexo.equals("masculino")) {
			if (idade >= 65 || 35-anos<=0) {
				System.out.println("voc� j� tem o direito a aposentadoria");
			}	
			else
				System.out.println("Faltam "+(35-anos)+" anos de contrubui��o");
		}
		else
			System.out.println("Erro! digite F (Feminino) ou M (Masculino) para o sexo.");
	}
}

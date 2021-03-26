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
		Scanner scan = new Scanner(System.in);
			System.out.print("Digite a seu sexo [F/M]: ");
			String sexo = scan.nextLine();
			System.out.print("Digite a quantidade de anos de contribui��o: ");
			int anos = scan.nextInt();
			int tempo = sexo.equals("F") || sexo.equals("f")? 30 - anos: 35 - anos;
			System.out.println(tempo > 0? "Faltam "+tempo+" anos de contrubui��o": "voc� j� tem o direito a aposentadoria");
	}
}

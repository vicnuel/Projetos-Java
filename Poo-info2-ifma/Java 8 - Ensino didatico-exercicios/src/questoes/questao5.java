package questoes;
/*Considere a seguinte informação a respeito do cálculo da aposentadoria. Para se aposentar por 
idade, as mulheres precisam ter atingido 60 anos de idade e os homens, 65. Já na aposentadoria por 
tempo de contribuição, o tempo mínimo exigido é de 30 anos para as mulheres e de 35 anos para os 
homens. Com base nessas informações, elabore uma classe que receba a idade de uma pessoa, seu 
sexo e a quantidade de anos de contribuição. A seguir, calcule a quantidade de anos que falta de 
contribuição para se aposentar, ou então emita a mensagem: “você já tem o direito a aposentadoria”.*/
import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			System.out.print("Digite a seu sexo [F/M]: ");
			String sexo = scan.nextLine();
			System.out.print("Digite a quantidade de anos de contribuição: ");
			int anos = scan.nextInt();
			int tempo = sexo.equals("F") || sexo.equals("f")? 30 - anos: 35 - anos;
			System.out.println(tempo > 0? "Faltam "+tempo+" anos de contrubuição": "você já tem o direito a aposentadoria");
	}
}

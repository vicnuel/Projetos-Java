package questoes;

import javax.swing.JOptionPane;

/*Usando a classe JOptionPane para entrada de dados, elabore uma classe que receba a nota de 
duas provas e de um trabalho. Calcule e mostre a m�dia e o resultado final (aprovado ou reprovado).
Para calcular a m�dia utilize a f�rmula seguinte: m�dia = (nota da prova 1 + nota da prova 2 + 
nota do trabalho) / 3. Considere que a m�dia m�nima para aprova��o � 6.*/
public class questao4 {

	public static void main(String[] args) {
		try {
		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));
		float trabalho = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do trabalho"));
		float media = (n1 + n2 + trabalho)/3;
		String s = media >= 7? "Aprovado": "Reprovado";
		JOptionPane.showMessageDialog(null, s +" com m�dia " + media);
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Ouve erro nos calculos, digite apenas digitos numericos");
		}
	}

}

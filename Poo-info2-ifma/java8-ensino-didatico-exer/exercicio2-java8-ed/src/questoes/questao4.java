package questoes;

import javax.swing.JOptionPane;

/*Usando a classe JOptionPane para entrada de dados, elabore uma classe que receba a nota de 
duas provas e de um trabalho. Calcule e mostre a média e o resultado final (aprovado ou reprovado).
Para calcular a média utilize a fórmula seguinte: média = (nota da prova 1 + nota da prova 2 + 
nota do trabalho) / 3. Considere que a média mínima para aprovação é 6.*/
public class questao4 {

	public static void main(String[] args) {
		try {
		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));
		float trabalho = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do trabalho"));
		float media = (n1 + n2 + trabalho)/3;
		String s = media >= 7? "Aprovado": "Reprovado";
		JOptionPane.showMessageDialog(null, s +" com média " + media);
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Ouve erro nos calculos, digite apenas digitos numericos");
		}
	}

}

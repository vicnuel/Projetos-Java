package questoes;

import javax.swing.JOptionPane;

/*O Imposto sobre a Transmiss�o de Bens M�veis (ITBI) � aplicado sobre o valor de um im�vel a 
ser negociado. A base de c�lculo do ITBI (o valor a ser considerado no c�lculo) ser� o maior valor 
entre o valor de transa��o (o valor negociado) e o valor venal de refer�ncia (fornecido pela 
Prefeitura). Com base nisso, elabore uma classe que receba o valor da transa��o, o valor venal e 
o percentual de imposto. Ap�s isso, encontre o maior valor e aplique o percentual sobre ele. Ao 
final, apresente o valor do imposto a ser pago. Observa��o: o valor do imposto a ser pago � calculado
por meio da f�rmula: valor do imposto = maior valor * percentual / 100. Para entrada e sa�da 
de dados utilize a classe JOptionPane*/
public class questao3 {
	public static void main(String[] args) {
		try {
		double v_transacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de transa��o"));
		double v_venal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor venal"));
		double v_percentual = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor percentual [%]"));
		double m_valor = v_transacao >= v_venal? v_transacao: v_venal;
		double imposto = m_valor * (v_percentual/100.0);
		JOptionPane.showMessageDialog(null, "O valor do imposto a ser pago � " + imposto);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Ouve erro nos calculos, digite apenas digitos numericos");
		}
	}
}

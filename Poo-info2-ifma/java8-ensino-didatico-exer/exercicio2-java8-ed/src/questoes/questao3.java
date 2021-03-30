package questoes;

import javax.swing.JOptionPane;

/*O Imposto sobre a Transmissão de Bens Móveis (ITBI) é aplicado sobre o valor de um imóvel a 
ser negociado. A base de cálculo do ITBI (o valor a ser considerado no cálculo) será o maior valor 
entre o valor de transação (o valor negociado) e o valor venal de referência (fornecido pela 
Prefeitura). Com base nisso, elabore uma classe que receba o valor da transação, o valor venal e 
o percentual de imposto. Após isso, encontre o maior valor e aplique o percentual sobre ele. Ao 
final, apresente o valor do imposto a ser pago. Observação: o valor do imposto a ser pago é calculado
por meio da fórmula: valor do imposto = maior valor * percentual / 100. Para entrada e saída 
de dados utilize a classe JOptionPane*/
public class questao3 {
	public static void main(String[] args) {
		try {
		double v_transacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de transação"));
		double v_venal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor venal"));
		double v_percentual = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor percentual [%]"));
		double m_valor = v_transacao >= v_venal? v_transacao: v_venal;
		double imposto = m_valor * (v_percentual/100.0);
		JOptionPane.showMessageDialog(null, "O valor do imposto a ser pago é " + imposto);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Ouve erro nos calculos, digite apenas digitos numericos");
		}
	}
}

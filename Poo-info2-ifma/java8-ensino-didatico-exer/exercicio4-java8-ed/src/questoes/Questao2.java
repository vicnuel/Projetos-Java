package questoes;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			double valor;
			double newvalor;
			DecimalFormat df = new DecimalFormat();
			df.applyPattern("R$ #,#00.0#");
			do {
				valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
				if (valor != 0) {
					newvalor = valor * 1.12;
					JOptionPane.showMessageDialog(null, "Valor com acrescimo é " + df.format(newvalor) + "\n"
								+ "Valor arredonado " + df.format(Math.round(newvalor)));
				}
			} while (valor!=0);
		
		} catch (NumberFormatException erro) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Você não digitou o valor. Erro: " + erro);
		}
		

	}

}

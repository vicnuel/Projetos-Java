package questoes;

import javax.swing.JOptionPane;

public class Questao2 {

	public static void main(String[] args) {
		String meses [] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
		JOptionPane.showMessageDialog(null, "Sortear mês");
		int sort = (int) (Math.random() * 11);
		JOptionPane.showMessageDialog(null, "Mês sorteado: " + meses[sort]);
	}

}

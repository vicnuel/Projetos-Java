package questoes;

import javax.swing.JOptionPane;

public class Questao4 {

	public static void main(String[] args) {
		int tab;
		String res = "";
		tab = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero da tabuada"));
		for (int i  = 1; i<=10; i++) {
			if (i == 10)
				res += tab + " x " + i + " = " + (tab*i);
			else
				res += tab + " x " + i + " = " + (tab*i) + "\n";
		}
		JOptionPane.showMessageDialog(null, res);
	}

}

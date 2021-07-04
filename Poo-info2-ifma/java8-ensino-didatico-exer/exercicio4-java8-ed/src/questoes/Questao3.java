package questoes;

import javax.swing.JOptionPane;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = (int) (5 + Math.random() * (10-5));
		String senhaString = "";
		for (int i = 0; i < n1; i++) {
			senhaString += ((int)(Math.random()*9));
		}
		JOptionPane.showMessageDialog(null, "Número sorteado: "+ n1 + "\n"
				+ "Senha gerada: " + senhaString);

	}

}

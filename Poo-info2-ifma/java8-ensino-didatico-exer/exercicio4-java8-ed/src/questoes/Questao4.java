package questoes;

import javax.swing.JOptionPane;

public class Questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = JOptionPane.showInputDialog("Digite uma frase");
		String frasereversa = "";
		for (int i = (frase.length()-1); i >= 0; i--) {
			frasereversa += frase.charAt(i);	
		}
		JOptionPane.showMessageDialog(null, "Frase fornecida: " + frase + "\n"
		+ "Frase de trás para frente: " + frasereversa);

	}

}

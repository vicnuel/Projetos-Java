package questoes;

import javax.swing.JOptionPane;

public class Questao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = JOptionPane.showInputDialog("Forne�a uma frase");
		frase = frase.toLowerCase();
		if ((frase.indexOf("sexual") >= 0) || (frase.indexOf("sexo") >= 0)) {
			JOptionPane.showMessageDialog(null, "Conte�do impr�prio");
		} else {
			JOptionPane.showMessageDialog(null, "Conte�do liberado");
		}
	}

}
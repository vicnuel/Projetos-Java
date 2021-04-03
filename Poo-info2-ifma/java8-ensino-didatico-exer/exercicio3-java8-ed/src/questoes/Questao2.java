package questoes;

import javax.swing.JOptionPane;

public class Questao2 {

	public static void main(String[] args) {
		float r[] = new float[4];
		for (int i = 0; i < 4; i++) {
			r[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a resistência numero " + (i+1) + " "));	
		}
		
		float RE = 0.0f;
		String RES = "";
		for (int i = 0; i<4; i++) {
			RE += r[i];
			if (i == 3)
				RES += r[i];
			else
				RES += r[i] + ", ";
		}
		
		float maior = r[0], menor = r[0];
		for (int i = 1; i < 4; i++) {
			maior = (maior > r[i])? maior: r[i];
			menor = (menor < r[i])? menor: r[i];
		}
		
		JOptionPane.showMessageDialog(null, "Resistências fornecidas:\n" + 
				RES + "\n" +
				"Resistencia Equivalente: " + RE + "\n" +
				"Resistencia maior: " + maior + "\n" + 
				"Resistencia menor: " + menor);
	}

}

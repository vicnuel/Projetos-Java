package questoes;

import javax.swing.JOptionPane;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jogadas [] = new int[3];
		for (int i = 0; i < jogadas.length; i++) {
			jogadas[i] = (int) (1 + Math.random() * (6-1));
		}
		int total = 0;
		String jogadasString = "";
		for (int i = 0; i < jogadas.length; i++) {
			total += jogadas[i];
			jogadasString += jogadas[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, "Numeros sorteados:" + "\n" 
					+ jogadasString 
					+ "Total = " + total);
	}

}

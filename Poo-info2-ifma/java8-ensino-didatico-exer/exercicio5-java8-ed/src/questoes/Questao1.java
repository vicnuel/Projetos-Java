package questoes;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Questao1 {

	public static void main(String[] args) {
		float notas[] = new float[5];
		for (int i = 0; i < notas.length; i++) {
			notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Entre com a nota " + (i+1)));
		}
		float somaNotas = 0.0f;
		for (int i = 0; i < notas.length; i++) {
			somaNotas += notas[i];
		}
		float mediaA = (somaNotas/5);
		Arrays.sort(notas);
		String mensagem = "Notas: \n";
		for (int i = (notas.length - 1); i >= 0 ; i--) {
			mensagem += notas[i] + "\n";	
		}
		mensagem += "Média Aritimética: " + mediaA;
		JOptionPane.showMessageDialog(null, mensagem);
	}

}

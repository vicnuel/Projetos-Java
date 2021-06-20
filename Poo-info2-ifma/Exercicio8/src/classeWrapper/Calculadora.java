package classeWrapper;

import javax.swing.JOptionPane;

public class Calculadora {
	public void multiplica() {
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro fator:"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo fator:"));
		double produto = n1 * n2;
		JOptionPane.showInternalMessageDialog(null, n1 + " x " + n2 + " = " + produto);
	}
	public void Dividir() {
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o dividendo:"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o divisor:"));
		double cociente = n1 / n2;
		JOptionPane.showInternalMessageDialog(null, n1 + " / " + n2 + " = " + cociente);
	}
	public void soma() {
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira parcela:"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Segunda parcela:"));
		double soma = n1 + n2;
		JOptionPane.showInternalMessageDialog(null, n1 + " + " + n2 + " = " + soma);
	}
	public void subtracao() {
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o minuendo:"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o subtraendo:"));
		double resto = n1 - n2;
		JOptionPane.showInternalMessageDialog(null, n1 + " - " + n2 + " = " + resto);
	}

}

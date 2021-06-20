package formataNumero;

import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Conversor {
	public void screenDollarConverter() {
		double dollar = Double.parseDouble(JOptionPane.showInputDialog("Enter the dollar amount"));
		double real = converteDolar(dollar);
		NumberFormat format= NumberFormat.getCurrencyInstance();
		JOptionPane.showMessageDialog(null, "You have "+ format.format(real));
	}
	public void telaConversorReal() {
		double real = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em real"));
		double dolar = converteReal(real);
		NumberFormat format= NumberFormat.getCurrencyInstance(Locale.US);
		JOptionPane.showMessageDialog(null, "Você tem "+ format.format(dolar));
	}
	public double converteDolar(double dolar) {
		double real = dolar * 5.09;
		return real;
	}
	public double converteReal(double real) {
		double dolar = real / 5.09;
		return dolar;
	}
}

package questoes;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class Questao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("R$ #,##0.00");
		
		
		double valorTotal = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da compra"));
		int parcelas;
		do {
			parcelas = Integer.parseInt(JOptionPane.showInputDialog("Digite a a quantidade de parcelas (3, 6 ou 12)"));
			if(parcelas != 3 && parcelas != 6 && parcelas != 12)
				JOptionPane.showMessageDialog(null, "Quantidade de parcelas invalida!! \n"
						+ "Por favor, tente novamente");
		} while (parcelas != 3 && parcelas != 6 && parcelas != 12);
		
		double valorParcela = valorTotal/parcelas; 
		
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		
		String mensagem = "";
		for (int i = 1; i <= parcelas; i++) {
			mensagem += i + "º parcela: " + sdf.format(c.getTime()) + " - " + df.format(valorParcela) + "\n";
			c.add(Calendar.DAY_OF_MONTH, 30);
		}
		JOptionPane.showMessageDialog(null, mensagem);

	}

}

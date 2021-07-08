package questoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
		try {
						
			Calendar c = Calendar.getInstance();
			Calendar c2 = Calendar.getInstance();
		
			c.setTime(sdf.parse(JOptionPane.showInputDialog("Digite a data inicial.")));
			c2.setTime(sdf.parse(JOptionPane.showInputDialog("Digite a data inicial.")));
			
			LocalDate DInicial = LocalDate.of(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
			LocalDate DFinal = LocalDate.of(c2.get(Calendar.YEAR), c2.get(Calendar.MONTH), c2.get(Calendar.DAY_OF_MONTH));
			
			Period periodo = Period.between(DInicial, DFinal);
			
			JOptionPane.showMessageDialog(null, "Data inicial: " + sdf.format(c.getTime()) + "\n"
							+ "Data Final: " + sdf.format(c2.getTime()) + "\n"
							+ "Entre as datas fornecidas existem " + periodo.getYears() + " ano(s), " + periodo.getMonths()
							+ "mes(es) e " + periodo.getDays() + "dia(s)!" );
		} catch (ParseException erro) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Data invalida " + erro.getErrorOffset());
		}
	}

}

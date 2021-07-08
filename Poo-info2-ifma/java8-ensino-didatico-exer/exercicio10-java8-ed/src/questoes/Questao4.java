package questoes;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class Questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy, hh:mm:ss");
		
		
		JOptionPane.showMessageDialog(null, "Registrar chegada");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		
		JOptionPane.showMessageDialog(null, "Registrar atendimento");
		Calendar c2 = Calendar.getInstance();
		c2.setTime(new Date());
		
		long minuto = 1000 * 60;
		long tempoEspera = (c2.getTimeInMillis() - c.getTimeInMillis()) / minuto;
		JOptionPane.showMessageDialog(null, "Chegada: " + sdf.format(c.getTime()) + "\n"
						+ "Saida: " + sdf.format(c2.getTime()) + "\n"
						+ "Tempo de espera " + tempoEspera + " minuto(s)");
	}

}

package questoes;

import java.util.Date;

import javax.swing.JOptionPane;

import java.text.DateFormat;
import java.util.Calendar;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date agora = new Date();
		
		Calendar c = Calendar.getInstance();
		c.setTime(agora);
		System.out.println();
		int dia = c.get(Calendar.DAY_OF_WEEK);
		int hora = c.get(Calendar.HOUR_OF_DAY);
		String diaSemana="";
		System.out.println(dia);
		System.out.println(hora);
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		if ((dia >= 2 && dia <=6) && (hora>=8 && hora<=17)) {
			diaSemana = ((df.format(c.getTime())).split("[\\W][ ]")[0]).split("-")[0];
			diaSemana = diaSemana.substring(0, 1).toUpperCase() + diaSemana.substring(1);
			JOptionPane.showMessageDialog(null, diaSemana + " - " + hora + "h - Estamos Atendendo");
		}else {
			diaSemana = ((df.format(c.getTime())).split("[\\W][ ]")[0]).split("-")[0];
			diaSemana = diaSemana.substring(0, 1).toUpperCase() + diaSemana.substring(1);
			JOptionPane.showMessageDialog(null, diaSemana + " - " + hora + "h - Expediente Encerrado");
		}	
	}

}

package questoes;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import javax.swing.JOptionPane;


public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId fusoSP = ZoneId.of("America/Sao_Paulo");
		ZoneId fusoT = ZoneId.of("Asia/Tokyo");
		ZonedDateTime agoraSP = ZonedDateTime.now(fusoSP);
		ZonedDateTime agoraT = ZonedDateTime.now(fusoT);
		int diferenca = Math.abs( agoraSP.getHour() - agoraT.getHour()); 
		
		JOptionPane.showMessageDialog(null, "T�quio: " + agoraT.getHour() + "h\n"
						+ "S�o Paulo: " + agoraSP.getHour() + "h\n"
						+ "Diferen�a: " + diferenca + "h\n");
	}

}

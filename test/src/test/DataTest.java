package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class DataTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		try {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            
            Date agora = new Date();
            Date nasc = df.parse("22/06/2005");
            
            Calendar cIdade = Calendar.getInstance();
            cIdade.setTimeInMillis(agora.getTime()-nasc.getTime());
            
            JOptionPane.showMessageDialog(null,"ano" + cIdade.get(Calendar.YEAR));
            
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Erro");
        }
        

	}

}

package questoes;

import javax.swing.JOptionPane;

public class Questao3 {
	public static void main(String[] args) {
		String login, senha;
		int ten = 0;
		boolean acesso = false;
		do {
		login = JOptionPane.showInputDialog("Forne�a o login");
		senha = JOptionPane.showInputDialog("Forne�a a senha");
		ten+=1;
		if (login.equals("java8") && senha.equals("java8")) {
				JOptionPane.showMessageDialog(null, "Login e Senha aceitos!" );
				acesso = true;
		}
		else
			
			JOptionPane.showMessageDialog(null, "Falha, verifique login e senha!\n" +
					"Voc� tem mais "+ (3-ten) + " tentativa(s)!");
		
		} while (ten < 3 && acesso == false);
	}

}

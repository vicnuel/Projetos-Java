package questoes;

import javax.swing.JOptionPane;

public class Questao3 {
	public static void main(String[] args) {
		String login, senha;
		int ten = 0;
		do {
		login = JOptionPane.showInputDialog("Forne�a o login");
		senha = JOptionPane.showInputDialog("Forne�a a senha");
		ten+=1;
		if (login.equals("java8") && senha.equals("java8")) {
				JOptionPane.showMessageDialog(null, "Login e Senha aceitos" );
				ten = 4;
		}
		else
			JOptionPane.showMessageDialog(null, "Falha, verifique login e senha\n" +
					"Voc� tem mais "+ (3-ten) + " tentativas");
		
		} while (ten < 3);
	}

}

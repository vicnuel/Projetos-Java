package questoes;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vagas[] = new String[10];
		int indice;
		do {
			indice = Integer.parseInt(JOptionPane.showInputDialog("Escolhar uma op��o. \n"
					+ "Op��es: \n"
					+ "1-Entrada \n"
					+ "2-Sa�da \n"
					+ "3-Listar situa��o atual \n"
					+ "4-Encerrar o programa."));
			int numVaga;
			switch (indice) {
				
				case 1:
					numVaga = Integer.parseInt(JOptionPane.showInputDialog("Entre com o n�mero da vaga"));
					vagas[numVaga-1] = JOptionPane.showInputDialog("Entre com n�mero da placa");
					break;
				case 2:
					numVaga = Integer.parseInt(JOptionPane.showInputDialog("Entre com o n�mero da vaga"));
					vagas[numVaga-1] = "";
					break;
				case 3:
					String mensagem = "";
					for (int i = 0; i < vagas.length; i++) {
						mensagem += "Vaga N�" + (i+1) + ((vagas[i] == null || vagas[i].toString().equals(""))? " - Livre\n": " - placa "+ vagas[i] + "\n");	
					}
					JOptionPane.showMessageDialog(null, "Situa��o atual: \n" + mensagem);
					break;
				case 4:
					JOptionPane.showMessageDialog(null,"Fechando aplica��o...");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Op��o inexistente!! \n"
							+ "Tente novamente");
					break;
			}
		} while (indice != 4);
	}

}

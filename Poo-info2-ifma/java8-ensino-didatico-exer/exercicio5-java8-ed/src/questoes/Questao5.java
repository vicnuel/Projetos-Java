package questoes;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vagas[] = new String[10];
		int indice;
		do {
			indice = Integer.parseInt(JOptionPane.showInputDialog("Escolhar uma opção. \n"
					+ "Opções: \n"
					+ "1-Entrada \n"
					+ "2-Saída \n"
					+ "3-Listar situação atual \n"
					+ "4-Encerrar o programa."));
			int numVaga;
			switch (indice) {
				
				case 1:
					numVaga = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número da vaga"));
					vagas[numVaga-1] = JOptionPane.showInputDialog("Entre com número da placa");
					break;
				case 2:
					numVaga = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número da vaga"));
					vagas[numVaga-1] = "";
					break;
				case 3:
					String mensagem = "";
					for (int i = 0; i < vagas.length; i++) {
						mensagem += "Vaga Nº" + (i+1) + ((vagas[i] == null || vagas[i].toString().equals(""))? " - Livre\n": " - placa "+ vagas[i] + "\n");	
					}
					JOptionPane.showMessageDialog(null, "Situação atual: \n" + mensagem);
					break;
				case 4:
					JOptionPane.showMessageDialog(null,"Fechando aplicação...");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inexistente!! \n"
							+ "Tente novamente");
					break;
			}
		} while (indice != 4);
	}

}

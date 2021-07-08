package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame{
	public Janela() {
		//janela
		// JFrame frame = new JFrame(); // não precisar, pois foi usado o Extends
		super("Minha janela");
		
		JButton botao = new JButton("Clique");
		// sem extends
		//frame.getContentPane().add(botao);
		// com extends
		getContentPane().add(botao);
		// o mesmo vala para os proximos comandos
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Terminar execução do programa ao apretar X(sair)
		setSize(300, 300); //tamanho da janela
		setVisible(true); // Visibilidade
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Janela();
	}

}

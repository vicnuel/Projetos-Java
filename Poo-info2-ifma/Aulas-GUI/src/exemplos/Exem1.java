package exemplos;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exem1 extends JFrame implements ActionListener {
	
	Exem1 (){
		super("formulario");
		
		JButton botao = new JButton("Botão");
		
		Container c = getContentPane();
		c.add(botao);
		
		botao.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exem1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Botão apertado");
		
	}

}

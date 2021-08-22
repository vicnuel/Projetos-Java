package exemplos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exem2 extends JFrame implements ActionListener {

	private JTextField textfild;
	
	public Exem2(){
		super("Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 129);
		getContentPane().setLayout(null);
		
		
		JLabel label = new JLabel("Digite o texto");
		label.setBounds(10, 11, 86, 14);
		
		getContentPane().add(label);
		
		textfild = new JTextField();
		textfild.setBounds(109, 8, 205, 20);
		getContentPane().add(textfild);
		textfild.setColumns(10);
		
		
		JButton botao = new JButton("Visualizar");
		botao.setBounds(110, 55, 150, 23);
		botao.addActionListener(this);
		
		getContentPane().add(botao);
		
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, textfild.getText());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exem2();
	}

}

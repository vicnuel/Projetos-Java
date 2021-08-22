package exemplos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Exem3 extends JFrame implements ActionListener  {
	
	private JTextField textField; 
	private JTextField textField_1;
	JButton botaoSomar; 
	JButton botaolimpar;
	
	public Exem3 (){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 218); 
		getContentPane().setLayout(null); 
		
		JLabel lblDigite = new JLabel("Digite o 1\u00BA numero:"); 
		lblDigite.setFont(new Font("Tahomd", Font.BOLD, 14)); 
		lblDigite.setBounds(36, 23, 153, 38); 
		getContentPane().add(lblDigite); 
		
		
		JLabel lblDigiteONumero = new JLabel("Digite o 2\u00BA numero:"); 
		lblDigiteONumero.setFont(new Font( "Tahoma", Font.BOLD, 14)); 
		lblDigiteONumero.setBounds(36, 69, 153, 20); 
		getContentPane().add(lblDigiteONumero); 
		
		
		textField = new JTextField();
		textField.setBounds(206, 34, 88, 20); 
		getContentPane().add(textField); 
		textField.setColumns(10); 
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(206, 71, 86, 20); 
		getContentPane().add(textField_1); 
		textField_1.setColumns(10); 
		
		botaoSomar = new JButton("Somar"); 
		botaoSomar.setBounds(206, 114, 89, 23); 
		getContentPane().add(botaoSomar); 
		botaoSomar.addActionListener(this); 
		
		
		botaolimpar = new JButton("Limpar"); 
		botaolimpar.setBounds(73, 114, 89, 23); 
		getContentPane().add(botaolimpar); 
		setVisible(true); 
		botaolimpar.addActionListener(this); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exem3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == botaoSomar) {
			
			double numero1 = Double.parseDouble(textField.getText());
			double numero2 = Double.parseDouble(textField_1.getText());
			double soma = numero1 + numero2;
			
			JOptionPane.showMessageDialog(null, "A soma dos números é: " + soma);
			
		}else if (e.getSource() == botaolimpar) {
			
			textField.setText("");
			textField_1.setText("");
			
		} else {
			JOptionPane.showMessageDialog(null, "Nelson");
			System.out.println(e.getSource().getClass());
		}
		
	}

}

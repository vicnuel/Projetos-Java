package questoes;

import javax.swing.JOptionPane;

public class Questao1 {

	public static void main(String[] args) {
		try {
            String nome = JOptionPane.showInputDialog("Digite o nome do produto");
            double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o do produto")), newpreco = 0;
            if (preco < 0)
                throw new Exception("Pre�o menor que zero, digite apenas numeros positivos");
            else{
                if(preco<50)
                    JOptionPane.showMessageDialog(null,"N�o tem desconto para esse produto");
                else{
                    if(preco >= 50 && preco <200)
                        newpreco = preco * 0.95;
                    else if (preco >= 200 && preco < 500)
                        newpreco = preco * 0.94;
                    else if (preco >= 500 && preco < 1000)
                        newpreco = preco * 0.93;
                    else
                        newpreco = preco * 0.92;
                    JOptionPane.showMessageDialog(null, "Nome do produto: " + nome + "\n"+
                            "Valor original original do produto: " + preco + "\n"+
                            "Valor do produto com desconto: " + newpreco);
                }
            }
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
	}
}

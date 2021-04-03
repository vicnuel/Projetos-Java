package questoes;

import javax.swing.JOptionPane;

public class Questao5 {

	public static void main(String[] args) {
		int op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção:\n1-exercicío 1\n2-exercicío 2\n3-exercicío 3\n4-exercicío 4"));
		switch (op) {
		case 1:
			questao1();
			break;
		case 2:
			questao2();
			break;
		case 3:
			questao3();
			break;
		case 4:
			questao4();
			break;
		default:
			JOptionPane.showMessageDialog(null, "essa opção não existe");
			break;
		}

	}
	static void questao1() {
        String nome = JOptionPane.showInputDialog("Digite o nome do produto");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preÃ§o do produto")), newpreco = 0;
        if (preco < 0)
            JOptionPane.showMessageDialog(null,"PreÃ§o menor que zero, digite apenas numeros positivos");
        else{
            if(preco<50)
                JOptionPane.showMessageDialog(null,"NÃ£o tem desconto para esse produto");
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
	}
	static void questao2() {
		float r[] = new float[4];
		for (int i = 0; i < 4; i++) {
			r[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a resistência numero " + (i+1) + " "));	
		}
		
		float RE = 0.0f;
		String RES = "";
		for (int i = 0; i<4; i++) {
			RE += r[i];
			if (i == 3)
				RES += r[i];
			else
				RES += r[i] + ", ";
		}
		
		float maior = r[0], menor = r[0];
		for (int i = 1; i < 4; i++) {
			maior = (maior > r[i])? maior: r[i];
			menor = (menor < r[i])? menor: r[i];
		}
		
		JOptionPane.showMessageDialog(null, "Resistências fornecidas:\n" + 
				RES + "\n" +
				"Resistencia Equivalente: " + RE + "\n" +
				"Resistencia maior: " + maior + "\n" + 
				"Resistencia menor: " + menor);
	}
	static void questao3(){
		String login, senha;
		int ten = 0;
		do {
		login = JOptionPane.showInputDialog("Forneça o login");
		senha = JOptionPane.showInputDialog("Forneça a senha");
		ten+=1;
		if (login.equals("java8") && senha.equals("java8")) {
				JOptionPane.showMessageDialog(null, "Login e Senha aceitos" );
				ten = 4;
		}
		else
			JOptionPane.showMessageDialog(null, "Falha, verifique login e senha\n" +
					"Você tem mais "+ (3-ten) + " tentativas");
		
		} while (ten < 3);
	}
	static void questao4(){
		int tab;
		String res = "";
		tab = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero da tabuada"));
		for (int i  = 1; i<=10; i++) {
			if (i == 10)
				res += tab + " x " + i + " = " + (tab*i);
			else
				res += tab + " x " + i + " = " + (tab*i) + "\n";
		}
		JOptionPane.showMessageDialog(null, res);
	}
}

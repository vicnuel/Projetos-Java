package questoes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Usando a classe BufferedReader para entrada de dados, crie uma classe que receba o valor de um 
produto e a porcentagem de desconto, calcule e mostre o valor do desconto e o valor do produto 
com o desconto. Observação: o valor do desconto é calculado por meio da fórmula:
 valor do desconto = valor do produto * percentual de desconto / 100.*/
public class questao1 {

	public static void main(String[] args) throws IOException {
		float v_produto, desconto, new_preco, v_desconto;
		String s;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Digite o preço do produto: ");
		s = teclado.readLine();
		v_produto = Float.parseFloat(s);
		System.out.print("Digite a porcetagem de desconto[%]: ");
		s = teclado.readLine();
		desconto = Float.parseFloat(s);
		v_desconto = v_produto * (desconto/100);
		new_preco = v_produto - v_desconto;
		System.out.println("O novo preço do produto é: "+new_preco);
		System.out.println("O valor descontado foi: "+ v_desconto );
	}

}

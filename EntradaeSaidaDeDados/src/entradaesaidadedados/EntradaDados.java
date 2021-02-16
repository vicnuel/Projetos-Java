/*
 entrada
 */
package entradaesaidadedados;

import java.util.Scanner;

/**
 *
 * @author ve495
 */
public class EntradaDados {
    public static void main(String[] args) {
        // entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();
        //saida
        System.out.printf("A idade do %s é %d anos. \n", nome, idade);
        
        
    }
        
       
};

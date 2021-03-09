/*
Visibilidade: Nivel de acesso aos componetes internos de uma classe (atributos e metodos)
 + Publico
 - Privado
 # protegido
 
 */
package aula03.poo;

/**
 *
 * @author ve495
 */
public class Aula03Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.modelo= "Bic";
        c1.cor = "Azul";
        //c1.ponta = 0.5f; erro
        c1.carga= 80;
        c1.tampada = true;
        c1.status();
        c1.rabiscar();
    }
    
}

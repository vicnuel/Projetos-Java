package aula.pkg02.poo;

/**
 *
 * @author ve495
 */
public class Aula02Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada= false;
        c1.tampar();
        c1.rabiscar();
        //status c1
        c1.status();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "preta";
        c2.destampar();
        c2.rabiscar();
        // status c2
        c2.status();
    }   
    
}

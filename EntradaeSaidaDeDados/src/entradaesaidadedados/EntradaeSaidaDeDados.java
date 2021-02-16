/*
 Saida
 */
package entradaesaidadedados;

/**
 *
 * @author ve495
 */
public class EntradaeSaidaDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota = 8.5f;
        String nome = "Victor";
        
        System.out.print("1) Sua nota é " + nota + "\n");
        System.out.println("2) sua nota é " + nota);
        System.out.printf("3) A nota de %s é %f \n", nome, nota);
        System.out.printf("3) A nota de %s é %.3f \n", nome, nota);
        System.out.format("4) A nota de %s é %f \n", nome, nota);
        System.out.format("4) A nota de %s é %.3f \n", nome, nota);
        
    }  
}

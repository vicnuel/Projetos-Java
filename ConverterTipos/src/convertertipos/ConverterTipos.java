package convertertipos;
/*
 * @author ve495
 */
public class ConverterTipos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade = 30;
        // int para string
        String idadeS = Integer.toString(idade);
        System.out.printf("Agora a variavel idade = 30 é o String = '%s'\n", idadeS);
        // String para int
        String exem = "45";
        int exemI = Integer.parseInt(exem);
        System.out.printf("Agora a variavel String exem = '45' é o inteiro = %d\n", exemI); 
        String exem2 = "45";
        float exem2I = Float.parseFloat(exem2);
        System.out.printf("Agora a variavel String exem = '45' é o float = %f\n", exem2I); 
    }   
}

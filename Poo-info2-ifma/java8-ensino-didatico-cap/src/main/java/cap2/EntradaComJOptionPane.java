package cap2;

/**
 *
 * @author ve495
 */
import javax.swing.JOptionPane;
public class EntradaComJOptionPane {
    public static void main(String[] args) {
        String aux;
        float largura, area, comprimento, perimetro;
        try{
            aux = JOptionPane.showInputDialog("Entre com o comprimento");
            comprimento = Float.parseFloat(aux);
            
            aux = JOptionPane.showInputDialog("Entre com a largura.");
            largura = Float.parseFloat(aux);
            
            area = comprimento * largura;
            perimetro = 2*comprimento + 2*largura;
//            JOptionPane.showMessageDialog(null,"Área = " + area + " Perimetro = " + perimetro);
        } catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Ouve error na converção, por favor digite apenas caracteres alfanumericos" + erro.toString());
        }
    }    
}

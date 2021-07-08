package questoes;

public class Questao3 {

	public static void main(String[] args) {
		int pixels[][] = new int[40][40];
		for (int i = 0; i < pixels.length; i++) {
			for (int j = 0; j < pixels[i].length; j++) {
				pixels[i][j] = (int)(Math.random() * 255);	
			}	
		}
		String mensagem = "Tonalidades: \n";
		for (int i = 0; i < pixels.length; i++) {
			for (int j = 0; j < pixels[i].length; j++) {
				mensagem += "Nº " + ((j+1) + (i*40)) + ": " + pixels[i][j] + "\n";	
			}	
		}
		System.out.println(mensagem);
	}

}

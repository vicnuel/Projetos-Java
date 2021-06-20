package formataString;

public class Capitalize {
	public StringBuffer capitalize(String texto) {
		StringBuffer textoCap = new StringBuffer();
		String [] palavras = texto.split(" ");
		for (int i = 0; i < palavras.length; i++) {
			palavras[i] = palavras[i].substring(0, 1).toUpperCase() + palavras[i].substring(1, palavras[i].length());
			if (i == palavras.length - 1)
				textoCap.append(palavras[i]);
			else
				textoCap.append(palavras[i] + " ");
		}
		return textoCap;
	} 
}

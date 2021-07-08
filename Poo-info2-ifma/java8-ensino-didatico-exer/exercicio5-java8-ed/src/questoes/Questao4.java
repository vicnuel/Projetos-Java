package questoes;

public class Questao4 {

	public static void main(String[] args) {
		int par[] = new int[10];
		int impar[] = new int[10];
		for (int i = 0; i < 10; i++) {
			int aux = (int)(Math.random()*20);
			if (aux % 2 == 0) {
				par[i] = aux;
			} else {
				impar[i] = aux;
			}		
		}
		System.out.println("Array par:");
		for (int i = 0; i < par.length; i++) {
			System.out.println(par[i]);	
		}
		System.out.println("Array impar:");
		for (int i = 0; i < impar.length; i++) {
			System.out.println(impar[i]);	
		}

	}

}

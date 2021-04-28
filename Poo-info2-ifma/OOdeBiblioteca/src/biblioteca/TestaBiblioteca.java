package biblioteca;

public class TestaBiblioteca {

	public static void main(String[] args) {
		Autor autor = new Autor("Jostein Gaarder", "08/08/1952", "09876543", "123.987.456-34");
		System.out.println(autor.toString());
		Livro livro = new Livro(autor, "O Mundo De Sofia", "Filosofia", "Companhia das Litras", 568, 31.90);
		System.out.println(livro.toString());
		Emprestimo emprestimo = new Emprestimo(autor, livro, "30/05/2021");
		System.out.println(emprestimo.toString());
	}
}

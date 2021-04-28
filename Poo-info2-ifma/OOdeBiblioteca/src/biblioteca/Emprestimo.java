package biblioteca;

public class Emprestimo {
	private Autor autor;
	private Livro livro;
	private String dataDevolucao;
	public Emprestimo(Autor autor, Livro livro, String dataDevolucao) {
		super();
		this.autor = autor;
		this.livro = livro;
		this.dataDevolucao = dataDevolucao;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	@Override
	public String toString() {
		return "Emprestimo [autor=" + autor + ", livro=" + livro + ", dataDevolucao=" + dataDevolucao + "]";
	}
	
}

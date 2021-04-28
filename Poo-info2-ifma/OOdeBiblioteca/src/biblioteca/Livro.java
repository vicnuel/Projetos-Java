package biblioteca;

public class Livro {
	private Autor autor;
	private String titulo, areaConcentracao, editora;
	private int numeroPaginas;
	private double valor;
	public Livro(Autor autor, String titulo, String areaConcentracao, String editora, int numeroPaginas, double valor) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.areaConcentracao = areaConcentracao;
		this.editora = editora;
		this.numeroPaginas = numeroPaginas;
		this.valor = valor;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAreaConcentracao() {
		return areaConcentracao;
	}
	public void setAreaConcentracao(String areaConcentracao) {
		this.areaConcentracao = areaConcentracao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", titulo=" + titulo + ", areaConcentracao=" + areaConcentracao + ", editora="
				+ editora + ", numeroPaginas=" + numeroPaginas + ", valor=" + valor + "]";
	}
	
}

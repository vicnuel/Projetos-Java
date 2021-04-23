package prat01;

import java.util.Scanner;

public class Aluno {
	private int idade, periodo;
	private String nome;
	private boolean possuiPc, aprendeu; 
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isPosuiPc() {
		return possuiPc;
	}

	public void setPossuiPc(boolean posuiPc) {
		possuiPc = posuiPc;
	}

	public boolean isAprendeu() {
		return aprendeu;
	}

	public void setAprendeu(boolean aprendeu) {
		this.aprendeu = aprendeu;
	}

	public Aluno() {
		String res;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome do aluno: "); this.nome = sc.nextLine();
		System.out.print("Digite a idade do aluno: "); this.idade = sc.nextInt();
		System.out.print("Digite o periodo de referencia do aluno: "); this.periodo = sc.nextInt();
		System.out.print("O aluno possui um Pc? S/N "); res = sc.next();
		this.possuiPc = (res.equals("s") || res.equals("S") || res.equals("Sim") || res.equals("sim"))? true: false;
	}
	
	public Aluno ( String nome, int idade,int periodo) {
		this.idade = idade;
		this.nome = nome;
		this.periodo = periodo;
	}
	public Aluno ( String nome, int idade,int periodo, boolean possuiPc ) {
		this.idade = idade;
		this.nome = nome;
		this.periodo = periodo;
		this.possuiPc = possuiPc;
	}
	
	public void ler() {
		System.out.println("Aluno Lendo");
	}
	public void programar() {
		if (possuiPc) {
			System.out.println("Aluno Programando");
		} else {
			System.out.println("Uun, Acho que o " + this.nome+ " não tem um Pc.");
		}
	}

}

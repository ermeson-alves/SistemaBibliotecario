package main;

public class Leitor {
	private String nome;
	private boolean alugando=false;
	private Copia copiaAlugada;
	
	
	public Leitor(String nome) {
		this.nome=nome;
	}

	public void Alugar(Copia copia) {
		alugando=true;
		this.copiaAlugada=copia;
	}
	
	public void Devolver() {
		this.copiaAlugada=null;
		this.alugando=false;
	}
	

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Copia getCopiaAlugada() {
		return copiaAlugada;
	}
	
	
	
}
package main;

/**
 * Quem pode alugar uma obra da Biblioteca.
 *
 * 
 * @author Carlos Victor
 * @author Cristofe
 * @author Leonardo
 * @author Guilherme Noronha
 * @author Eduardo Ferreira
 * @author Ermeson Alves
 */

public class Leitor {
	private String nome;
	private boolean alugando = false;
	private Copia copiaAlugada;

	public Leitor(String nome) {
		this.nome = nome;
	}

	/**
	 * Atualiza o status de quem está alugando uma cópia.
	 * 
	 * @param copia A copia que será alugada.
	 */
	public void Alugar(Copia copia) {
		this.alugando = true;
		this.copiaAlugada = copia;
	}

	public void Devolver() {
		this.copiaAlugada.serDevolvida();
		this.copiaAlugada = null;
		this.alugando = false;
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
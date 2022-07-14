package main;

/**
 * Pessoa que pode alugar uma obra da Biblioteca.
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
	/**
	 * Nome do leitor.
	 */
	private String nome;
	/**
	 * Status de se esta alugando uma obra (true indica que esta alugando uma obra).
	 */
	private boolean alugando=false;
	/**
	 * Obra que o leitor esta alugando (caso esteja alugando uma).
	 */
	private Copia copiaAlugada;
        
	
	
	public Leitor(String nome) {
		this.nome=nome;
	}

	/**
	 * Este metodo faz com que o leitor alugue uma obra
	 */
	public void Alugar(Copia copia) {
		alugando=true;
		this.copiaAlugada=copia;
	}
	
	/**
	 * Este metodo faz com que o leitor devolva a obra que esta alugando.
	 */
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
        
        public String toString() {
		return nome;
		
	}
	
	
	
}
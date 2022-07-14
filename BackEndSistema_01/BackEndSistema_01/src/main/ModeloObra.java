package main;
/**
 * Classe que contém atributos e métodos comuns entre um objeto do tipo Obra e outro do tipo Copia.
 * @author Carlos Victor
 * @author Cristofe
 * @author Leonardo
 * @author Guilherme Noronha
 * @author Eduardo Ferreira
 * @author Ermeson Alves
 */
public abstract class ModeloObra {
	protected String nome;
	protected String autor;
	protected String editora;
	
	public ModeloObra(String nome, String autor, String editora) {
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
	}
	public ModeloObra() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
}

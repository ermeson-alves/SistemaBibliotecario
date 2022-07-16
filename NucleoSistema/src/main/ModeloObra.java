package main;

/**
 * Esta classe contém atributos comuns a todos os possiveis objetos alugaveis da biblioteca
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
        
        public ModeloObra(){
            
        }
}

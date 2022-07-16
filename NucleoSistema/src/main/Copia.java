package main;
import java.util.ArrayList;

/**
 * Esta classe nao é utilizada nesta versão do sistema
 * 
 * @author Carlos Victor
 * @author Cristofe
 * @author Leonardo
 * @author Guilherme Noronha
 * @author Eduardo Ferreira
 * @author Ermeson Alves
 */
public class Copia extends ModeloObra{// Existem atributos de uma obra presentes em copia
	
	/**
	 * Numero único de cada copia.
	 */
	private int codigoCopia;
	/**
	 * Status de emprestimo da obra.
	 */
	private boolean alugada=false;
	/**
	 * Leitor que esta alugando esta copia.
	 */
	private Leitor locatario;
	/**
	 * String contendo o prazo de devolução do item.
	 */
	private String prazoDevolucao="-";
	
	
	
	public Copia() {// O Codigo copica deve ser atribuido com base no indiceCopias
		super();
		 
	}
	
	public String getNome() {
		return nome;
	}
	public void  setNome(String nome) {
		this.nome=nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor=autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora=editora;
	}
	////
	
	public int getCodigoCopia() {
		return codigoCopia;
	}

	public boolean getAlugada() {
		return alugada;
	}

	public Leitor getLocatario() {
		return locatario;
	}


	public String getPrazoDevolucao() {
		return prazoDevolucao;
	}
	
	/**
	 * Realiza o emprestimo de um item e atualiza seu status para controle de informaçoes.
	 * @param leitor Leitor que solicitou o emprestimo.
	 */
	public void serAlugada(Leitor leitor, String prazoDevolucao) {
		this.alugada=true;
		this.locatario=leitor;
		this.prazoDevolucao=prazoDevolucao;
	}
	
	/**
	 * Atualiza o status de um item ao ser devolvido para que ele esteja disponível novamente na coleçao de itens.
	 */
	public void serDevolvida() {
		this.alugada=false;
		this.locatario=null;
		this.prazoDevolucao="-";
		
	}
	
	
	
	
	
	
}

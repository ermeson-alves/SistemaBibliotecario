package main;

import java.util.ArrayList;

/**
 * Classe que representa uma cópia de algum itém armazenável em um objeto do
 * tipo Biblioteca.
 * 
 * @author Carlos Victor
 * @author Cristofe
 * @author Leonardo
 * @author Guilherme Noronha
 * @author Eduardo Ferreira
 * @author Ermeson Alves
 */
public class Copia extends ModeloObra {// Existem atributos de uma obra presentes em copia
	/**
	 * Número único de cada cópia.
	 */
	private int codigoCopia;
	/**
	 * Status de empréstimo da obra.
	 */
	private boolean alugada = false;
	/**
	 * Quem está alugando o item em questão.
	 */
	private Leitor locatario;
	/**
	 * String contendo o prazo de devolução do item.
	 */
	private String prazoDevolucao = "-";

	public Copia() {// O Codigo copica deve ser atribuido com base no indiceCopias
		super();

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

	@Override
	public String toString() {
		String status;
		if (this.alugada) {
			status = "Alugada";
		} else {
			status = "Disponível";
		}
		return " (" + nome + "-" + autor + "-" + editora + ", codigo copia: " + codigoCopia
				+ ", status de disponibilidade: " + status + ") ";
	}

	public int getCodigoCopia() {
		return codigoCopia;
	}

	public void setCodigoCopia(int codigoCopia) {
		this.codigoCopia = codigoCopia;
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
	 * Realiza o empréstimo de um item e atualiza seu status para controle de
	 * informações.
	 * 
	 * @param leitor Quem solicitou o empréstimo.
	 */
	public void serAlugada(Leitor leitor, String prazoDevolucao) {
		leitor.Alugar(this);
		this.alugada = true;
		this.locatario = leitor;
		this.prazoDevolucao = prazoDevolucao;
	}

	/**
	 * Atualiza o status de um item ao ser devolvido para que ele esteja disponível
	 * novamente na coleção de itens.
	 */
	public void serDevolvida() {
		this.locatario.Devolver();
		this.alugada = false;
		this.locatario = null;
		this.prazoDevolucao = "-";

	}

}

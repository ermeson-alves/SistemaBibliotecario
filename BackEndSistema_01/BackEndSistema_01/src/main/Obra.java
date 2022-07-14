package main;

import java.util.ArrayList;

/**
 * Algum item que pode ser armazenado na biblioteca, com nome, autor, editora
 * (se for o caso) e um array de copias desse item.
 * 
 * @author Carlos Victor
 * @author Cristofe
 * @author Leonardo
 * @author Guilherme Noronha
 * @author Eduardo Ferreira
 * @author Ermeson Alves
 */

public class Obra extends ModeloObra {
	/**
	 * Coleção de copias do item.
	 */
	private ArrayList<Copia> copias = new ArrayList<Copia>();
	/**
	 * Código único desse item, atribuído no momento de sua inserção em um objeto do
	 * tipo biblioteca.
	 */
	private int codigoObra = 0;
	/**
	 * Quantidade de copias que o item possui até o momento.
	 */
	private int indiceCopias = 0;

	/**
	 * Cria uma nova obra com nome, autor, editora, e alguma quantidade de copias.
	 * 
	 * @param nome             Nome da Obra
	 * @param autor            Autor da Obra
	 * @param editora          Editora da Obra
	 * @param quantidadeCopias quantidade de copias desse item
	 */
	public Obra(String nome, String autor, String editora, int quantidadeCopias) {
		super(nome, autor, editora);
		this.adicionarCopia(quantidadeCopias);
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

	/**
	 * Exibe todas as copias da obra em questão.
	 * 
	 * @return Uma coleção de copias.
	 */
	public ArrayList<Copia> getCopias() {
		return copias;
	}

	public int getCodigoObra() {
		return codigoObra;
	}

	public void setCodigoObra(int codigoObra) {
		this.codigoObra = codigoObra;
	}

	@Override
	public String toString() {
		return " (Obra: " + nome + ", autor: " + autor + ", editora: " + editora + ", codigo obra: " + codigoObra
				+ ", numero de copias: " + indiceCopias + ") ";
	}

	/**
	 * Adiciona uma copia ao item armazenado.
	 * 
	 * @param numeroCopias Número de cópias a serem armazenadas.
	 */
	public void adicionarCopia(int numeroCopias) {
		for (int i = 0; i < numeroCopias; i++) {
			Copia copia = new Copia();
			copia.nome = this.nome;
			copia.autor = this.autor;
			copia.editora = this.editora;

			copia.setCodigoCopia(indiceCopias);
			this.copias.add(copia);
			this.indiceCopias += 1;
		}
	}

	/**
	 * Retira uma copia da Obra da coleção de obras.
	 * 
	 * @param codigoCopia numéro único de cada cópia, atribuido no momento de sua
	 *                    criação.
	 */
	public void retirarCopia(int codigoCopia) {// Pode ser pedido para retirar uma copia sendo que não existem copias
		for (int i = 0; i < this.copias.size(); i++) {
			if (copias.get(i).getCodigoCopia() == codigoCopia) {
				copias.remove(i);
			}
		}
	}

}

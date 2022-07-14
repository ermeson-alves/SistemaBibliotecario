package main;

import java.util.ArrayList;

/**
 * Esta classe representa algum item que pode ser alugado da biblioteca, com nome (unico), autor e editora (se for o caso).
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
	 * Coleção de copias do item. Nao eh utilizado na versao atual do sistema.
	 */
    private ArrayList<Copia> copias = new ArrayList<Copia>();
    /**
	 * Status de emprestimo da obra.
	 */
    private boolean alugada = false;
    /**
	 * Leitor que esta alugando esta obra.
	 */
    private String locatario;
    /**
	 * String contendo o prazo de devoluçao do item.
	 */
    private String prazoDevolucao = "-";
    /**
	 * Numero único de cada obra.
	 */
    private int codigoObra = 0;
    /**
	 * Quantidade de copias que o item possui ate o momento. Nao eh utilizado na versao atual do sistema.
	 */
    private int indiceCopias = 0; // aumenta quando uma copia é adicionada
    //private int quantidadeCopias=copias.size();	

    /**
	 * Cria uma nova obra com nome, autor, editora, e alguma quantidade de copias.
	 * @param nome Nome da Obra
	 * @param autor Autor da Obra
	 * @param editora Editora da Obra
	 * @param quantidadeCopias quantidade de copias desse item
	 */
    public Obra(String nome, String autor, String editora, int quantidadeCopias) {
        super(nome, autor, editora);
        this.adicionarCopia(quantidadeCopias);
    }

    // Getters e Setters padrões
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
    
    public boolean getAlugada() {
	return alugada;
    }

    public String getLocatario() {
	return locatario;
    }

    public String getPrazoDevolucao() {
	return prazoDevolucao;
    }

    //Metodos especificos
    public ArrayList<Copia> getCopias() {
        return copias;
    }

    public int getCodigoObra() {
        return codigoObra;
    }

    public void setCodigoObra(int codigoObra) {
        this.codigoObra = codigoObra;
    }

    public void alugarObra(String leitor, String prazoDevolucao) {
        this.alugada = true;
        this.locatario = leitor;
        this.prazoDevolucao = prazoDevolucao;
    }
    
    public void devolverObra() {
	this.alugada=false;
	this.locatario=null;
	this.prazoDevolucao="-";		
    }

    @Override
    public String toString() {
        return "Obra: " + nome + " / Autor: " + autor + " / Editora: " + editora + " / Codigo: " + codigoObra;

    }

    /**
	 * Adiciona uma copia ao item armazenado. Nao eh utilizado na versao final do sistema.
	 * @param numeroCopias Número de cópias a serem armazenadas.
	 */
    public void adicionarCopia(int numeroCopias) {
        for (int i = 0; i < numeroCopias; i++) {
            Copia copia = new Copia();
            copia.nome = this.nome;
            copia.autor = this.autor;
            copia.editora = this.editora;

            int codigoCopia = copia.getCodigoCopia();
            codigoCopia = indiceCopias;
            this.copias.add(copia);
            this.indiceCopias += 1;
        }
    }

    /**
	 * Retira uma copia da Obra da coleção de obras. Nao eh utilizado na versao final do sistema.
	 * @param codigoCopia numéro único de cada cópia, atribuido no momento de sua criação.
	 */
    public void retirarCopia(int codigoCopia) {// Pode ser pedido para retirar uma copia sendo que não existem copias
        for (int i = 0; i < this.copias.size(); i++) {
            if (copias.get(i).getCodigoCopia() == codigoCopia) {
                copias.remove(i);
            }
        }
    }

}

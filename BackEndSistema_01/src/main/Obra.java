package main;

import java.util.ArrayList;

public class Obra extends ModeloObra {

    private ArrayList<Copia> copias = new ArrayList<Copia>();
    private boolean alugada = false;
    private String locatario;
    private String prazoDevolucao = "-";
    private int codigoObra = 0;
    private int indiceCopias = 0; // aumenta quando uma copia é adicionada
    //private int quantidadeCopias=copias.size();	

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

    // Adicionar copia
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

    // Retirar copia
    public void retirarCopia(int codigoCopia) {// Pode ser pedido para retirar uma copia sendo que não existem copias
        for (int i = 0; i < this.copias.size(); i++) {
            if (copias.get(i).getCodigoCopia() == codigoCopia) {
                copias.remove(i);
            }
        }
    }

}

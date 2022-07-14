/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import Exceptions.LeitorExistenteException;
import Exceptions.LeitorNomeVazioException;
import java.util.ArrayList;
/**
 * Esta classe armazena todos os leitores registrados na biblioteca.
 * Esta classe possui instancia unica (singleton).
 * @author Carlos
 * @author Guilherme
 */
public class ConjuntoLeitores {
	/**
	 * ArrayList contendo todos os leitores registrados na biblioteca
	 */
    private static ArrayList<Leitor> leitores;
	/**
	 * Instancia unica da classe.
	 */
  private static ConjuntoLeitores uniqueInstance;

  /**
   * Construtor privado da classe, no formato singleton.
   */
  private ConjuntoLeitores() {
		this.leitores = new ArrayList<Leitor>();
	}

  public ArrayList<Leitor> getLeitores() {
		return leitores;
	}

	/**
	 * Este metodo adiciona um novo leitor ao sistema com o nome referenciado.
	 * @param nome Nome do novo leitor.
	 */
  public void adicionarLeitor (String nome) throws LeitorExistenteException, LeitorNomeVazioException {
		/*Leitor leitor = new Leitor(nome);
		leitores.add(leitor);*/
                if(nome!=null) {
		  	boolean achouLeitor = false;
		  	for (int i = 0; i < this.leitores.size(); i++) {// percorrer o arraylist
				if (leitores.get(i).getNome() == nome) {
					achouLeitor = true;
				}
		  	}
		  	if(achouLeitor) {
		  		
		  		throw new LeitorExistenteException("O leitor já está cadastrado!");
		  		
		  	} else {
		  		Leitor leitor = new Leitor(nome);
		  		leitores.add(leitor);
		  	}
		} else {
			throw new LeitorNomeVazioException("O campo 'Nome' deve estar preenchido");
		}
	}

	/**
	 * Este metodo retira um leitor do sistema com o nome referenciado.
	 * @param nome Nome do leitor que sera retirado.
	 */
  public void retirarLeitor (String nome) {
    for(int i = 0; i < leitores.size(); i ++){
	            if(leitores.get(i).getNome() == nome){
	                leitores.remove(i);}}
  }

  /**
   * Este metodo retorna a instancia unica da classe.
   */
  public static ConjuntoLeitores getInstance(){
		if (uniqueInstance == null) {
			uniqueInstance = new ConjuntoLeitores();
		}
		return uniqueInstance;
	}
}

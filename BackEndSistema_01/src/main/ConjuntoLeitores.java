/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import Exceptions.LeitorExistenteException;
import Exceptions.LeitorNomeVazioException;
import java.util.ArrayList;
/**
 *
 * @author Guilherme
 */
public class ConjuntoLeitores {
    private static ArrayList<Leitor> leitores;
  private static ConjuntoLeitores uniqueInstance;

  private ConjuntoLeitores() {
		this.leitores = new ArrayList<Leitor>();
	}

  public ArrayList<Leitor> getLeitores() {
		return leitores;
	}

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

  public void retirarLeitor (String nome) {
    for(int i = 0; i < leitores.size(); i ++){
	            if(leitores.get(i).getNome() == nome){
	                leitores.remove(i);}}
  }

  public static ConjuntoLeitores getInstance(){
		if (uniqueInstance == null) {
			uniqueInstance = new ConjuntoLeitores();
		}
		return uniqueInstance;
	}
}

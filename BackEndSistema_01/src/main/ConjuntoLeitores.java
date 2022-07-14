/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
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

  public void adicionarLeitor (String nome) {
		Leitor leitor = new Leitor(nome);
		leitores.add(leitor);
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

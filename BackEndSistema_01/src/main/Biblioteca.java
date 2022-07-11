package main;

import java.util.ArrayList;

public class Biblioteca {
	private static ArrayList<Obra> obras;
	public static int indiceObras=0;
	private static Biblioteca uniqueInstance;
	
	private Biblioteca() {
		this.obras=new ArrayList<Obra>(); // Quando a Classe é criada, deve-se criar o Array de obras
	}
	
	
	public Obra buscarObra(int codigoObra) {
		Obra o=null;
		for(Obra obra:this.obras) {
			if(obra.getCodigoObra()==codigoObra) {
				o=obra;
			}
		}
		return (Obra) o;
	}
	
	
	public ArrayList<Obra> getObras() {
		return obras;
	}
	
	
	public void adicionarObra (String nome, String autor, String editora, int quantidadeCopias) {
		boolean achou_obra=false;
		for(int i = 0; i < this.obras.size(); i ++){// percorrer o arraylist
	           if(obras.get(i).getNome()==nome){
	               achou_obra=true;
	               obras.get(i).adicionarCopia(1);
	               }
	    }
		if(achou_obra) {
			System.out.println("Obra existente");
		}
		else {//se não achou uma obra com o mesmo nome, cria uma nova
			 Obra obra=new Obra(nome,autor,editora,quantidadeCopias);
			 obras.add(obra);
			 obra.setCodigoObra(indiceObras);
			 indiceObras+=1;
		 }
	}
	
	
	 public void retirarObra(int codigoObra) {// Usar apenas 'obras.remove(codigoObra)' implica descontrole sobre o indice
		 for(int i = 0; i < obras.size(); i ++){
	            if(obras.get(i).getCodigoObra()==codigoObra){
	                obras.remove(i);}}  
	}
	
	public static Biblioteca getInstance(){
		if (uniqueInstance==null) {
			uniqueInstance=new Biblioteca();
		}
		return uniqueInstance;
	}
	
}

package main;

import java.util.ArrayList;
/**
 * 
 * @author Carlos Victor
 * @author Cristofe
 * @author Leonardo
 * @author Guilherme Noronha
 * @author Eduardo Ferreira
 * @author Ermeson Alves
 * 
 * @version 1.0
 * @since 2022-07-12
 * 
 *	
 */

/**
 * Classe principal que armazena todas as obras e oferece métodos como inclusão e remoção das mesmas.
 */
public class Biblioteca {
	/**
	 * Coleção de obras da biblioteca.
	 */
	private static ArrayList<Obra> obras;
	/**
	 * Número que começa em 0 e aumenta em 1 para cada obra
adicionada à biblioteca.
	 */
	public static int indiceObras=0;
	private static Biblioteca uniqueInstance;
	
	/**
	 * Construtor privado que, ao ser invocado, instancia o ArrayList obras.
	 */
	private Biblioteca() {
		this.obras=new ArrayList<Obra>();
	}
	
	/**
	 * Busca por uma obra específica armazenada.
	 * @param codigoObra Código único atribuído a uma obra quando ela é criada.
	 * @return Obra com o código correspondente.
	 */
	public Obra buscarObra(int codigoObra) {
		Obra o=null;
		for(Obra obra:this.obras) {
			if(obra.getCodigoObra()==codigoObra) {
				o=obra;
			}
		}
		return (Obra) o;
	}
	
	/**
	 * @return Coleção de obras armazenadas.
	 */
	public ArrayList<Obra> getObras() {
		return obras;
	}
	
	/**
	 * Cria uma obra com o nome, autor e editora inseridos, e a essa
já será atribuído um número de cópias (se forem adcionadas com a obra).
	 * @param nome Nome da Obra
	 * @param autor Autor da Obra
	 * @param editora Editora da Obra
	 * @param quantidadeCopias número de copias que serão adicionadas a coleção no momento de inserção da obra.
	 */
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
		else {
			 Obra obra=new Obra(nome,autor,editora,quantidadeCopias);
			 obras.add(obra);
			 obra.setCodigoObra(indiceObras);
			 indiceObras+=1;
		 }
	}
	
	/**
	 * Remove uma obra do ArrayList de obras.
	 * @param codigoObra
	 */
	 public void retirarObra(int codigoObra) {
		 for(int i = 0; i < obras.size(); i ++){
	            if(obras.get(i).getCodigoObra()==codigoObra){
	                obras.remove(i);}}  
	}
	/**
	 * Fornece o objeto biblioteca que armazena na memória todas as obras e que só pode ser instanciado uma única vez.
	 * @return A instância da classe Biblioteca.
	 */
	public static Biblioteca getInstance(){
		if (uniqueInstance==null) {
			uniqueInstance=new Biblioteca();
		}
		return uniqueInstance;
	}
	
}

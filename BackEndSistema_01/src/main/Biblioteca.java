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
 * Classe principal que armazena todas as obras e oferece métodos como inclusão e remoção delas do sistema.
 * Esta classe possui instancia unica (singleton).
 */
public class Biblioteca {
	/**
	 * Colecao de obras da biblioteca.
	 */
	private static ArrayList<Obra> obras;
	/**
	 * Numero que gera o codigoObra de uma Obra. Comeca em 0 e aumenta em 1 para cada obra adicionada na biblioteca.
	 */
	public static int indiceObras=0;
	/**
	 * Instancia unica da classe.
	 */
	private static Biblioteca uniqueInstance;
        //private ArrayList<Obra> aux=null;
	
	/**
   * Construtor privado da classe, no formato singleton.
   */
	private Biblioteca() {
		this.obras=new ArrayList<Obra>(); // Quando a Classe é criada, deve-se criar o Array de obras
	}
	
	/**
	 * Busca por uma obra especifica armazenada.
	 * @param codigoObra Código único atribuido a uma obra quando ela eh criada.
	 * @return Obra com o codigo correspondente.
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
        
	public ArrayList<Obra> getObras() {
		return obras;
	}
	
	
	/*public void adicionarObra (String nome, String autor, String editora, int quantidadeCopias) {
		boolean achou_obra=false;
		for(int i = 0; i < this.obras.size(); i ++){// percorrer o arraylist
	           if(obras.get(i).getNome()==nome){
	               achou_obra=true;
	               if(quantidadeCopias==0) {quantidadeCopias=1;}
	               obras.get(i).adicionarCopia(quantidadeCopias);
	               }
	    }
		if(achou_obra) {
		}
		else {//se não achou uma obra com o mesmo nome, cria uma nova
			 Obra obra=new Obra(nome,autor,editora,quantidadeCopias);
			 obras.add(obra);
			 obra.setCodigoObra(indiceObras);
			 indiceObras+=1;
		 }
	}*/

	/**
	 * Cria uma obra com o nome, autor e editora inseridos, e a essa
ja sera atribuido um número de copias (se forem adcionadas com a obra).
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
	               if(quantidadeCopias==0) {obras.get(i).adicionarCopia(1);}
	               else {obras.get(i).adicionarCopia(quantidadeCopias);}
	           }
	    }
		if(achou_obra) {}
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
	 public void retirarObra(int codigoObra) {// Usar apenas 'obras.remove(codigoObra)' implica descontrole sobre o indice
		 for(int i = 0; i < obras.size(); i ++){
	            if(obras.get(i).getCodigoObra()==codigoObra){
	                obras.remove(i);
                        for(int j=0; j<obras.size(); j++){
                            if(obras.get(j).getCodigoObra() > i){
                                obras.get(j).setCodigoObra(obras.get(j).getCodigoObra() - 1);
                                indiceObras-=1;
                            }
                        }
                    }
                 }                
	}
         
         public ArrayList<Obra> getArrayAuxiliar(){
             ArrayList<Obra> obrasAlugadas = new ArrayList<Obra>();
             for(int i=0; i<Biblioteca.getInstance().getObras().size(); i++){
                if(Biblioteca.getInstance().getObras().get(i).getAlugada()==true){
                    obrasAlugadas.add(Biblioteca.getInstance().getObras().get(i));
                }
            }
            return obrasAlugadas;
         }
	
	/**
   * Este metodo retorna a instancia unica da classe.
   */
	public static Biblioteca getInstance(){
		if (uniqueInstance==null) {
			uniqueInstance=new Biblioteca();
		}
		return uniqueInstance;
	}
	
}

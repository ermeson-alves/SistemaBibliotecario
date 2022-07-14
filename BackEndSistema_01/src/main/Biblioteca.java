package main;

import Exceptions.ObraExistenteException;
import Exceptions.ObraNomeVazioException;
import java.util.ArrayList;

public class Biblioteca {
	private static ArrayList<Obra> obras;
	public static int indiceObras=0;
	private static Biblioteca uniqueInstance;
        //private ArrayList<Obra> aux=null;
	
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
        public void adicionarObra (String nome, String autor, String editora, int quantidadeCopias) throws ObraExistenteException, ObraNomeVazioException {
		boolean achou_obra=false;
                if(nome!=null){
                    for(int i = 0; i < this.obras.size(); i ++){// percorrer o arraylist
                        if(obras.get(i).getNome()==nome){
                            achou_obra=true;
                            if(quantidadeCopias==0) {obras.get(i).adicionarCopia(1);}
                        else {obras.get(i).adicionarCopia(quantidadeCopias);}
                        }
                    }
                    if(achou_obra) {
                        throw new ObraExistenteException("Essa obra ja existe");
                    } else {
			 Obra obra=new Obra(nome,autor,editora,quantidadeCopias);
			 obras.add(obra);
			 obra.setCodigoObra(indiceObras);
                         indiceObras+=1;
                         
                      }
                } else{
                        throw new ObraNomeVazioException("O campo Nome deve estar preenchido");
                }
	}
	
	
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
	
	public static Biblioteca getInstance(){
		if (uniqueInstance==null) {
			uniqueInstance=new Biblioteca();
		}
		return uniqueInstance;
	}
	
}

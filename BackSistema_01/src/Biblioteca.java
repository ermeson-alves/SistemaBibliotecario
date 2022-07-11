import java.util.ArrayList;

public class Biblioteca {
	private static ArrayList<Obra> obras;
	public static int indiceObras=0;
	private static Biblioteca uniqueInstance;
	
	private Biblioteca() {
		this.obras=new ArrayList<Obra>(); // Quando a Classe é criada, deve-se criar o Array de obras
	}
	
	public ArrayList<Obra> getObras() {
		return obras;
	}
	
	
	public void adicionarObra(String nome, String autor, String editora, int quantidadeCopias) {
		Obra obra=new Obra(nome,autor,editora,quantidadeCopias);
		// Se a obra já existir em obras, deve ser levantada exceção;
		obras.add(obra);
		obra.setCodigoObra(indiceObras);
		indiceObras+=1;
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

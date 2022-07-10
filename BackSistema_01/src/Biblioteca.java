import java.util.ArrayList;

public class Biblioteca { // Pegar codigo de obra 
	private ArrayList<Obra> obras;
	public static int indiceObras=0;
	private static Biblioteca uniqueInstance;
	
	private Biblioteca() {
	}
	
	public static Biblioteca getInstance(){
		if (uniqueInstance==null) {
			uniqueInstance=new Biblioteca();
		}
		return uniqueInstance;
	}
	
	
	public void adicionarObra(Obra obra) {
		if(obras.contains(obra)) { // Obra deve ter um atributo para numero de copias
			obra.adicionarCopia(1);
		}
		else {
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
	
	public ArrayList<Obra> getObras() {
		return obras;
	}
	
	


	public static void main(String[] args) {
		
	}
}

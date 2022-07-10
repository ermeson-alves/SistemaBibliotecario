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
			get(obras.lastIndexOf(obra)).copias.add(obra);
			
		}
		else {
			obras.add(obra);
			obra.setcodigoObra(indiceObras);
			indiceObras+=1; 
		}
	}
	 public void retirarObra(Obra obra) {// As copias já serão deletadas, pois estão armazenadas no objeto obra
		obras.remove(obra);
	}
	
	
	public ArrayList<Obra> getObras() {
		return obras;
	}

	


	public static void main(String[] args) {
		
	}
}

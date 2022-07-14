package main;
public class Teste {
	public static void main(String[] args) {
		Biblioteca biblioteca =Biblioteca.getInstance();
		System.out.println(biblioteca);
		biblioteca.adicionarObra("Dom Casmurro", "Machado de Assis", "Ler Livro",1);
		biblioteca.adicionarObra("Romeu e Julieta", "Shakespeare", "Ler Livro",1);
                biblioteca.buscarObra(0).alugarObra("Guilherme", "24/03");
                biblioteca.buscarObra(1).alugarObra("Guilherm", "24/03");
		
		 System.out.println(biblioteca.getObras());
		 
		 System.out.println("");
		 
		 
		 biblioteca.retirarObra(1);
		 
		 
		 
		 System.out.println(biblioteca.getObras());
                 for(int i=0; i<biblioteca.getObras().size(); i++){
                     if(biblioteca.getObras().get(i).getAlugada()==true){
                         System.out.println("alugada");
                     }
                 }
	}
}

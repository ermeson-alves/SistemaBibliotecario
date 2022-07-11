package main;
public class Teste {
	public static void main(String[] args) {
		Biblioteca biblioteca =Biblioteca.getInstance();
		System.out.println(biblioteca);
		biblioteca.adicionarObra("Dom Casmurro", "Machado de Assis", "Ler Livro",0);
		biblioteca.adicionarObra("Romeu e Julieta", "Shakespeare", "Ler Livro",4);
		
		biblioteca.adicionarObra("Dom Casmurro", "Machado de Assis", "Ler Livro",0);
		
		 System.out.println(biblioteca.getObras());
		 
		 System.out.println("");
		 
		 
		 biblioteca.retirarObra(1);
		 
		 
		 
		 System.out.println(biblioteca.getObras());
	}
}

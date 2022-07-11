package main;
import java.util.ArrayList;

public class Copia extends ModeloObra{// Existem atributos de uma obra presentes em copia
	
	private int codigoCopia;
	private boolean alugada=false;
	private Leitor locatario;
	private String prazoDevolucao="-";
	
	
	
	public Copia() {// O Codigo copica deve ser atribuido com base no indiceCopias
		super();
		 
	}
	
	public String getNome() {
		return nome;
	}
	public void  setNome(String nome) {
		this.nome=nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor=autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora=editora;
	}
	////
	
	public int getCodigoCopia() {
		return codigoCopia;
	}

	public boolean getAlugada() {
		return alugada;
	}

	public Leitor getLocatario() {
		return locatario;
	}


	public String getPrazoDevolucao() {
		return prazoDevolucao;
	}
	
	//ser Alugada
	public void serAlugada(Leitor leitor, String prazoDevolucao) {
		this.alugada=true;
		this.locatario=leitor;
		this.prazoDevolucao=prazoDevolucao;
	}
	
	//ser Devolvida
	public void serDevolvida() {
		this.alugada=false;
		this.locatario=null;
		this.prazoDevolucao="-";
		
	}
	
	
	
	
	
	
}

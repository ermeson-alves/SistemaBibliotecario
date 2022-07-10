import java.util.ArrayList;

public class Obra extends ModeloObra{
	private ArrayList<Copia> copias;   
	private int codigoObra=0;
	private int indiceCopias=0; // aumenta quando uma copia é adicionada
	
	

	public Obra(String nome, String autor, String editora, int codigoObra, int indiceCopias) {
		super(nome,autor,editora);
		this.codigoObra = codigoObra;
		this.indiceCopias = indiceCopias;
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
	
	
	
	public ArrayList<Copia> getCopias() {
		return copias;
	}

	public int getCodigoObra() {
		return codigoObra;
	}
	public void setCodigoObra(int codigoObra) {
		this.codigoObra=codigoObra;
	}
	
	
	
	// Adicionar copia
	public void adicionarCopia(int numeroCopias) {
		for(int i=0;i<numeroCopias;i++) {
			Copia copia=new Copia(this,this.indiceCopias);
			this.copias.add(copia);
			indiceCopias+=1;
	
		}
	}
	
	// Retirar copia
	public void retirarCopia() {
		
	}

	
	
	
}

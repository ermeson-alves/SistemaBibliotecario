import java.util.ArrayList;

public class Copia extends Obra{// Existem atributos de uma obra presentes em copia
	private int codigoCopia;
	private boolean alugada=false;
	private Leitor locatario;
	private String prazoDevolucao;
	
	public Copia(String nome, String autor, String editora, ArrayList<Copia> copias, int codigoObra, int codigoCopia,
			boolean alugada, Leitor locatario, String prazoDevolucao) {
		super(nome, autor, editora, copias, codigoObra);
		this.codigoCopia = codigoCopia;
		this.alugada = alugada;
		this.locatario = locatario;
		this.prazoDevolucao = prazoDevolucao;
	}
	
	
	
	
	
	
	
	
	
	
}

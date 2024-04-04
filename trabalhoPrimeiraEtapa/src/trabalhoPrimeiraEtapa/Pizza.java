//pacote
package trabalhoPrimeiraEtapa;
import java.time.LocalDate;
//Importe de data
import java.util.Date;

//Importes enums
import enums.RecheioPizza;
import enums.Borda;
import enums.Molho;
//Downcasting

public class Pizza extends Prato{
//Atributos
	private RecheioPizza recheio;
	private Borda borda;
	private Molho molho;
	
//Constructors
	public Pizza(Double precoVenda, LocalDate dataValidade, Double peso, RecheioPizza recheio, Borda borda, Molho molho) {
		super(precoVenda, dataValidade, peso);
		this.borda = borda;
		this.molho = molho;
		this.recheio = recheio;
	}
	
//Gets e Sets
	public RecheioPizza getRecheio() {
		return recheio;
	}

	public void setRecheio(RecheioPizza recheio) {
		this.recheio = recheio;
	}
	public Borda getBorda() {
		return borda;
	}
	public void setBorda(Borda borda) {
		this.borda = borda;
	}
	public Molho getMolho() {
		return molho;
	}
	public void setMolho(Molho molho) {
		this.molho = molho;
	}
//toString

	@Override
	public String toString() {
		return "Pizza [Recheio:" + recheio + ", Borda:" + borda + ", Molho:" + molho + ", Preço:"
				+ getPrecoVenda() + "]";
	}
	
}

package trabalhoPrimeiraEtapa;

import java.time.LocalDate;
import java.util.Date;
//Importes enums
import enums.Massa;
import enums.Recheio;
import enums.RecheioPizza;
import enums.Tipo;

public class Salgadinho extends Prato{
//Atributos
	private Recheio recheio;
	private Massa massa;
	private Tipo tipo;
//Constructors
	public Salgadinho(Double precoVenda, LocalDate dataValidade, Double peso, Recheio recheio, Massa massa, Tipo tipo) {
		super(precoVenda, dataValidade, peso);
		this.recheio = recheio;
		this.massa = massa;
		this.tipo = tipo;
	}
//Sets e Gets
	public Recheio getRecheio() {
		return recheio;
	}
	public void setRecheio(Recheio recheio) {
		this.recheio = recheio;
	}
	public Massa getMassa() {
		return massa;
	}
	public void setMassa(Massa massa) {
		this.massa = massa;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
//toString
	@Override
	public String toString() {
		return "Salgadinho [Recheio:" + recheio + ", Massa:" + massa + ", Tipo:" + tipo + ", Preço:"
				+ getPrecoVenda() + "]";
	}
	
	
	
}

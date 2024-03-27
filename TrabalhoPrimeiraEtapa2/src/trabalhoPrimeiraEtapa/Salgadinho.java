package trabalhoPrimeiraEtapa;

import java.util.Date;
//Importes enums
import enums.Massa;
import enums.RecheioPizza;
import enums.Tipo;

public class Salgadinho extends Prato{
//Atributos
	private RecheioPizza recheio;
	private Massa massa;
	private Tipo tipo;
//Constructors
	public Salgadinho(Double precoVenda, Date dataValidade, Double peso, RecheioPizza recheio, Massa massa, Tipo tipo) {
		super(precoVenda, dataValidade, peso);
		this.recheio = recheio;
		this.massa = massa;
		this.tipo = tipo;
	}
//Sets e Gets
	public RecheioPizza getRecheio() {
		return recheio;
	}
	public void setRecheio(RecheioPizza recheio) {
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
	
	
	
}

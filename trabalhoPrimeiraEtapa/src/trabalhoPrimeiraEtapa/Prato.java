package trabalhoPrimeiraEtapa;

import java.time.LocalDate;

//Uppercasting
public class Prato {
//Atributos
	
	private Double precoVenda;
	private LocalDate dataValidade;
	private Double peso;
	
//Construtor
	public Prato(Double precoVenda, LocalDate dataValidade, Double peso) {
		this.precoVenda = precoVenda;
		this.dataValidade = dataValidade;
		this.peso = peso;
	}
	
//Gets e Sets
	public void setPrecoVenda(Double precoVenda){
		this.precoVenda = precoVenda;
	}
	public Double getPrecoVenda(){
		return this.precoVenda;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
}

package trabalhoPrimeiraEtapa;

import java.util.Date;
//Upperclasse
public class Prato {
//Atributos
	
	private Double precoVenda;
	private Date dataValidade;
	private Double peso;
	
//Construtor
	public Prato(Double precoVenda, Date dataValidade, Double peso) {
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

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
}

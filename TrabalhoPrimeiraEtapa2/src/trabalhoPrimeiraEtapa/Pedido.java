package trabalhoPrimeiraEtapa;

import java.util.ArrayList;

public class Pedido {
//Atributos
	private String nomeCliente;
	private ArrayList<Prato> prato;
	private Double taxaServico;
	private Double precoFinal;
	
//Constructors
	public Pedido(String nomeCliente, ArrayList<Prato> prato, Double taxaServico, Double precoFinal) {
		this.nomeCliente = nomeCliente;
		this.prato = prato;
		this.taxaServico = taxaServico;
		this.precoFinal = precoFinal;
	}
//Gets e Sets
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public ArrayList<Prato> getPrato() {
		return prato;
	}

	public void setPrato(ArrayList<Prato> prato) {
		this.prato = prato;
	}

	public Double getTaxaServico() {
		return taxaServico;
	}

	public void setTaxaServico(Double taxaServico) {
		this.taxaServico = taxaServico;
	}

	public Double getPrecoFinal() {
		return precoFinal;
	}

	public void setPrecoFinal(Double precoFinal) {
		this.precoFinal = precoFinal;
	}
//Metodos
	
	
}

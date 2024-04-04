package trabalhoPrimeiraEtapa;

import java.util.ArrayList;

public class Pedido {
//Atributos
	private String nomeCliente;
	private ArrayList<Prato> prato;
	private Double taxaServico;
	private Double precoFinal;
	
//Constructors
	public Pedido(String nomeCliente, ArrayList<Prato> prato) {
		this.nomeCliente = nomeCliente;
		this.prato = prato;
		this.taxaServico = 2.00;
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
	public void calcularPreco(ArrayList<Prato> preco) {
		Double aux = 0.00;
		
		for(Prato x: preco) {
			aux += x.getPrecoVenda();
		}
		
		this.precoFinal = aux + this.taxaServico;
	}
	
	public String calcularTroco(Double dinheiro) {
		Double aux = 0.0;
		if(dinheiro<this.precoFinal) {
			return "erro";
		}
		aux = dinheiro - this.precoFinal;
		return " Troco: " + aux;
	}
//Varrer arrayList
	public String varrerArray(ArrayList<Prato>prato) {
		String aux = "";
		for(Prato x: prato) {
			aux += "\n" + x.toString() + "";
		}
		return aux;
		
	}
//Nota fiscal
	public String notaFiscal(ArrayList<Prato>prato) {
		return "\t\t\t\t"+" Nota Fiscal " + this.varrerArray(prato) +"\n"+"Taxa Serviço: " + this.taxaServico + "\nPreço Final: " + this.precoFinal;
	}
	
	
}

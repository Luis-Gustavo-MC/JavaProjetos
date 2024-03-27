package trabalhoPrimeiraEtapa;

import java.util.Date;

import enums.Molho;
import enums.Pao;
import enums.RecheioPizza;

public class Lanches extends Prato{
	//Atributos
		private Pao pao;
		private RecheioPizza recheio;
		private Molho molho;
	//Constructors
		public Lanches(Double precoVenda, Date dataValidade, Double peso, Pao pao, RecheioPizza recheio, Molho molho) {
			super(precoVenda, dataValidade, peso);
			this.pao = pao;
			this.recheio = recheio;
			this.molho = molho;
		}
//Gets e Sets
		public Pao getPao() {
			return pao;
		}
		public void setPao(Pao pao) {
			this.pao = pao;
		}
		public RecheioPizza getRecheio() {
			return recheio;
		}
		public void setRecheio(RecheioPizza recheio) {
			this.recheio = recheio;
		}
		public Molho getMolho() {
			return molho;
		}
		public void setMolho(Molho molho) {
			this.molho = molho;
		}

}

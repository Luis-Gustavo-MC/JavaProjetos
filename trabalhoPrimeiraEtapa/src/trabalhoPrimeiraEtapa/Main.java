
package trabalhoPrimeiraEtapa;
import java.time.LocalDate;
import java.util.ArrayList;

import enums.Borda;
import enums.Massa;
import enums.Molho;
import enums.Pao;
import enums.Recheio;
import enums.RecheioPizza;
import enums.Tipo;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Prato> pratoA = new ArrayList<Prato>();
		ArrayList<Prato> pratoB = new ArrayList<Prato>();
		ArrayList<Prato> pratoC = new ArrayList<Prato>();

		Pizza pizzaA = new Pizza(30.0, LocalDate.of(2024, 4, 18), 500.0, RecheioPizza.calabresa , Borda.cheddar, Molho.picante);
		Pizza pizzaB = new Pizza(30.0, LocalDate.of(2024, 4, 18), 500.0, RecheioPizza.mussarela , Borda.catupiry, Molho.tomate);
		Pizza pizzaC= new Pizza(36.0, LocalDate.of(2024, 4, 18), 600.0, RecheioPizza.chocolate, Borda.chocolate, Molho.morango);
		
		Salgadinho salgadoA = new Salgadinho(6.00, LocalDate.of(2024, 4, 12), 80.0, Recheio.frango , Massa.coxinha, Tipo.assado);
		Salgadinho salgadoB = new Salgadinho(7.00, LocalDate.of(2024, 4, 12), 80.0, Recheio.queijo , Massa.bolinha, Tipo.frito);
		Salgadinho salgadoC = new Salgadinho(7.00, LocalDate.of(2024, 4, 12), 80.0, Recheio.frango , Massa.esfirras, Tipo.frito);
		
		Lanches lancheA = new Lanches(10.0, LocalDate.of(2024, 4, 14), 100.0 , Pao.brioche, RecheioPizza.calabresa, Molho.picante);
		Lanches lancheB = new Lanches(10.0, LocalDate.of(2024, 4, 12), 100.0 , Pao.brioche, RecheioPizza.calabresa, Molho.picante);
		Lanches lancheC = new Lanches(10.0, LocalDate.of(2024, 4, 12), 100.0 , Pao.sal, RecheioPizza.mussarela, Molho.tomate);

		pratoA.add(pizzaA);
		pratoA.add(salgadoA);
		pratoA.add(lancheA);
		Pedido A = new Pedido("Iago", pratoA);
		A.calcularPreco(pratoA);
		System.out.println(A.notaFiscal(pratoA));

		
		pratoB.add(lancheB);
		pratoB.add(pizzaB);
		pratoB.add(salgadoB);
		Pedido B = new Pedido("jao", pratoB);
		B.calcularPreco(pratoB);
		System.out.println(B.notaFiscal(pratoB));
		
		
		pratoC.add(pizzaC);
		pratoC.add(salgadoC);
		pratoC.add(lancheC);
		Pedido C = new Pedido("Marcos", pratoC);
		C.calcularPreco(pratoC);
		System.out.println(C.notaFiscal(pratoC) + C.calcularTroco(60.0));
		
	}

}

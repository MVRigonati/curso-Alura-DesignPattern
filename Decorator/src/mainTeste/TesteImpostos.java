package mainTeste;

import impostos.AbstractImposto;
import impostos.ICMS;
import impostos.ICPP;
import model.Item;
import model.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {

		AbstractImposto imposto1 = new ICPP(new ICMS());
		// O design patter Decorator est� sendo aplicado no construtor das classes ICPP e ICMS.
		// Quando precisamos fazer com que mais de uma regra 
		// seja aplicada para um mesmo c�lculo, podemos passar a pr�xima regra
		// dentro do construtor. Na classe abstrata definimos um m�todo
		// para chamar a pr�xima regra. Pode ser criado dois construtores,
		// um vazio e um com o par�metro para calcular o pr�xiumo, ou ent�o
		// apenas um construtos com par�metro, e na �ltima regra colocamos
		// "null" para finalizar no "catch" do m�todo de executar a pr�xima regra de neg�cio,
		// dessa forma: AbstractImposto imposto2 = new ICPP(new ICMS(null));

		Orcamento orcamento = new Orcamento();
		orcamento.addItem(new Item("Caneta", 200.0));
		orcamento.addItem(new Item("Passagem", 350.0));
		orcamento.addItem(new Item("Barco", 7350.0));

		System.out.println("Imposto 1: " + imposto1.calcula(orcamento));
		
	}

}
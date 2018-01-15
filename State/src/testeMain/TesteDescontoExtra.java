package testeMain;

import model.Item;
import model.Orcamento;

public class TesteDescontoExtra {
	
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento();
		orcamento.addItem(new Item("Item1", 500.0));
		
		orcamento.toAprovado();
		double valorDesconto = orcamento.descontoExtra();
		// O status do orcamento (aprovado, reprovado, etc) ao inv�s de ser apenas uma vari�vel com
		// constantes, virou uma classe, onde � controlado tamb�m o desconto dado de acordo 
		// com o estado. Assim, os metodos do Orcamento apenas repassam para essa classe.
		
		System.out.println(valorDesconto);
		
	}

}
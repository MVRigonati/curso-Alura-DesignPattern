package chainOfResponsibility;

import descontos.AbstractDesconto;
import descontos.DescontoLapisCaneta;
import descontos.DescontoMaisCincoItens;
import descontos.DescontoMaisQuinhentosReais;
import descontos.SemDesconto;
import model.Orcamento;

public class CalculadorDesconto {

	public double calcula(Orcamento orcamento) {
		
		// Nesse caso o c�digo n�o para de crescer, sempre que aparecer um novo desconto
		// precisaremos adicionar mais um if.
		/*
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
			
		} else if (orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.07;
			
		}
		*/
		// Aqui temos uma situa��o onde se uma situa��o n�o for v�lida testamos a pr�xima,
		// esse � o princ�pio do "Chain of Responsibility".
		
		
		// Aqui conseguimos resolver o problema de uma outra forma,
		// agora o c�digo est� muito melhor para manuten��o e entendimento,
		// e caso seja necess�rio acrecentar mais regras, n�o � necess�rio muitas linhas.
		AbstractDesconto desconto1 = new DescontoMaisCincoItens();
		AbstractDesconto desconto2 = new DescontoMaisQuinhentosReais();
		AbstractDesconto desconto3 = new DescontoLapisCaneta();
		AbstractDesconto descontoFinal = new SemDesconto();
		// Toda corrente precisa ter um fim, ou ent�o ir� acabar com um erro de null pointer,
		// a classe "SemDesconto" apenas retorna zero, funcionando como um caso base,
		// fazendo assim a cadeia terminar de forma correta.
		
		desconto1.setProximoDesconto(desconto2);
		desconto2.setProximoDesconto(desconto3);
		desconto3.setProximoDesconto(descontoFinal);
		
		return desconto1.calcula(orcamento);
		// Dessa outra forma temos um esquema em corrente, onde instanciamos os descontos
		// e dizemos qual ser� a ordem.
		
	}
	
}
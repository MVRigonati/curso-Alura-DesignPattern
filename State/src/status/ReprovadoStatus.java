package status;

import model.Orcamento;

public class ReprovadoStatus implements Status {

	@Override
	public double descontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos reprovados n�o recebem desconto extra.");
	}

	@Override
	public Status toAprovado(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos reprovados n�o podem ser aprovados.");
	}

	@Override
	public Status toReprovado(Orcamento orcamento) {
		return this;
	}

	@Override
	public Status toFinalizado(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos reprovados n�o podem ser finalizados.");
	}
	
}

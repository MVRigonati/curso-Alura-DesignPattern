package status;

import model.Orcamento;

public class FinalizadoStatus implements Status {

	@Override
	public double descontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos finalizados n�o recebem desconto extra.");
	}

	@Override
	public Status toAprovado(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos finalizados n�o podem mudar de status.");
	}

	@Override
	public Status toReprovado(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos finalizados n�o podem mudar de status.");
	}

	@Override
	public Status toFinalizado(Orcamento orcamento) {
		return this;
	}

}

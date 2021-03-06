package filtroFraude;

import java.util.Calendar;
import java.util.List;

import model.Conta;
import templateMethod.TemplateFiltroLista;

public class FiltroContaCriadaNesseMÍs extends TemplateFiltroLista {

	public FiltroContaCriadaNesseMÍs() {
		
	}
	
	public FiltroContaCriadaNesseMÍs(Filtro proximo) {
		super(proximo);
	}
	
	@Override
	protected void forEach(Conta conta, List<Conta> contasPossiveis) {
		
		if ( isContaCriadaNesseMÍs(conta) ) {
			contasPossiveis.add(conta);
		}

	}

	private boolean isContaCriadaNesseMÍs(Conta conta) {
		return conta.getDataAbertura().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH);
	}

}

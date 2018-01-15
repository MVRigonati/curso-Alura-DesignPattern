package filtroFraude;

import java.util.Calendar;
import java.util.List;

import model.Conta;
import templateMethod.TemplateFiltroLista;

public class FiltroContaCriadaNesseM�s extends TemplateFiltroLista {

	public FiltroContaCriadaNesseM�s() {
		
	}
	
	public FiltroContaCriadaNesseM�s(Filtro proximo) {
		super(proximo);
	}
	
	@Override
	protected void forEach(Conta conta, List<Conta> contasPossiveis) {
		
		if ( isContaCriadaNesseM�s(conta) ) {
			contasPossiveis.add(conta);
		}

	}

	private boolean isContaCriadaNesseM�s(Conta conta) {
		return conta.getDataAbertura().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH);
	}

}

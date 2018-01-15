package chainOfResponsibility;

import model.Conta;
import model.Formato;
import resposta.DefaultResponse;
import resposta.AbstractResponse;
import resposta.ResponseCSV;
import resposta.ResponsePorcentagem;
import resposta.ResponseXML;

public class AdministraRespostas {

	public String responde(Conta conta, Formato format) {
		
		AbstractResponse respostaFinal = new DefaultResponse();
		AbstractResponse resposta3 = new ResponsePorcentagem(respostaFinal);
		AbstractResponse resposta2 = new ResponseCSV(resposta3);
		AbstractResponse resposta1 = new ResponseXML(resposta2);

		// Nesse caso n�o precisria de uma resposta final, pois todas as respostas
		// poss�veis devem estar na classe enum, por�m eu adicionei mesmo assim
		
		return resposta1.responde(format, conta);
		
	}
	
}
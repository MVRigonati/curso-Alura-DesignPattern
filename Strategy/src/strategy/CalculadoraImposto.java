package strategy;

import impostos.InterfaceImposto;
import model.Orcamento;

public class CalculadoraImposto {

	// Dessa forma a classe nunca ir� parar de crescer, pois a cada novo imposto
	// um novo "if" precisa ser colocado, e uma nova l�gica precisa ser feita em outros lugares.
	// O mesmo vale para o caso de dividirmos os impostos em metodos diferentes
	/*
	public void realizaCalculo(Orcamento orcamento, String imposto) {

		if ("ICMS".equals(imposto)) {

			double icms = new ICMS().calculaICMS(orcamento);
			System.out.println(icms); // imprimir� 50.0

		} else if ("ISS".equals(imposto)) {

			double iss = new ISS().calculaISS(orcamento);
			System.out.println(iss); // imprimir� 30.0

		}
	}
	*/
	
	// Podemos perceber que todos os impostos tem caracter�sticas em comum,
	// ent�o podemos usar isso a nosso favor, se todos eles implementarem
	// uma interface, ent�o iremos chamar apenas um m�todo, independente do imposto
	
	public void realizaCalculo(Orcamento orcamento, InterfaceImposto imposto) {
		imposto.calcula(orcamento);
	}
	
	// Dessa forma, al�m de eliminar o problema de o c�digo crescer infinitamente,
	// tamb�m garantimos uma boa manuten��o e f�cil entendimento, pois
	// caso um novo imposto venha a aparecer, ser� criada uma nova classe para ele
	// com o requisito de que precisa implementar a interface.
	// Criamos ent�o um padr�o.
	
	// No momento esta classe tornou-se in�til pois executa apenas uma liha de c�digo,
	// poder�amos remover ela, mas poder�a ser bastante �til caso fosse necess�rio 
	// colocar mais alguma regra ou l�gica relacionada a c�lculo de imposto.  

}

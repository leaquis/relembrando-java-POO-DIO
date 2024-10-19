package lanchonete.atendimento.cozinha;

public class Almoxarife {
	private void controlarAEntrada() {
		System.out.println("CONTROLANDO A ENTRADA");
	}
	
	private void controlarASaida() {
		System.out.println("CONTROLANDO A SAIDA");
	}
	
	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES");
		controlarAEntrada();
		controlarASaida();
	}
	
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GAS");
	}
}

package lanchonete.atendimento;

public class Atendente {
	
	public void servindoMesa() {
		pegarLancheNaCozinha();
		System.out.println("SERVINDO A MESA");
	}
	
	private void pegarLancheNaCozinha() {
		System.out.println("PEGANDO LANCHE NA COZINHA");
	}
	
	public void receberPagamento() {
		System.out.println("RECEBENDO PAGAMENTO");
	}
	
	private void pegarPedidoNoBalcao() {
		System.out.println("PEGANDO O PEDIDO NO BALCÃO");
	}
}

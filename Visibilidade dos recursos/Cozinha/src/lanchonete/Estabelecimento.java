package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		cozinheiro.selecionaIngredientesSuco();
		cozinheiro.lavarIngredientes();
		cozinheiro.selecionaIngredientesSuco();
		cozinheiro.baterSucoNoLiquidificador();
		cozinheiro.selecionaIngredientesLanche();
		cozinheiro.fritandoOsIngredientesDoLanche();
		cozinheiro.prepararCombo();
		cozinheiro.adicinarComboNoBalcao();	
		
		Almoxarife almoxarife = new Almoxarife();
		almoxarife.controlarAEntrada();
		almoxarife.controlarASaida();
		almoxarife.entregarIngredientes();
		almoxarife.trocarGas();
		
		Atendente atendente = new Atendente();
		atendente.pegarLancheNaCozinha();
		atendente.receberPagamento();
		atendente.servindoMesa();
		atendente.trocarGas();
		
		Cliente cliente = new Cliente();
		cliente.escolheLanche();
		cliente.fazerPedido();
		cliente.pegarPedidoNoBalcao();
		cliente.consultarSaldo();
		cliente.pagarConta();
		
		
		cozinheiro.pedirParaTrocarOGas(almoxarife);
		cozinheiro.pedirParaTrocarOGas(atendente);
	}
}

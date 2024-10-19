package lanchonete.atendimento.cozinha;

public class Cozinheiro {
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONADO LANCHE NO BALCÃO");
	}
	
	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONADO SUCO NO BALCÃO");
	}
	
	public void adicinarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	
	private void prepararLanche() {
		System.out.println("PREPARANDO LANCHE");
	}
	
	private void prepararSuco() {
		System.out.println("PREPARANDO SUCO");
	}
	
	private void prepararCombo() {
		prepararLanche();
		prepararSuco();
	}
	
	private void selecionaIngredientesLanche() {
		System.out.println("SELECIONADO PÃO, ALFACE, QUEIJO E HAMBURGUER");
	}
	
	private void selecionaIngredientesSuco() {
		System.out.println("SELECIONADO FRUTA, AGUA E AÇUCAR");
	}
	
	private void lavarIngredientes() {
		System.out.println("INGREDIENTES LAVADOS");
	}
	
	private void baterSucoNoLiquidificador() {
		System.out.println("BATENDO SUCO NO LIQUIDIFICADOR");
	}
	
	private void fritandoOsIngredientesDoLanche() {
		System.out.println("FRITANDO O HAMBURGUER");
	}
	
	private void pedirParaTrocarOGas(Almoxarife almoxarife) {
		almoxarife.trocarGas();
	}
	
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}

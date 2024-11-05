package exemplosPilaresDePOO;

public class Moto extends Veiculo {
	private String chassi;
	public String getChassi() {
		return chassi;
	}
	
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	@Override
	public void ligar() {
		System.out.println("Moto ligada");
		
	}
}

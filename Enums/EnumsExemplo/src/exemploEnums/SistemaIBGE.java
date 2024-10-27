package exemploEnums;

public class SistemaIBGE {
	public static void main (String[] args) {
		for(EstadosBrasileiros e: EstadosBrasileiros.values()) {
			System.out.println(e.getSigla() + " - " + e.getNomeMaiusculo() + " - " + e.getIBGE());
		}
		
		EstadosBrasileiros eb = EstadosBrasileiros.CEARA;
		
		System.out.println(eb.getNome());
		System.out.println(eb.getNomeMaiusculo());
		System.out.println(eb.getSigla());
		System.out.println(eb.getIBGE());
	}
}

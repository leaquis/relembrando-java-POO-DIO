package exemploEnums;

public enum EstadosBrasileiros {
	SAO_PAULO("SP", "São Paulo", 1),
	RIO_DE_JANEIRO("RJ", "Rio de Janeiro", 2),
	PIAUI("PI", "Piauí", 3),
	MARANHAO("MA", "Maranhão", 4),
	CEARA("CE", "Ceará", 5)
	;
	
	private String nome;
	private String sigla;
	private int IBGE;
	
	private EstadosBrasileiros(String sigla, String nome, int IBGE) {
		this.sigla = sigla;
		this.nome = nome;
		this.IBGE = IBGE;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
	public int getIBGE() {
		return IBGE;
	}
}

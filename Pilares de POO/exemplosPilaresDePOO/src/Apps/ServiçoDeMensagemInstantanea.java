package Apps;

public abstract class ServiçoDeMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	protected void validarConectadoInternet() {
		System.out.println("Validando se esta conectado a internet");
	}
	
	protected void salvarHistoricoMensagem() {
		System.out.println("Salvando historico de mensagens");
	}
	
}

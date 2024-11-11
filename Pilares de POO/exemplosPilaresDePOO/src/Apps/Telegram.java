package Apps;

public class Telegram extends ServiçoDeMensagemInstantanea{
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}

}

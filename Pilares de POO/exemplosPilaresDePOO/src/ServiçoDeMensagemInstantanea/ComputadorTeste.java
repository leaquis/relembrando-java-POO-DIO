package ServiçoDeMensagemInstantanea;

public class ComputadorTeste {
	public static void main (String[] args) {
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		FacebookMessenger facebook = new FacebookMessenger();
		facebook.enviarMensagem();
		facebook.receberMensagem();
		
		Telegram telegram = new Telegram();
		telegram.enviarMensagem();
		telegram.receberMensagem();
	}
}

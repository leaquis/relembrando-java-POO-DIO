package ServiçoDeMensagemInstantanea;

import Apps.FacebookMessenger;
import Apps.MSNMessenger;
import Apps.ServiçoDeMensagemInstantanea;
import Apps.Telegram;

public class ComputadorTeste {
	public static void main (String[] args) {
		ServiçoDeMensagemInstantanea smi = null;
		
		String appEscolhido = "msn";
		
		if(appEscolhido.equals("msn")) {
			smi = new MSNMessenger();
		} else if(appEscolhido.equals("facebook")) {
			smi = new FacebookMessenger();
		} else if(appEscolhido.equals("telegram")) {
			smi = new Telegram();
		}
		
		smi.enviarMensagem();
		smi.receberMensagem();
	
	}
}

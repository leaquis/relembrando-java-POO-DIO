package Iphone;

import Iphone.Interface.*;

public class Iphone {

	public static void main(String[] args) {
		Interface Interface = new Interface();
		
		Interface.selecionarMusica();
		Interface.tocar();
		Interface.pausar();
		Interface.atender();
		Interface.iniciarCorreioDeVoz();
		Interface.ligar();
		Interface.adicionarNovaAba();
		Interface.atualizarPagina();
		Interface.exibirPagina();
		
	}
}

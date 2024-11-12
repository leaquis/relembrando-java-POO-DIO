package Iphone.Interface;

import Iphone.AparelhoTelefonico.*;
import Iphone.NavegadorInternet.*;
import Iphone.ReprodutorMusical.*;

public class Interface implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	@Override
	public void pausar() {
		System.out.println("Pausar Musica");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionar Musica");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocar Musica");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionar nova aba");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizar pagina");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibir pagina");
		
	}

	@Override
	public void atender() {
		System.out.println("Atender telefonema");
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciar correio de voz");
		
	}

	@Override
	public void ligar() {
		System.out.println("Fazer uma ligação");
		
	}
	
}

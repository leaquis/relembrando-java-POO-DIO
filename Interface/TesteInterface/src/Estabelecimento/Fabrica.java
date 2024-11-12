package Estabelecimento;

import Equipamentos.impressora.Deskjet;
import Equipamentos.impressora.Impressora;
import Equipamentos.digitalizadora.Scanner;
import Equipamentos.digitalizadora.Digitalizadora;
import Equipamentos.copiadora.Xerox;
import Equipamentos.copiadora.Copiadora;
import Equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		Deskjet deskjet = new Deskjet();
		Scanner scanner = new Scanner();
		Xerox xerox = new Xerox();
		
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
}

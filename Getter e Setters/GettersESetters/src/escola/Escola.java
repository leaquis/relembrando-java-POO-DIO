package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe");
		felipe.setIdade(15);
		felipe.setSexo("Masculino");
		
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos de idade!");
	}
}

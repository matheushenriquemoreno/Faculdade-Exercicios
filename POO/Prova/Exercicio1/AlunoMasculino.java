package Exercicio1;

public class AlunoMasculino extends Aluno {

	private String identidadeMilitar;

	public AlunoMasculino(int codigo, int idade, String nome, String CPF, String endereco,boolean sexo, Notas notas,
			String identidadeMilitar) {
		super(codigo, idade, nome, CPF, endereco, sexo, notas);
		this.identidadeMilitar = identidadeMilitar;
	}

	public String getIdentidadeMilitar() {
		return identidadeMilitar;
	}

	public void setIdentidadeMilitar(String identidadeMilitar) {
		this.identidadeMilitar = identidadeMilitar;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " identidade Militar = " + identidadeMilitar;
	}
}
package Exercicio1;

public class Aluno {

	protected int codigo;
	protected int idade;
	protected String nome;
	protected String CPF;
	protected String Endereco;
	protected boolean sexo;
	protected Notas notas;
	
	public Aluno(int codigo, int idade, String nome, String CPF, String endereco, boolean sexo, Notas notas) {
		this.codigo = codigo;
		this.idade = idade;
		this.nome = nome;
		this.CPF = CPF;
		this.Endereco = endereco;
		this.sexo = sexo;
		this.notas = notas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	
	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public Notas getNotas() {
		return notas;
	}

	public void setNotas(Notas notas) {
		this.notas = notas;
	}
	
	public String getSituacao() {
		return notas.getMedia() >= 6 ? "Aprovado" : "Reprovado";
	}

	@Override
	public String toString() {
		return "\ncodigo = " + codigo + ", idade = " + idade + ", nome = " + nome + ", CPF = " + CPF + ", Endereco = "
				+ Endereco + ", sexo = " + sexo + "\n"+ notas;
	}
	
	
	
}
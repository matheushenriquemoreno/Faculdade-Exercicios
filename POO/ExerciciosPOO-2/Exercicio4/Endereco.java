package Exercicio4;

public class Endereco {
	
	public String nomeRua;
	
	public int numeroRua;
	
	public String cidade;
	
	public String cep;
	
	public String bairro;

	public Endereco(String nomeRua, int numeroRua, String cidade) {
		this.nomeRua = nomeRua;
		this.numeroRua = numeroRua;
		this.cidade = cidade;
	}

	public Endereco(String nomeRua, int numeroRua, String cidade, String cep, String bairro) {
		this(nomeRua, numeroRua, cidade);
		this.cep = cep;
		this.bairro = bairro;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public int getNumeroRua() {
		return numeroRua;
	}

	public void setNumeroRua(int numeroRua) {
		this.numeroRua = numeroRua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	@Override
	public String toString() {
		return "Rua: " +  this.nomeRua + " Numero da Rua: " + this.numeroRua +
			" \nCidade: " + this.cidade +
			" \nCEP : " + this.cep +
			" \nBairro: " + this.bairro;
	}
}
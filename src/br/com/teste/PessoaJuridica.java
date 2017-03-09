package br.com.teste;

public class PessoaJuridica implements IPessoa {
	
	private int cnpj;

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public int getCnpj() {
		return cnpj;
	}

}

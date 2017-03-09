package br.com.teste;

public class PessoaJuridica implements IPessoa {
	
	private int cnpj;

	@Override
	public int setCpf(int cpf) {
		return this.cnpj = cpf;
	}

	public int getCnpj() {
		return cnpj;
	}

}

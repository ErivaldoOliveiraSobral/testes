package br.com.teste.testes;

import br.com.teste.PessoaFisica;
import br.com.teste.PessoaJuridica;

public class TestePessoa {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		pf.setNome("Eriavaldo");
		pf.setTelefone("984800859");
		pf.setCpf("365652898-59");
		
		pj.setNome("Niazi");
		pj.setTelefone("666");
		pj.setCnpj("666");
		
		pj.mostrar();
		pf.mostrar();

	}

}

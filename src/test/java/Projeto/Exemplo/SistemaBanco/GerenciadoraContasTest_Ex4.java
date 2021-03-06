package Projeto.Exemplo.SistemaBanco;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Test;

public class GerenciadoraContasTest_Ex4 {

	private GerenciadoraContas gerContas;
	

	@Test
	public void testTransfereValor() {

		/* ========== Montagem do cenário ========== */
		
		// criando alguns clientes
		ContaCorrente conta01 = new ContaCorrente(1, 200, true);
		ContaCorrente conta02 = new ContaCorrente(2, 0, true);
		
		// inserindo os clientes criados na lista de clientes do banco
		ArrayList<ContaCorrente> contasDoBanco = new ArrayList<ContaCorrente>();
		contasDoBanco.add(conta01);
		contasDoBanco.add(conta02);
		
		gerContas = new GerenciadoraContas(contasDoBanco);

		/* ========== Execução ========== */
		boolean sucesso = gerContas.transfereValor(1, 100, 2);
		
		/* ========== Verificações ========== */
		assertTrue(sucesso);
		assertThat(conta02.getSaldo(), is(100.0));
	}

}


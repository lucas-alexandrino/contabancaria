package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;
import conta.util.Cores;

public class ContaController implements ContaRepository {

	private ArrayList<Conta> listaContas = new ArrayList<Conta>();

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);
		{
			if (conta != null) {
				conta.visualizar();
			} else {
				System.out.println("\n A conta número: " + numero + " não foi encontrada!");
			}
		}

	}

	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}

	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("\n A conta número: " + conta.getNumero() + "Foi criada com sucesso!");

	}

	@Override
	public void atualizar(Conta conta) {
		var buscaConta = buscarNaCollection(conta.getNumero());

		if (buscaConta != null) {
			listaContas.set(listaContas.indexOf(buscaConta), conta);
			System.out.println("\n A conta número: " + conta.getNumero() + " foi atualizada com sucesso!");
		} else {
			System.out.println("\n A conta número: " + conta.getNumero() + " não foi encontrada!");
		}
	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);

		if (conta != null) {
			listaContas.remove(numero);
			System.out.println("\n A conta número: " + numero + " foi encontrada!");
		} else {
			System.out.println("\n A conta número: " + numero + " não foi encontrada!");
		}
	}

	@Override
	public void sacar(int numero, float valor) {
		var buscaConta = buscarNaCollection(numero);

		if (buscaConta != null) {
			if (listaContas.get(listaContas.indexOf(buscaConta)).sacar(valor) == true)
				;
			System.out.println("\n O Saque na conta número: " + numero + " foi efetuado com sucesso!");
		} else {
			System.out.println("\n A conta número: " + numero + " não foi encontrada!");
		}

	}

	@Override
	public void depositar(int numero, float valor) {
		var buscaConta = buscarNaCollection(numero);

		if (buscaConta != null) {
			var indiceConta = listaContas.indexOf(buscaConta);
			listaContas.get(indiceConta).depositar(valor);
			System.out.println("\n O Depósito na conta número: " + numero + "foi efetuado com sucesso!");
		} else {
			System.out.println("\n A conta número: " + numero + " não foi encontrada!");
		}

	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		var buscaContaOrigem = buscarNaCollection(numeroOrigem);
		var buscaContaDestino = buscarNaCollection(numeroDestino);

		if (buscaContaOrigem != null && buscaContaDestino != null) {
			if (listaContas.get(listaContas.indexOf(buscaContaOrigem)).sacar(valor) == true) {
				listaContas.get(listaContas.indexOf(buscaContaDestino)).depositar(valor);
				System.out.println(Cores.ANSI_YELLOW_BACKGROUND +Cores.TEXT_GREEN_BOLD+ "\n A transferência foi efetuada com sucesso!");
			} else {

				System.out.println("\n A conta de Origem e/ou a conta de Destino não foram encontradas!");
			}

		}

	}

	public int gerarNumero() {
		return listaContas.size() + 1;
	}

	public Conta buscarNaCollection(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta;
			}
		}
		return null;
	}

	public int retornaTipo(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta.getTipo();
			}
		}
		return 0;
	}

}

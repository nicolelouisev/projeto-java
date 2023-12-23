package loja.controller;

import java.util.ArrayList;

import loja.model.Compra;
import loja.model.Produto;
import loja.repository.LojaRepository;

public class LojaController implements LojaRepository {
	
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;

	@Override
	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.exibirDetalhes();
		}
		
	}

	@Override
	public void procurarPorNumero(int numero) {
		var produto = buscarNaCollection(numero);
		if(produto != null) {
			produto.exibirDetalhes();
		} else {
			System.out.println("\nO produto número: " + numero + " não foi encontrado!");
		}
		
	}

	@Override
	public void adicionar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO produo número: " + produto.getNumero() + " foi adicionado com sucesso!");
		
	}

	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getNumero());
		
		if(buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nO produto número: " + produto.getNumero() + " foi atualizado com sucesso!");
		} else {
			System.out.println("\nO produto número: " + produto.getNumero() + "não foi encontrado!");
		}
		
	}

	@Override
	public void apagar(int numero) {
		var produto = buscarNaCollection(numero);
		if(produto != null) {
			if (listaProdutos.remove(produto) == true)
				System.out.println("\nO produto número: " + numero + " foi excluído com sucesso!");
		} else
			System.out.println("\nO produto número: " + numero + "não foi encontrado!");
		
	}

	
	@Override
	public void criarCompra(Compra compra, int numero) {
        var produto = buscarNaCollection(numero);

        if (produto != null) {
            compra.getProdutos().add(produto);
            compra.setTotal(compra.getTotal() + produto.getPreco());
            System.out.println("Produto adicionado à compra!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

	
	public int gerarNumero() {
		return ++ numero;
	}
	
	public Produto buscarNaCollection (int numero) {
		for (var produto : listaProdutos) {
			if (produto.getNumero() == numero) {
				return produto;
			}
		}
		return null;
	}


}

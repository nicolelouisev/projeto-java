package loja.model;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	private int numeroCompra;
    private String cliente;
    private List<Produto> produtos;
    private double total;
    private static int numeroCompraAtual = 1;
    
    public Compra(String cliente) {
        this.numeroCompra = gerarNumero();
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.total = 0.0;
    }

	public int getNumeroCompra() {
		return numeroCompra;
	}

	public void setNumeroCompra(int numeroCompra) {
		this.numeroCompra = numeroCompra;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public void exibirDetalhes() {
		System.out.println("\n\n***********************************************************");
		System.out.println("Detalhes da Compra:");
		System.out.println("***********************************************************");
        System.out.println("Número da Compra: " + numeroCompra);
        System.out.println("Cliente: " + cliente);
        System.out.println("Produtos:");

        for (Produto produto : produtos) {
            System.out.println("- " + produto.getNome() + " (Preço: R$ " + produto.getPreco() + ")");
        }

        System.out.println("Total: R$ " + total);
    }
	
    private int gerarNumero() {
        return numeroCompraAtual++;
    }
    
    
}

package loja.model;

public class ProdutoEletronico extends Produto {
	
	private String marca;

	public ProdutoEletronico(int numero, String nome, double preco, String marca) {
		super(numero, nome, preco);
		this.marca = marca;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("***********************************************************");
		System.out.println("Número: " + getNumero());
		System.out.println("Nome: " + getNome());
		System.out.println("Preço: " + getPreco());
		System.out.println("Marca: " + this.marca);
	}
	
    public String getMarca() {
        return marca;
    }

}

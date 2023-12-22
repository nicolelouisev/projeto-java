package loja;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import loja.controller.LojaController;
import loja.model.ProdutoEletronico;

public class Menu {

	public static void main(String[] args) throws Exception {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao, numero;
		String nome, marca;
		double preco;
		
		LojaController produtos = new LojaController();
		
		// TESTE PRODUTO
		ProdutoEletronico p1 = new ProdutoEletronico(produtos.gerarNumero(), "Headfone JXL", 89.90, "JXL");
		produtos.adicionar(p1);
		
		ProdutoEletronico p2 = new ProdutoEletronico(produtos.gerarNumero(), "Mouse Gamer", 59.65, "Logi Tech");
		produtos.adicionar(p2);
		
		ProdutoEletronico p3 = new ProdutoEletronico(produtos.gerarNumero(), "Teclado Koll", 110.99, "Koll Tecs");
		produtos.adicionar(p3);
		
		produtos.listarTodos();


		while (true) {
			System.out.println("                                               ");
			System.out.println("                LOJA LOGI TECH                 ");
			System.out.println("                                               ");
			System.out.println("***********************************************");
			System.out.println("                                               ");
			System.out.println("         1 - Comprar                           ");
			System.out.println("         2 - Listar todos os produtos          ");
			System.out.println("         3 - Buscar produtos por número        ");
			System.out.println("         4 - Adicionar produto                 ");
			System.out.println("         5 - Atualizar produto                 ");
			System.out.println("         6 - Apagar produto                    ");
			System.out.println("         7 - Sair                              ");
			System.out.println("                                               ");
			System.out.println("***********************************************");
			System.out.println("Entre com a opção desejada:                    ");
			System.out.println("                                               ");
			
		 try {
				opcao = leia.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}
						
			if(opcao == 7) {
				System.out.println("\nLoja LOGI TECH - Os seus melhores periféricos aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
				case 1:
					System.out.println("Comprar\n\n");
					
					keyPress();
					break;
				case 2:
					System.out.println("Listas todos os produtos\n\n");
					produtos.listarTodos();

					keyPress();
					break;
				case 3:
					System.out.println("Consultar produtos por número\n\n");
					System.out.println("Digite o número do produto: ");
					numero = leia.nextInt();
					
					produtos.procurarPorNumero(numero);
					
					keyPress();
					break;
				case 4:
					System.out.println("Adicionar produto\n\n");
					System.out.println("Digite o nome do produto: ");
					leia.skip("\\R?");
					nome = leia.nextLine();
					
					System.out.println("Digite o preço do produto (R$): ");
					preco = leia.nextDouble();
					
					System.out.println("Digite o nome da marca: ");
					leia.skip("\\R?");
					marca = leia.nextLine();
					
					produtos.adicionar(new ProdutoEletronico(produtos.gerarNumero(), nome, preco, marca));
			
					
					keyPress();
					break;
				case 5:
					System.out.println("Atualizar produto\n\n");
					System.out.println("Digite o número do produto: ");
					numero = leia.nextInt();
					
					var buscaProduto = produtos.buscarNaCollection(numero);
					
					if(buscaProduto != null) {
						System.out.println("Digite o nome do produto: ");
						leia.skip("\\R?");
						nome = leia.nextLine();
						
						System.out.println("Digite o preço do produto (R$): ");
						preco = leia.nextDouble();
						
						System.out.println("Digite o nome da marca: ");
						leia.skip("\\R?");
						marca = leia.nextLine();
						
						produtos.atualizar(new ProdutoEletronico(numero, nome, preco, marca));
					} else {
						System.out.println("O produto não foi encontrado!");
					}
					
					keyPress();
					break;
				case 6:
					System.out.println("Apagar produto\n\n");
					System.out.println("Digite o número do produto: ");
					numero = leia.nextInt();
					
					produtos.apagar(numero);
					
					keyPress();
					break;
				default:
					System.out.println("Opção inválida\n");
					
					keyPress();
					break;
			}
		}
}
	
	public static void sobre() {
		System.out.println("\n***********************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Nicole Valeta - nicolelouisev@gmail.com");
		System.out.println("github.com/nicolelouisev");
		System.out.println("***********************************************");
	}
	
	public static void  keyPress() {
		
		try {
				System.out.println("\n\nPressione Enter para continuar...");
				System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
}


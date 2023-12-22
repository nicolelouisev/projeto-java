package loja;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) throws Exception {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;

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
				System.out.println("\nDigeite valores inteiros!");
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

					keyPress();
					break;
				case 3:
					System.out.println("Consultar produtos por número\n\n");
					
					keyPress();
					break;
				case 4:
					System.out.println("Adicionar produto\n\n");
					
					
					keyPress();
					break;
				case 5:
					System.out.println("Atualizar produto\n\n");
					
					keyPress();
					break;
				case 6:
					System.out.println("Apagar produto\n\n");
					
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


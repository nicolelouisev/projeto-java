package loja.repository;

import loja.model.Compra;
import loja.model.Produto;

public interface LojaRepository {
	
	//CRUD PRODUTO	
    public void listarTodos();
    public void procurarPorNumero(int numero);
    public void adicionar(Produto produto);
    public void atualizar(Produto produto);
    public void apagar(int numero);
    
    // CRUD COMPRA
    public void listarTodas();
    public void buscarPorNumero(int numero);
    public void adicionar(Compra compra);
    public void atualizar(Compra compra);

}

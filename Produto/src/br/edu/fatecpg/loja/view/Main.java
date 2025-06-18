package br.edu.fatecpg.loja.view;
import br.edu.fatecpg.loja.model.*;
import br.edu.fatecpg.loja.model.Loja;
public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto("001","camiseta",10,29.99);
		Produto p2 = new Produto("002", "calça",5,59.90);
		
		Loja loja = new Loja();
		loja.adicionarProdutos(p1);
		loja.adicionarProdutos(p2);
		
		loja.exibirProdutos();
		System.out.println("Valor total do estoque: R$"+ loja.calcularTotalEstoque());
		
		p1.atualizarQuantidade(15);
		System.out.println("\nApós atualizar quantidade  de 'camiseta': ");
		p1.exibirInformacoes();
		

	}

}

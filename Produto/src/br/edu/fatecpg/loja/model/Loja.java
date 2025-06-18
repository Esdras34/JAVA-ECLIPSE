package br.edu.fatecpg.loja.model;
import java.util.List;
import java.util.ArrayList;

public class Loja {
	private List<Produto> produtos = new ArrayList<>();
	
	public void adicionarProdutos(Produto produto) {
		produtos.add(produto);
	}
	public void removerProdutos(String cdProduto) {
		produtos.removeIf(p->p.getCdproduto().equals(cdProduto));
	}
	public Produto buscarProdutos(String cdProduto) {
		for(Produto p : produtos)
			if(p.getCdproduto().equals(cdProduto)) return p;
		return null;
	}
	public void exibirProdutos() {
		for(Produto p : produtos) {
			p.exibirInformacoes();
			System.out.println("-------");
			}
		}
	public double calcularTotalEstoque() {
		
		double total =0;
		for(Produto p : produtos) {
			total+= p.calcularValorEstoque();
		}
		return total;
		
	
	}
}

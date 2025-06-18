package br.edu.fatecpg.loja.model;

public class Produto {
	
	private String cdproduto;
	private String nmproduto;
	private int qtdEstoque;
	private double precoProduto;
	
	
	public Produto(String cdproduto, String nmproduto, int qtdEstoque, double precoProduto) {
		super();
		this.cdproduto = cdproduto;
		this.nmproduto = nmproduto;
		this.qtdEstoque = qtdEstoque;
		this.precoProduto = precoProduto;
	}
	public void atualizarQuantidade(int novaQuantidade ) {
		this.qtdEstoque = novaQuantidade;
	}
	public double calcularValorEstoque() {
		  return qtdEstoque * precoProduto;
	}
	public void exibirInformacoes() {
		 System.out.println("Código: "+cdproduto);
		 System.out.println("Nome: "+nmproduto);
		 System.out.println("Quantidade em Estoque: "+qtdEstoque);
		 System.out.println("Preço do produto: R$"+precoProduto);
		 System.out.println("Valor total em estoque : R$ "+calcularValorEstoque());
	}
	public String getCdproduto() {
		return cdproduto;
	}
	public void setCdproduto(String cdproduto) {
		this.cdproduto = cdproduto;
	}
	public String getNmproduto() {
		return nmproduto;
	}
	public void setNmproduto(String nmproduto) {
		this.nmproduto = nmproduto;
	}
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	public double getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}
	
	
	

}

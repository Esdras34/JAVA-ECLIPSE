package br.edu.fatecpg.loja.controller;
import br.edu.fatecpg.loja.model.*;
import br.edu.fatecpg.loja.model.Produto;

public class LojaController {

	private Loja loja;

    public LojaController() {
        this.loja = new Loja();
    }

    public void adicionarProduto(Produto p) {
        loja.adicionarProdutos(p);
    }

    public void removerProduto(String codigo) {
        loja.removerProdutos(codigo);
    }

    public Produto buscarProduto(String codigo) {
        return loja.buscarProdutos(codigo);
    }

    public void listarProdutos() {
        loja.exibirProdutos();
    }

    public double calcularValorTotalEstoque() {
        return loja.calcularTotalEstoque();
    }

    public void atualizarEstoqueProduto(String codigo, int novaQuantidade) {
        Produto produto = loja.buscarProdutos(codigo);
        if (produto != null) {
            produto.atualizarQuantidade(novaQuantidade);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}


package br.edu.insper.desagil.vaimalte;

public class Pedido 
{
	private Produto produto;
	private int quantidade;
	
	public Pedido(Produto produto) {
		this.produto = produto;
		this.quantidade = 1;
	}

	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public void incrementaUm() {
		this.quantidade ++;
	}
	public double calculaPedido() {
		double pedido = this.produto.getPreco() * this.quantidade;
		return pedido;
	}
}

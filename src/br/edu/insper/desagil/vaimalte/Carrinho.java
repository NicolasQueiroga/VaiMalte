package br.edu.insper.desagil.vaimalte;

import java.util.*;

public class Carrinho 
{
	
	private List<Pedido> carrinho;

	public Carrinho() 
	{
		super();
		this.carrinho = new ArrayList<>();
	}

	public List<Pedido> getPedidos() 
	{
		return this.carrinho;
	}
	
	public void atualizaCarrinho(Produto produto)
	{
		for (Pedido pedidos : carrinho)
		{
			if (pedidos.getProduto().getCodigo() == produto.getCodigo())
			{
				pedidos.incrementaUm();
				return ;
			}
		}
		Pedido newPedido = new Pedido(produto);
		carrinho.add(newPedido);
	}
	
}

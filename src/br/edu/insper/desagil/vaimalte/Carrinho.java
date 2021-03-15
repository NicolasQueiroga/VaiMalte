package br.edu.insper.desagil.vaimalte;

import java.util.*;

public class Carrinho 
{
	private List<Pedido> pedidos;

	public Carrinho() 
	{
		super();
		this.pedidos = new ArrayList<>();
	}

	public List<Pedido> getPedidos() 
	{
		return pedidos;
	}
	
	public void atualizaCarrinho(Produto produto)
	{
		if (pedidos.contains(produto))
		{
			produto.incrementaUm();
		}
		else
		{
			Pedido newPedido = new Pedido(produto);
			pedidos.add(newPedido);
		}
	}
	
}

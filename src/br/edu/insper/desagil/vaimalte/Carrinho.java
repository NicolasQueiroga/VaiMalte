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
		boolean existe = false;
		for (Pedido item : carrinho)
		{
			if (item.getProduto().getCodigo() == produto.getCodigo())
			{
				item.incrementaUm();
				existe = true;
				break;
			}
		}
		if (!existe)
		{
			Pedido newPedido = new Pedido(produto);
			carrinho.add(newPedido);
		}
		
	
	}
	
}

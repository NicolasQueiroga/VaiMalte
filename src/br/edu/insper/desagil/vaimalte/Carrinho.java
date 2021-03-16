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
		return this.pedidos;
	}
	
	public void atualizaCarrinho(Produto produto)
	{
		Pedido existente = pedidos.stream().filter((p) -> p.getProduto().getCodigo() == produto.getCodigo()).findFirst().orElse(null);
		if (existente != null)
		{
			existente.incrementaUm();
		}
		else
		{
			Pedido newPedido = new Pedido(produto);
			pedidos.add(newPedido);
		}
	}
	
}

package br.edu.insper.desagil.vaimalte;

import java.util.*;

public class Caixa 
{
	
	private Map<Integer, Integer> descontos;

	public Caixa() 
	{
		super();
		this.descontos = new HashMap<>();
	}
	
	public void adicionaDisconto(Produto produto, int desconto) 
	{
		if ((desconto >= 1) && (desconto <= 99))
		{
			descontos.put(produto.getCodigo(), desconto);
		}
	}
	
	public double calculaTotal(Carrinho carrinho)
	{
		double total = 0;
		for (Pedido item : carrinho.getPedidos())
		{
			total += item.calculaPedido();
		}
		return total;
	}
	
}

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
			this.descontos.put(produto.getCodigo(), desconto);
		}
	}
	
	public double calculaTotal(Carrinho carrinho)
	{
		double total = 0;
		int codigo;
		double desconto;
		for (Pedido item : carrinho.getPedidos())
		{
			codigo = item.getProduto().getCodigo();
			if (descontos.containsKey(codigo))
			{
				desconto = descontos.get(codigo);
				total += item.calculaPedido()*(1 - desconto/100);
			}
			else
			{
				total += item.calculaPedido();
			}
		}
		return total;
	}
	
}

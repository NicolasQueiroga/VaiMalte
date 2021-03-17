package br.edu.insper.desagil.vaimalte;

public class Testador 
{
	
	double total;
	double expected;
	
	public boolean testeA() 
	{
		Carrinho carrinhoTesteA = new Carrinho();
		Caixa caixaTesteA = new Caixa();
		total = caixaTesteA.calculaTotal(carrinhoTesteA);
		expected = 0;
		if (total == expected)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean testeB() 
	{
		Carrinho carrinhoTesteB = new Carrinho();
		Produto produto1TesteB = new Produto(0001, "Manga", 5.63);
		carrinhoTesteB.atualizaCarrinho(produto1TesteB);
		Caixa caixaTesteB = new Caixa();
		total = caixaTesteB.calculaTotal(carrinhoTesteB);
		expected = 5.63;
		if (total == expected)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean testeC() 
	{
		Carrinho carrinhoTesteC = new Carrinho();
		total = 0;
		expected = 0;
		if (total == expected)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean testeD() 
	{
		Carrinho carrinhoTesteD = new Carrinho();
		total = 0;
		expected = 0;
		if (total == expected)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean testeE() 
	{
		Carrinho carrinhoTesteE = new Carrinho();
		Produto produto1TesteE = new Produto(1011, "Banana", 3.26);
		Produto produto2TesteE = new Produto(1101, "Melancia", 20.88);
		carrinhoTesteE.atualizaCarrinho(produto1TesteE);
		carrinhoTesteE.atualizaCarrinho(produto2TesteE);
		carrinhoTesteE.atualizaCarrinho(produto2TesteE);
		Caixa caixaTesteE = new Caixa();
		caixaTesteE.adicionaDisconto(produto2TesteE, 12);
		total = caixaTesteE.calculaTotal(carrinhoTesteE);
		expected = 3.26 + 2*20.88*(1 - 0.12);
		if (total == expected)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}

package br.edu.insper.desagil.vaimalte;

public class Testador 
{
	
	private double total;
	private double expected;
	
	public boolean testeA() 
	{
		Carrinho carrinhoTesteA = new Carrinho();
		Caixa caixaTesteA = new Caixa();
		total = caixaTesteA.calculaTotal(carrinhoTesteA);
		expected = 0;
		return (total == expected);
	}

	public boolean testeB() 
	{
		Carrinho carrinhoTesteB = new Carrinho();
		Produto produto1TesteB = new Produto(1011, "Manga", 5.63);
		carrinhoTesteB.atualizaCarrinho(produto1TesteB);
		Caixa caixaTesteB = new Caixa();
		total = caixaTesteB.calculaTotal(carrinhoTesteB);
		expected = 5.63;
		return (total == expected);
	}

	public boolean testeC() 
	{
		Carrinho carrinhoTesteC = new Carrinho();
		Produto produto1TesteC = new Produto(1100, "Abacaxi", 7.07);
		carrinhoTesteC.atualizaCarrinho(produto1TesteC);
		Caixa caixaTesteC = new Caixa();
		caixaTesteC.adicionaDisconto(produto1TesteC, 13);
		total = caixaTesteC.calculaTotal(carrinhoTesteC);
		expected = 7.07*(1 - 0.13);
		return (total == expected);
	}

	public boolean testeD() 
	{
		Carrinho carrinhoTesteD = new Carrinho();
		Produto produto1TesteD = new Produto(1101, "Laranja", 2.05);
		Produto produto2TesteD = new Produto(1110, "Morango", 10.6);
		carrinhoTesteD.atualizaCarrinho(produto1TesteD);
		carrinhoTesteD.atualizaCarrinho(produto1TesteD);
		carrinhoTesteD.atualizaCarrinho(produto2TesteD);
		Caixa caixaTesteE = new Caixa();
		caixaTesteE.adicionaDisconto(produto2TesteD, 20);
		total = caixaTesteE.calculaTotal(carrinhoTesteD);
		expected = 2*2.05 + 10.6*(1 - 0.2);
		return (total == expected);
	}

	public boolean testeE() 
	{
		Carrinho carrinhoTesteE = new Carrinho();
		Produto produto1TesteE = new Produto(1111, "Banana", 3.26);
		Produto produto2TesteE = new Produto(10000, "Melancia", 20.88);
		carrinhoTesteE.atualizaCarrinho(produto1TesteE);
		carrinhoTesteE.atualizaCarrinho(produto2TesteE);
		carrinhoTesteE.atualizaCarrinho(produto2TesteE);
		Caixa caixaTesteE = new Caixa();
		caixaTesteE.adicionaDisconto(produto2TesteE, 12);
		total = caixaTesteE.calculaTotal(carrinhoTesteE);
		expected = 3.26 + 2*20.88*(1 - 0.12);
		return (total == expected);
	}
	
}

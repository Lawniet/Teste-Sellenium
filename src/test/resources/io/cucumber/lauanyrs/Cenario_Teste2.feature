# language: pt

Funcionalidade: Acessar o site da Vendas aula e preencher todos os campos da formulário Produtos

  Cenario: Peencher campos do formulário Produtos
	Quando acesso a aba de novo produto: "https://vendas-aula.herokuapp.com/produtos/new"
	Dado preencho o campo Nome: "Mouse óptico"
	E preencho o campo Descricao: "Mouse Óptico Notebook sem Fio com resolução	
1200dpi"
	E preencho o campo Quantidade: 14
	E que clico na opcao Vencimento: "07/23/2025 14:25:00"
	E preencho o campo Preco compra: 355.74
	E preencho o campo Preco venda: 425.04
	Entao devo clicar em Salvar 
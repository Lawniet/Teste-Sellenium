# language: pt

Funcionalidade: Acessar o site da Vendas aula e preencher todos os campos da formulário Clientes

  Cenario: Peencher campos do formulário Clientes
	Quando acesso a aba de novo cliente: "https://vendas-aula.herokuapp.com/clientes/new"
	Dado preencho o campo Nome: "Eduardo Nicolas Otávio Lemes Alves"
	E preencho o campo Telefone: "(61) 990012233"
	E preencho o campo Email: "ENOLA@mail.com"
	Entao devo clicar em Salvar

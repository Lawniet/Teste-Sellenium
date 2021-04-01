package io.cucumber.lauanyrs;

import io.cucumber.java.pt.*;
import io.cucumber.lauanyrs.services.Comando;

public class CenarioSteps2 {
    @Quando("acesso a aba de novo produto: {string}")
    public void acessoProdutos(String string) {
        Comando.abrir(string);
    }
    
    @Dado("preencho o campo Nome: {string}")
    public void preencheNomeProd(String string) {
        Comando.seletorQueryXpath("//*[@id='produto_nome']").sendKeys(string);
    }

    @Dado("preencho o campo Descricao: {string}")
    public void preencheDescricao(String string) {
        Comando.seletorQueryXpath("//*[@id='produto_descricao']").sendKeys(string);
    }
    
    @Dado("preencho o campo Quantidade: {string}")
    public void preencheQuantidade(String string) {
        Comando.seletorQueryXpath("//*[@id='produto_quantidade']").sendKeys(string);
    }
    
    @Dado("que clico na opcao Vencimento: {string}")
    public void preencheVencimento(String string) {
        Comando.seletorQueryXpath("//*[@id='produto_vencimento']").sendKeys(string);
    }

    @Dado("preencho o campo Preco compra: {string}")
    public void preenchePrecoC(String string) {
        Comando.seletorQueryXpath("//*[@id='produto_preco_compra']").sendKeys(string);
    } 
    
    @Dado("preencho o campo Preco venda: {string}")
    public void preenchePrecoV(String string) {
        Comando.seletorQueryXpath("//*[@id='produto_preco_venda']").sendKeys(string);
    }

    @Entao("devo clicar em Salvar")
    public void clicarSalvar2() {
        Comando.seletorQueryXpath("//*[@name='commit']").click();
    }
    
}
package io.cucumber.lauanyrs;

import io.cucumber.java.pt.*;
import io.cucumber.lauanyrs.services.Comando;

public class CenarioSteps1 {

    @Quando("acesso a aba de novo cliente: {string}")
    public void acessoCliente(String string) {
        Comando.abrir(string);
    }
    
    @Dado("preencho o campo Nome: {string}")
    public void preencheNome(String string) {
        Comando.seletorQueryXpath("//*[@id='cliente_nome']").sendKeys(string);
    }

    @Dado("preencho o campo Telefone: {string}")
    public void preencheTelefone(String string) {
        Comando.seletorQueryXpath("//*[@id='cliente_telefone']").sendKeys(string);
    }
    
    @Dado("preencho o campo Email: {string}")
    public void preencheEmail(String string) {
        Comando.seletorQueryXpath("//*[@id='cliente_email']").sendKeys(string);
    }

    @Entao("devo clicar em Salvar")
    public void clicarSalvar1() {
        Comando.seletorQueryXpath("//*[@name='commit']").click();
    }
}
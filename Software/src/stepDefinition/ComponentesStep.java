package stepDefinition;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import util.Componentes;

public class ComponentesStep {

    Componentes componentes = new Componentes();

    @Dado("que o usuario acessou a pagina html")
    public void que_o_usuario_acessou_a_pagina_html(){
        componentes.inicializa();
    }

    @Quando("o usuario preencher seu dados")
    public void o_usuario_preencher_seu_dados(){
        componentes.cadastro();
    }
    @Entao("os dados serao preenchidos")
    public void os_dados_serao_preenchidos(){
        componentes.cadastroValidacao();
    }

    @Quando("o usuario nao preencher todos os dados necessarios")
    public void o_usuario_nao_preencher_todos_os_dados_necessarios(){

    }
    @Entao("ocorrera um erro")
    public void ocorrera_um_erro(){

    }


}

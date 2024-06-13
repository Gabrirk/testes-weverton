#language:pt
  Funcionalidade: Acessar a pagina html

    Contexto:
      Dado que o usuario acessou a pagina html

      Cenario: cadastrar seus dados
        Quando o usuario preencher seu dados
        Entao os dados serao preenchidos

    Cenario: validar regras de negocio
      Quando o usuario nao preencher todos os dados necessarios
      Entao ocorrera um erro
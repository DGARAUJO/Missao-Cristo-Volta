# language: pt


Funcionalidade: Cadastro de membros

  Cenário: Cadastro de membro com sucesso
    Dado que eu tenha um novo membro
    E tenha todos os dados para cadastro
    Quando eu preencher os campos obrigatorios
    Então deve cadastrar o membro com sucesso
    E retornar a mensagem "Membro cadastrado com sucesso"

  Cenário: Validar extrato conta iti
    Dado que eu tenha um cpf e senha
    E tenha movimentações na conta
    Quando eu acessar o aplicativo
    E acessar o extrato
    Entao deve ser exibido as ultimas movimentações


  Cenário: Validar extrato de movimentações recebemintos
    Dado que eu tenha um cpf "46380365893" e senha "202020"
    E tenha movimentações na conta
    Quando eu acessar o aplicativo
    E acessar o extrato
    E acessar o filtro recebimentos
    Entao deve ser exibido as ultimas movimentações de recebimento
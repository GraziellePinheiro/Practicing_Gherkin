# language: pt

Funcionalidade: Validação de Campo de Formulário
  Para garantir que os campos de formulário aceitem entradas válidas
  Como um desenvolvedor
  Eu quero testar várias combinações de entradas nos campos

Esquema do Cenário: Validação de campo de nome
  Dado que eu estou na página de cadastro
  Quando eu insiro o nome "<nome>"
  E eu submeto o formulário
  Então devo ver "<mensagem>"

  Exemplos:
    | nome            | mensagem                             |
    | João            | Nome válido                          |
    | A               | Nome muito curto                     |
    | João da Silva   | Nome válido                          |
    | @#$%            | Nome contém caracteres inválidos     |
    |                 | Nome não pode estar em branco        |
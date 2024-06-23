# language: pt

Funcionalidade: Operações com Strings
    Como um desenvolvedor
    Eu quero testar operações com strings
    Para garantir que elas funcionem corretamente
    
Cenário: Concatenar duas strings
    Dado que tenho a string "Olá"
    E tenho a string "mundo"
    Quando eu concatenar as duas strings
    Então o resultado será "Olá mundo"
    
Cenário: Verificar se uma string contém outra
    Dado que tenho a frase "O Sol brilha para todos!"
    Quando eu verificar se ela contém a palavra "brilha"
    Então o resultado deverá ser verdadeiro
    
Cenário: Extrair parte de uma string
    Dado que tenho a seguinte frase "O preço é R$ 15,00"
    Quando eu extrair a parte "R$ 15,00"
    Então o resultado deverá ser "R$ 15,00"
    
Cenário: Substituir uma parte da string
    Dado que tenho string "Eu gosto de morangos"
    Quando eu substituir "morangos" por "maçãs"
    Então o resultado deve ser "Eu gosto de maçãs"
    
Cenário: Converter string para maiúsculas
    Dado que tenho uma frase "texto em minúsculas"
    Quando eu converter para maiúsculas
    Então oH resultado deverá ser  "TEXTO EM MINÚSCULAS"
    
Cenário: Formatar uma data
    Dado que tenho o dia 13
    E tenho o mês 06
    E tenho o ano 2024
    Quando eu formatar a data
    Então resultado deverá ser "13/06/2024"
    
Cenário: Confirmar o dia atual
  Dado que eu tenho a data atual
  Quando eu formatar a data atual
  Então o resultado deverá ser o dia atual no formato "dd/MM/yyyy"
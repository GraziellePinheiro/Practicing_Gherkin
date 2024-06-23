# language: pt

Funcionalidade: Aprender Cucumber
	Como um aluno
	Eu quero aprender a utilizar Cucumber
	Para que eu possa automatizar critérios de aceitação
	
Cenário: Incrementar o valor do contador
    Dado que o valor do contador é 0
    Quando eu incrementar em 2
    Então o valor do contador será 2
    
Cenário: Incrementar o valor do contador novamente
    Dado que o valor do contador é 5
    Quando eu incrementar em 3
    Então o valor do contador será 8
    
Cenário: Decrementar o valor do contador
    Dado que o valor do contador é 10
    Quando eu incrementar em -4
    Então o valor do contador será 6
    
Cenário: Incrementar o valor do contador para um número negativo
    Dado que o valor do contador é -3
    Quando eu incrementar em -2
    Então o valor do contador será -5
    
Cenário: Incrementar o valor do contador com zero
    Dado que o valor do contador é 7
    Quando eu incrementar em 0
    Então o valor do contador será 7
    
Cenário: Resetar o contador para zero
    Dado que o valor do contador é 9
    Quando eu incrementar em -9
    Então o valor do contador será 0
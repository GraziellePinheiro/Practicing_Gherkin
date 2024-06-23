# language: pt

Funcionalidade: Comportamento de Sessão de Usuário
  Para garantir que o sistema responde corretamente ao estado da sessão do usuário
  Como um desenvolvedor
  Eu quero testar diferentes estados de sessão

Esquema do Cenário: Verificação de estado da sessão
  Dado que o usuário está na página inicial
  E o estado da sessão é "<estado>"
  Quando o usuário tenta acessar a página restrita
  Então ele deve ver "<mensagem>"

  Exemplos:
    | estado     | mensagem                     |
    | logado     | Acesso permitido             |
    | deslogado  | Por favor, faça login        |
    | expirado   | Sessão expirada, faça login novamente |
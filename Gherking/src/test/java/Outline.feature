# language: pt

Funcionalidade: Autenticação de Usuário
  Para garantir a segurança do sistema
  Como um administrador do sistema
  Eu quero que os usuários façam login com credenciais válidas e inválidas

Esquema do Cenário: Tentativas de login com diferentes credenciais
  Dado que eu estou na página de login
  Quando eu insiro o nome de usuário "<username>"
  E eu insiro a senha "<password>"
  E eu clico no botão de login
  Então eu devo ver "<message>"

  Exemplos:
    | username      | password      | message                          |
    | admin         | password123   | Bem-vindo, admin!                |
    | user          | wrongpassword | Credenciais inválidas            |
    | non_existing  | anypassword   | Usuário não encontrado           |
    | admin         |               | Senha não pode estar em branco   |
    |               | password123   | Nome de usuário não pode estar em branco |

# 1. Introdução
Este documento tem como objetivo definir os requisitos funcionais e não funcionais para a aplicação de listagem e avaliação de filmes, incluindo funcionalidades de autenticação de usuários e filtragem de filmes.
# 2. Requisitos Funcionais
## 2.1 Autenticação de Usuários
### RF-01 - Registro de Usuários

Descrição: Os usuários devem ser capazes de se registrar na aplicação utilizando nome, e-mail e senha.
Critérios de Aceitação:
O sistema deve validar a unicidade do e-mail.
O sistema deve armazenar as senhas de forma segura usando hashing.

### RF-02 - Login de Usuários

Descrição: Os usuários registrados devem ser capazes de fazer login utilizando seu e-mail e senha.
Critérios de Aceitação:
O sistema deve validar as credenciais do usuário.
Em caso de falha, uma mensagem de erro adequada deve ser exibida.

### RF03 - Logout de Usuários
Descrição: Os usuários devem ser capazes de sair de suas contas na aplicação.
Critérios de Aceitação:
O sistema deve encerrar a sessão do usuário e redirecioná-lo para a página de login.

# 2.2 Filtragem de Filmes
### RF-04 - Filtrar Filmes por Gênero

Descrição: Os usuários devem ser capazes de filtrar a lista de filmes por gênero.
Critérios de Aceitação:
A lista de filmes deve ser atualizada para mostrar apenas os filmes do gênero selecionado.
### RF-05 - Ordenar Filmes por Avaliação

Descrição: Os usuários devem ser capazes de ordenar filmes por avaliação média.
Critérios de Aceitação:
Os filmes devem ser listados de acordo com suas avaliações, do maior para o menor.

# 3. Requisitos Não Funcionais
### RNF-01 - Segurança
Descrição: A aplicação deve garantir a segurança dos dados dos usuários, especialmente senhas e informações pessoais.
Critérios de Aceitação:
Uso de protocolos seguros para a transmissão de dados.
Armazenamento seguro de senhas usando técnicas de hashing e salting.

### RNF02 - Desempenho
Descrição: A aplicação deve responder às ações do usuário em um tempo aceitável.
Critérios de Aceitação:
Todas as ações de filtragem e login devem responder em menos de 2 segundos sob carga normal.

### RNF03 - Usabilidade
Descrição: A aplicação deve ser fácil de usar e navegar.
Critérios de Aceitação:
Interface intuitiva e responsiva.
# 4. Glossário
Usuário: Qualquer pessoa que interaja com a aplicação, registrada ou não.
Sessão: Período em que o usuário está autenticado no sistema.
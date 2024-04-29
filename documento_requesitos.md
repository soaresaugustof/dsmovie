# Documento de Requisitos da Aplicação de Filmes

## 1. Introdução
Este documento especifica os requisitos funcionais e não funcionais para a aplicação de listagem e avaliação de filmes. A aplicação oferecerá funcionalidades de autenticação segura, busca, filtragem, avaliação, e marcação de filmes, com foco em uma experiência personalizada para o usuário.

## 2. Requisitos Funcionais

### 2.1 Autenticação de Usuários
**RF01 - Registro de Usuários**
- **Descrição**: Permitir que novos usuários se registrem na aplicação fornecendo nome, e-mail e senha.
- **Critérios de Aceitação**:
  - O sistema deve verificar se o e-mail já está em uso.
  - As senhas devem ser armazenadas usando hash seguro.
  - Ao registro bem-sucedido, o sistema deve retornar um JWT para o usuário.

**RF02 - Login de Usuários**
- **Descrição**: Permitir que usuários registrados façam login usando e-mail e senha.
- **Critérios de Aceitação**:
  - As credenciais devem ser validadas contra o banco de dados.
  - Um JWT deve ser emitido se as credenciais forem válidas.
  - As rotas que requerem autenticação não devem ser acessíveis sem um JWT válido.

**RF03 - Logout de Usuários**
- **Descrição**: Permitir que os usuários façam logout da aplicação.
- **Critérios de Aceitação**:
  - O token JWT do usuário deve ser invalidado.

### 2.2 Filtragem e Busca de Filmes
**RF04 - Filtrar Filmes por Gênero**
- **Descrição**: Permitir que os usuários filtrem filmes por gênero.
- **Critérios de Aceitação**:
  - A lista de filmes deve ser atualizada para mostrar apenas os filmes do gênero selecionado.

**RF05 - Filtrar Filmes por Ano de Lançamento**
- **Descrição**: Permitir que os usuários filtrem filmes pelo ano de lançamento.
- **Critérios de Aceitação**:
  - A lista de filmes deve mostrar apenas filmes do intervalo de anos selecionado.

**RF06 - Busca de Filmes por Título**
- **Descrição**: Permitir que os usuários busquem filmes pelo título.
- **Critérios de Aceitação**:
  - Os resultados devem incluir todos os filmes cujos títulos contenham o texto buscado.

### 2.3 Interação com Filmes
**RF07 - Avaliação de Filmes**
- **Descrição**: Permitir que os usuários logados avaliem filmes.
- **Critérios de Aceitação**:
  - A avaliação deve ser salva e refletida na média de avaliações do filme.

**RF08 - Marcar Filmes como 'Quero Assistir'**
- **Descrição**: Permitir que os usuários logados adicionem filmes à sua lista pessoal de 'Quero Assistir'.
- **Critérios de Aceitação**:
  - Os filmes marcados devem ser acessíveis na lista de 'Quero Assistir' do usuário.

## 3. Requisitos Não Funcionais
**RNF01 - Segurança**
- **Descrição**: A aplicação deve garantir a segurança dos dados dos usuários.
- **Critérios de Aceitação**:
  - Uso de HTTPS para todas as transações.
  - JWTs devem ser implementados com práticas seguras (por exemplo, usando assinaturas e tempo de expiração adequados).

**RNF02 - Desempenho**
- **Descrição**: A aplicação deve ser responsiva e eficiente.
- **Critérios de Aceitação**:
  - Todas as ações de usuário devem ter resposta em menos de 2 segundos sob carga normal.

**RNF03 - Usabilidade**
- **Descrição**: A aplicação deve ser fácil de usar e acessível.
- **Critérios de Aceitação**:
  - Interface intuitiva com navegação clara e feedback visual apropriado.

## 4. Glossário
- **Usuário**: Qualquer pessoa que utiliza a aplicação.
- **JWT (JSON Web Token)**: Método para representar reivindicações de segurança entre duas partes.
# Aderas e Minas productions

### Plano de Teste de Autenticação (BDD)

**Funcionalidade**: Registro de Usuários

-   **Como** um novo visitante
-   **Eu quero** criar uma conta
-   **Para que** eu possa acessar funcionalidades exclusivas para usuários registrados

**Cenário**: Registro bem-sucedido (Teste Funcional)

-   **Dado** que eu estou na página de registro
-   **Quando** eu preencho o formulário de registro com dados válidos e submeto
-   **Então** recebo uma confirmação de registro
-   **E** sou redirecionado para a página de perfil
-   **Evidência**: Screenshots de cada etapa do preenchimento e da mensagem de confirmação.

**Cenário**: Tentativa de registro com dados incompletos (Teste Funcional)

-   **Dado** que eu estou na página de registro
-   **Quando** eu submeto o formulário com campos obrigatórios em branco
-   **Então** recebo mensagens de erro indicando os campos obrigatórios
-   **Evidência**: Screenshots do formulário com campos em branco e das mensagens de erro.

**Teste de Performance**: Carga no processo de registro (Teste Não Funcional)

-   **Dado** que eu tenho o Jmeter configurado para simular 100 usuários simultâneos
-   **Quando** os usuários tentam registrar-se simultaneamente
-   **Então** o sistema deve registrar todos os usuários dentro do tempo de resposta aceitável
-   **Evidência**: Relatórios e gráficos do Jmeter mostrando o número de transações bem-sucedidas e o tempo de resposta.

### Plano de Teste de Filtragem de Filmes (BDD)

**Funcionalidade**: Filtragem de Filmes

-   **Como** um usuário
-   **Eu quero** filtrar filmes por diferentes critérios
-   **Para que** eu possa encontrar filmes de meu interesse mais facilmente

**Cenário**: Filtrar filmes por gênero (Teste Funcional)

-   **Dado** que eu estou na página principal que lista os filmes
-   **Quando** eu seleciono um gênero específico de uma lista de gêneros disponíveis
-   **Então** apenas filmes daquele gênero são exibidos na lista
-   **Evidência**: Screenshots da seleção de gênero e da lista filtrada.

**Cenário**: Ordenar filmes por avaliação (Teste Funcional)

-   **Dado** que eu estou na página principal que lista os filmes
-   **Quando** eu escolho ordenar os filmes pela avaliação média
-   **Então** os filmes são listados de acordo com suas avaliações, do maior para o menor
-   **Evidência**: Screenshots da opção de ordenação selecionada e dos filmes ordenados.

**Teste de Performance**: Carga na filtragem de filmes (Teste Não Funcional)

-   **Dado** que eu tenho o Jmeter configurado para simular 50 usuários simultâneos acessando a filtragem de filmes
-   **Quando** os usuários aplicam diferentes filtros simultaneamente
-   **Então** o sistema deve responder dentro de um tempo aceitável sem erros
-   **Evidência**: Relatórios e gráficos do Jmeter mostrando o desempenho do sistema durante a filtragem.
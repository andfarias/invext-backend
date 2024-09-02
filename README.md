# Sistema de Gerenciamento de Solicitações de Atendimento

Bem-vindo ao repositório do meu projeto de Sistema de Gerenciamento de Solicitações de Atendimento! 🚀

Esta aplicação foi desenvolvida como uma solução para gerenciar e distribuir solicitações de clientes entre diferentes equipes de atendimento, garantindo um processo eficiente e organizado.

## 🌟 Sobre o Projeto

Este sistema foi projetado para atender às necessidades de um centro de atendimento de uma empresa, onde as solicitações dos clientes precisam ser encaminhadas para equipes específicas com base no tipo de solicitação. A solução garante que cada atendente possa gerenciar um número limitado de solicitações simultaneamente, enquanto as demais são enfileiradas para atendimento assim que possível.

### Funcionalidades Implementadas

- **Distribuição Automática**: Direciona automaticamente as solicitações para a equipe correta com base no tipo de solicitação.
- **Gerenciamento de Filas**: Solicitações são enfileiradas se todos os atendentes de uma equipe estiverem ocupados.
- **Limite de Atendimento Simultâneo**: Cada atendente pode atender até 3 clientes ao mesmo tempo.
- **API REST**: Interface para integração e manipulação das solicitações e atendimentos.

## 🛠️ Tecnologias Utilizadas

- **Java 17**: Linguagem de programação principal.
- **Spring Boot**: Framework para desenvolvimento de aplicações Java.
- **Spring Data JPA**: Persistência de dados.
- **H2 Database**: Banco de dados em memória para testes e desenvolvimento.
- **Maven**: Gerenciamento de dependências e automação de build.
- **JUnit 5 e Mockito**: Frameworks para testes unitários e mock.

## 📂 Estrutura do Projeto

O projeto está organizado da seguinte maneira:

```plaintext
gerenciamento-solicitacoes
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── br.com.andersonfariasdev
│   │   │       ├── controller       # Controladores REST
│   │   │       ├── model            # Classes de modelo de dados
│   │   │       ├── repository       # Repositórios Spring Data JPA
│   │   │       └── service          # Lógica de negócios e serviços
│   │   └── resources
│   │       ├── application.properties   # Configurações da aplicação
│   │       └── data.sql                 # Scripts de inicialização do banco de dados
│   └── test
│       └── br.com.andersonfariasdev
│           └── ...              # Testes unitários
└── README.md                    # Descrição do projeto
```

## 🚀 Como Executar o Projeto

1. **Clone o Repositório**:

   ```bash
   git clone https://github.com/seu-usuario/gerenciamento-solicitacoes.git
   cd gerenciamento-solicitacoes
   ```

2. **Compile o Projeto**:

   ```bash
   mvn clean install
   ```

3. **Execute a Aplicação**:

   ```bash
   mvn spring-boot:run
   ```

4. **Acesse a Aplicação**:

   A API estará disponível em [http://localhost:8080](http://localhost:8080).

## 📋 Endpoints da API

- **POST /api/solicitacoes**: Recebe uma nova solicitação.
- **GET /api/solicitacoes**: Busca todas solicitações.
- **GET /api/solicitacoes/{id}**: Busca solicitação por id.

## 🧪 Testes

Para executar os testes, utilize o comando:

```bash
mvn test
```

Os testes cobrem a lógica de negócios principal e garantem que a distribuição de solicitações funcione conforme o esperado.

## 📈 Potenciais Melhorias

- **Persistência de Dados**: Utilizar um banco de dados relacional ou NoSQL para persistir dados de solicitações.
- **Interface de Usuário**: Adicionar uma interface web para gerenciar atendentes e visualizar filas.
- **Autenticação e Autorização**: Implementar segurança na API REST.

# Java Login System

Sistema de gerenciamento de usuários desenvolvido em **Java**, utilizando **JDBC** para persistência de dados em um banco **MySQL**.

O objetivo deste projeto foi praticar os principais conceitos da linguagem Java e evoluir um sistema simples em console para uma aplicação com persistência em banco de dados, seguindo uma estrutura organizada utilizando o padrão DAO.

---

## Funcionalidades

- ✅ Cadastro de usuários
- ✅ Login
- ✅ Listagem de usuários
- ✅ Busca de usuário por nome
- ✅ Alteração de nome
- ✅ Alteração de senha
- ✅ Exclusão de usuários
- ✅ Persistência dos dados em MySQL utilizando JDBC

---

## Tecnologias utilizadas

- Java 21
- JDBC
- MySQL
- MySQL Workbench
- IntelliJ IDEA
- Git
- GitHub

---

## Estrutura do projeto

```text
src
├── Main.java
├── Usuario.java
├── UsuarioDAO.java
├── ConexaoBanco.java
├── Cadastro.java
├── LoginNovo.java
├── BuscarUsuarioBanco.java
├── AlterarSenhaBanco.java
├── AlterarNomeBanco.java
└── ExcluirUsuarioBanco.java
```

---

## Banco de Dados

Banco utilizado:

```sql
CREATE DATABASE login_system;
```

Tabela:

```sql
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    senha VARCHAR(100) NOT NULL
);
```

---

## Como executar

1. Clone o repositório.

```bash
git clone https://github.com/ZergRJ/java-login-system.git
```

2. Abra o projeto no IntelliJ IDEA.

3. Crie o banco de dados utilizando o script SQL acima.

4. Crie um arquivo chamado:

```text
config.properties
```

na raiz do projeto.

Conteúdo:

```properties
db.url=jdbc:mysql://localhost:3306/login_system
db.user=root
db.password=sua_senha
```

5. Adicione o MySQL Connector/J ao projeto.

6. Execute a classe `Main`.

---

## O que foi praticado

Durante o desenvolvimento deste projeto foram aplicados conceitos como:

- Programação Orientada a Objetos
- Encapsulamento
- Construtores
- CRUD
- JDBC
- DAO (Data Access Object)
- Connection
- PreparedStatement
- ResultSet
- Integração com MySQL
- Tratamento de exceções
- Organização de responsabilidades entre as classes
- Versionamento utilizando Git e GitHub

---

## Evolução do projeto

O projeto foi desenvolvido em etapas para acompanhar minha evolução no aprendizado de Java.

### Versão 1

Armazenamento dos usuários utilizando `ArrayList`.

### Versão 2

Persistência dos usuários em arquivo `.txt`.

### Versão 3 (Atual)

Persistência utilizando **MySQL + JDBC**, removendo completamente a dependência do armazenamento em memória e em arquivos.

---

## Próximas melhorias

- Organizar o projeto em pacotes
- Impedir cadastro de usuários duplicados
- Criptografar senhas
- Melhorar o tratamento de exceções
- Utilizar Maven para gerenciamento de dependências
- Migrar para Spring Boot
- Desenvolver uma API REST
- Criar uma interface gráfica para o sistema

---

## Autor

Desenvolvido por **Gean Lucas**.
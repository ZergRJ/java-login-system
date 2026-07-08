# Java Login System

Sistema de gerenciamento de usuários desenvolvido em Java, com integração ao banco de dados MySQL utilizando JDBC.

Este projeto começou como um sistema simples em console, armazenando usuários em memória com `ArrayList` e depois em arquivo `.txt`. Em seguida, foi evoluído para utilizar banco de dados relacional com MySQL, deixando a aplicação mais próxima de um sistema real.

## Funcionalidades

- Cadastro de usuários
- Login de usuários
- Listagem de usuários cadastrados
- Busca de usuário por nome
- Alteração de nome
- Alteração de senha
- Exclusão de usuários
- Persistência de dados com MySQL
- Integração com banco de dados usando JDBC

## Tecnologias utilizadas

- Java 21
- JDBC
- MySQL
- MySQL Workbench
- IntelliJ IDEA
- Git
- GitHub

## Estrutura principal do projeto

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

## Banco de dados

O projeto utiliza o banco de dados `login_system`.

Script SQL utilizado:

```sql
CREATE DATABASE IF NOT EXISTS login_system;

USE login_system;

CREATE TABLE IF NOT EXISTS usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    senha VARCHAR(100) NOT NULL
);
```

## Como executar o projeto

1. Clone o repositório:

```bash
git clone https://github.com/ZergRJ/java-login-system.git
```

2. Abra o projeto no IntelliJ IDEA.

3. Crie o banco de dados no MySQL utilizando o script SQL acima.

4. Configure a conexão com o banco na classe `ConexaoBanco.java`:

```java
String url = "jdbc:mysql://localhost:3306/login_system";
String usuario = "root";
String senha = "sua_senha";
```

5. Adicione o driver MySQL Connector/J ao projeto.

6. Execute a classe `Main.java`.

## Conceitos praticados

Durante o desenvolvimento deste projeto, foram praticados conceitos importantes de Java e banco de dados, como:

- Programação orientada a objetos
- Encapsulamento
- Classes e métodos
- CRUD
- JDBC
- Connection
- PreparedStatement
- ResultSet
- DAO
- Separação de responsabilidades
- Integração com MySQL
- Versionamento com Git e GitHub

## Evolução do projeto

### Primeira versão

A primeira versão do sistema utilizava `ArrayList` para armazenar os usuários em memória.

### Segunda versão

Depois, o projeto passou a salvar os dados em um arquivo `.txt`.

### Versão atual

A versão atual utiliza MySQL com JDBC, permitindo cadastrar, listar, buscar, alterar, excluir e realizar login com dados armazenados no banco.

## Roadmap

- [x] CRUD em memória
- [x] Persistência em arquivo `.txt`
- [x] Integração com MySQL
- [x] CRUD com JDBC
- [ ] Organização em pacotes
- [ ] Validação de usuário duplicado
- [ ] Melhor tratamento de erros
- [ ] Criptografia de senhas
- [ ] Migração para Maven
- [ ] Spring Boot
- [ ] API REST
- [ ] Interface web

## Autor

Desenvolvido por Gean Lucas.
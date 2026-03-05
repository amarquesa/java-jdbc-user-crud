# Java JDBC User CRUD

Projeto backend simples desenvolvido em Java utilizando JDBC para conexão com PostgreSQL.

O projeto implementa um CRUD básico de usuários aplicando o padrão DAO (Data Access Object) para separação das camadas de acesso ao banco de dados.

---

## Tecnologias utilizadas

- Java
- JDBC
- PostgreSQL
- DAO Pattern

---

## Estrutura do projeto
src
│
├─ db
│ └─ ConnectionFactory.java
│
├─ dao
│ └─ UserDao.java
│
├─ model
│ └─ User.java
│
└─ Main.java

---

## Funcionalidades

- Conexão com PostgreSQL
- Listar usuários
- Inserir usuários
- Atualizar usuários
- Remover usuários

## Menu da aplicação
=== MENU ===

1 - Listar usuários
2 - Inserir usuário
3 - Atualizar usuário
4 - Deletar usuário
0 - Sair

---

## Exemplo de saída

Lista de usuários:

1 | Amanda | amanda@gmail.com

---

## Autor

Amanda Evelyn Marques



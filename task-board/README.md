# Board Task

## Descrição
Board é um projeto desenvolvido em Java utilizando Spring Boot para gerenciar tarefas em um quadro interativo. Ele permite criar, editar e excluir tarefas, além de acompanhar seu status. A aplicação segue o padrão MVC (Model-View-Controller) e utiliza um banco de dados PostgreSQL para armazenar as informações das tarefas.

## Tecnologias Utilizadas
- Java 11+
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- Thymeleaf
- Bootstrap
- Gradle
- Liquibase

## Requisitos
- Java 11 ou superior instalado
- PostgreSQL configurado e em execução
- Maven ou Gradle instalado


## Como o Projeto Funciona
A aplicação permite que usuários realizem operações CRUD (Create, Read, Update, Delete) em tarefas dentro de um quadro interativo. O fluxo da aplicação é o seguinte:

1. A tela inicial exibe uma lista de tarefas armazenadas no banco de dados.
2. O usuário pode adicionar uma nova tarefa informando um título e uma descrição.
3. O usuário pode editar tarefas existentes.
4. O usuário pode excluir tarefas do sistema.
5. As alterações são persistidas no banco de dados PostgreSQL.




# school-system-api


API Rest para gestão acadêmica desenvolvida com Java e framework Spring Boot.

### Objetivo
Criar uma API REST e sua arquitetura gestão acadêmica, onde eu possa aprimorar meus conhecimentos em mapeamento objeto-relacional com JPA e utilizar framework Spring Boot, assim como organizar logicamente o sistema em uma arquitetura em camadas.

### Visão geral do sistema

Api desenvolvida cadastrar alunos, buscar alunos por id, listar todos os alunos. Para simplificar o acesso aos dados do banco de dados, utilizei o Spring Data JPA, um módulo do Spring que oferece uma implementação padrão das interfaces repository, utilizei o banco em memória H2 para testes e o Postman.

### Passos 

- Criar o projeto com Spring Initializr
- Configurar o banco de dados H2
- Implementar o modelo de domínio
- Mapeamento objeto-relacional com JPA e associações
- Criar os endpoints da API REST

## Como  executar o sistema

Para executar o projeto em seu ambiente de desenvolvimento, Certifique-se de ter o **Git**, **JDK17**, **Maven** e siga as instruções:
- realizar o git clone git@github.com:MedeirosGiana/school-system-api.git
- subir o projeto na sua IDE de preferência
- executar o projeto e acessar a um navegador da Web em **http://localhost:8080/h2-console** você conseguirá visualizar no banco as tabelas salvas
- para verificar os alunos listados, basta acessar no navegador http://localhost:8080/alunos
- para inserir um novo aluno, é necessário abrir o Postman utilizando o método Post seguindo o modelo de inserção abaixo no formato JSON :

        "nome": "Gabriel",
        "cpf": "111111111",
        "email": "gabriel@gmail.com"


## Tecnologias utlizadas:

   - [Java](https://docs.oracle.com/en/java/javase/17/)
   - [Maven](https://maven.apache.org/guides/)
   - [Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
   - [Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
   - [H2 Database](https://www.h2database.com/html/main.html)

## Ferramenta utilizada

   - [Postman](https://www.postman.com/api-documentation-tool/)


## Contribuindo

Se você quiser contribuir, sinta-se à vontade para enviar um pull request ou abrir uma issue.

<a href="https://www.java.com" target="_blank"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> 

## Autor
**Giana Medeiros**

https://www.linkedin.com/in/gianamedeiros/

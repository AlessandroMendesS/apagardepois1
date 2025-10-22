# Projeto CRUD Simples (Spring Boot + MySQL + Thymeleaf)

## Pré-requisitos
- Java 17 instalado
- Maven instalado
- MySQL rodando com um banco chamado `crud_simples`
  (ou crie com: `CREATE DATABASE crud_simples;`)
- Credenciais configuradas: user `root`, password `123456`

## Como rodar
1. Extraia o zip.
2. No terminal, dentro da pasta do projeto, rode:
   mvn spring-boot:run
3. Abra: http://localhost:8080

## Observações
- Para adicionar novos campos: edite `src/main/java/com/exemplo/crud/Usuario.java`
  adicionando atributos e getters/setters; depois atualize `form.html` e `lista.html`.

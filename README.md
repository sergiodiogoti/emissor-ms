# Emissor-MS

## Descrição

O `emissor-ms` é um microservice responsável por gerenciar emisoes de cartões e envio de emails.

## Dependências

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Spring Boot Starter Validation
- Spring Boot Starter Test

## Configuração
no caminho src/main/java/com/ms/emissor/config/ tem as configurações:
- CorsConfig
- ModelMapperConfig
- SwaggerConfig


### Banco de Dados

Este microservice utiliza o banco de dados H2 para persistência de dados. a configuração do banco é a padrão do spring, runtime, os dados serão mantidos enquanto aplicação estiver rodando.

## Documentação
Swagger: http://localhost:8081/swagger-ui/index.html
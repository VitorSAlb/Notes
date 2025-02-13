# Spring Security

> Projeto do ecossistema Spring que conta com uma poderosa estrutura personalizável para implementação de autenticação e autorização em aplicações Java Spring.


``` java

<dependecy>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependecy>

```

## Vulnerabilidades de Segurança em Aplicações Web

### - Vulnerabilidades na Autenticação e Autorização

![Imagem ilustrativa sobre athenticação](/Spring%20Security/assets/authIMG.png)

### - Cross Site Request Gorgery - CSRF

![Imagem ilustrativa sobre CSRF](/Spring%20Security/assets/csrfIMG.png)

Algumas ações para mitigar essa vulnerabilidade:
- Usar tokens para identificar as requisições
- Utilizar CORS limitados
- Validar a origem das requisições 

### - Usando Dependências com Vulnerabilidades

> Um exemplo desse caso é a vulnerabilidade detectada no Log4J2 nas versões anteriores no final do ano de 2021. Onde as informações que eram printadas no console poderiam ser expostas.

## Basic Authentication

![Imagem ilustrativa sobre o fluco da autenticação basica](/Spring%20Security/assets/fluxoBasicAuth.png)

## Http Status

### 401 Unauthorized
> Usuáro não logado, precisa envias as credenciais corretas de acesso.

### 403 Forbidden
> Usuário logado, mas não autorizado a acessar recursos específicos.
# Cardápio Digital

Este projeto é um simples simples protótipo de um Cardápio Digital. Você pode assistir ao tutorial no [YouTube](https://www.youtube.com/@kipperdev). 

<h1 align="center">
    <img src="https://github.com/nauam/project-app-spring-food-menu/blob/main/assets/tela-home.jpg?raw=true" width="300"/>
    <img src="https://github.com/nauam/project-app-spring-food-menu/blob/main/assets/tela-modal.png?raw=true" width="300"/>
</h1>

## Clonar
Primeiro, você deve clonar o projeto na sua máquina, para isso você
pode colar o seguinte comando em seu terminal

```bash
git clone https://github.com/nauam/project-app-spring-food-menu
cd project-app-spring-food-menu
```

# 🫂 Backend - Intellij IDEA

A aplicação foi desenvolvida usando **Java Spring e Spring MVC** para criação do servidor, **Spring Data JPA** para manipulação e persistência de dados, **Lombok** para geração de boilerplates e Postgres Driver para realizar a conexão com banco de dados Postgres.

```bash
cd project-app-spring-food-menu/api
```

## 💻 Requisitos

Antes de iniciar, você deve ter o Java 17, Maven e o Postgres instalados em sua máquina.

## 🚀 Instalando

Para construir o projeto com o Maven, executar os comando abaixo:

```bash
mvn clean install
```

O comando irá baixar todas as dependências do projeto e criar um diretório target com os artefatos construídos, que incluem o arquivo jar do projeto. Além disso, serão executados os testes unitários, e se algum falhar, o Maven exibirá essa informação no console.

## 🚀 Execução

Para executar o projeto com o Maven Spring Boot Plugin, executar os comando abaixo:

```bash
mvn spring-boot:run
```

# Frontend - VSCode

A aplicação foi desenvolvida usando **React, Typescript e React Query**.

```bash
cd project-app-spring-food-menu/web
```

## 💻 Requisitos

Antes de iniciar, você deve ter o Node.js e o NPM instalados em sua máquina.

## 🚀 Instalando

Para instalar as dependências, execute o seguinte comando:

```bash
npm install
```

Por fim, para executar o projeto basta rodar o seguinte:

```bash
npm run dev
```

## 🔧 Compilação

Para compilar a aplicação para produção, execute o seguinte comando:

```bash
npm run build
```
Isso irá gerar uma versão otimizada da aplicação na pasta `dist`.

## 📝 Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo `LICENSE` para obter mais informações.

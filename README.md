## Swag Labs WEB Automação
Esse é um repositório que contém a automação de alguns testes de WEB de um software denominado Swag Labs. Os subtópicos abaixo descrevem algumas decisões tomadas na estruturação do projeto.

## Tecnologias utilizadas

- JAVA
  https://www.oracle.com/java/technologies/downloads/
- Maven
  https://maven.apache.org
- JUnit
  https://mvnrepository.com/artifact/junit/junit
- Selenium
  https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
## Notas Gerais
- Sempre utilizo a anotação @BeforeEach para direcionar o driver do navegador escolhido; abrir a janela do navegador; maximizar e entrar no endereço WEB da aplicação.
- Também utilizo a anotação @AfterEach para fechar o navegador após a execução de mais ou um teste.
- Armazeno os testes no package módulos, nele com cada submódulo a ser testado, como o módulo de login, cadastro, comprar um produto, adicionar um produto no carrinho e etc...
- Armazeno as páginas da aplicação WEB no package "páginas", no intuito de deixar o projeto de teste mais organizado, e com mais facilidade para ser modificado/atualizado.
- Nesse projeto faço o uso do JUnit, que me dá a possibilidade de usar a anotação @DisplayName para dar descrições em português para o teste.

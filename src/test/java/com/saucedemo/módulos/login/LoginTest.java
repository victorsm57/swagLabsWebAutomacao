package com.saucedemo.módulos.login;

import com.saucedemo.páginas.LoginTestPages.LoginPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

@DisplayName("Testes Web Módulo Login")
public class LoginTest {

  private WebDriver driver;

  @BeforeEach
    public void entry_Point(){

      System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_103\\chromedriver.exe");
      this.driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      driver.get("https://www.saucedemo.com");
  }
    @DisplayName("Validar o acesso de um usuário válido")
    @Test
    public void testValidarAcessoDeUsuárioVálido(){

    String homePageMessage = new LoginPage(this.driver)
            .inputUser("standard_user")
            .inputPassword("secret_sauce")
            .goToHomePage()
            .getMessage();

      Assertions.assertEquals("PRODUCTS", homePageMessage);
  }
  @DisplayName("Não validar um usuário inválido")
  @Test
  public void testNãoValidarUsuárioInválido(){

              String errormessage = new LoginPage(driver)
                    .inputUser("12334")
                    .inputPassword("12344")
                    .goToHomePage()
                    .getErrorMessage();

              Assertions.assertEquals(
                      "Epic sadface: Username and password do not match any user in this service"
              , errormessage);
  }

  @AfterEach
  public void end_Point(){
    driver.quit();
  }

}

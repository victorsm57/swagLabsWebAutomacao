package com.saucedemo.módulos.produto;

import com.saucedemo.páginas.ProdutoTestPages.CartPage;
import com.saucedemo.páginas.ProdutoTestPages.LoginPage_ProdutoTest;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

@DisplayName("Testes WEB no módulo Produto")
public class ProdutoTest {

    private WebDriver driver;

    @BeforeEach
    public void entry_Point(){

        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_103\\chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
    }
    @DisplayName("Colocando um produto no carrinho")
    @Test
    public void tesAdicionarUmProdutoNoCarrinho(){

        String sucess_message = new LoginPage_ProdutoTest(driver)
                .input_User("standard_user")
                .input_Pass("secret_sauce")
                .goTo_HomePage()
                .add_Product()
                .add_Product2()
                .goToCartPage()
                .getSucessMessage();

        Assertions.assertEquals("Sauce Labs Backpack", sucess_message);
    }
    @DisplayName("Verificando a adição de mais de um produto")
    @Test
    public void testVerificarCarrinhoComMaisDeUmProduto(){

       String getMessage2 = new LoginPage_ProdutoTest(driver)
               .input_User("standard_user")
               .input_Pass("secret_sauce")
               .goTo_HomePage()
               .add_Product()
               .add_Product2()
               .goToCartPage()
               .getSucessMessaage2();

        Assertions.assertEquals("Sauce Labs Bike Light", getMessage2);
    }
    @AfterEach
    public void end_Point(){
        driver.quit();
    }
}

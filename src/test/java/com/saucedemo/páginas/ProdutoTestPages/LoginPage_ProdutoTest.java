package com.saucedemo.páginas.ProdutoTestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_ProdutoTest {

    private WebDriver driver;

    @FindBy(id = "user-name")
    WebElement inputUser;
    @FindBy(id = "password")
    WebElement inputPassword;
    @FindBy(id = "login-button")
    WebElement btt_click;


    public LoginPage_ProdutoTest(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage_ProdutoTest input_User(String user){
        inputUser.sendKeys(user);
        return this;
    }
    public LoginPage_ProdutoTest input_Pass(String pass){
        inputPassword.sendKeys(pass);
        return this;
    }
    public  HomePage_ProdutoTest goTo_HomePage(){
        btt_click.click();
        return new HomePage_ProdutoTest(driver);
    }


}

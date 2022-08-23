package com.saucedemo.páginas.LoginTestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    @FindBy(id = "user-name")
    WebElement inputUser;
    @FindBy(id = "password")
    WebElement inputPassword;
    @FindBy(id = "login-button")
    WebElement btt_click;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public LoginPage inputUser(String user){
        inputUser.sendKeys(user);
        return this;
    }
    public LoginPage inputPassword(String pass){
        inputPassword.sendKeys(pass);
        return this;
    }
    public HomePage goToHomePage(){
        btt_click.click();
        return new HomePage(driver);
    }
}

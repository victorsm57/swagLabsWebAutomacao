package com.saucedemo.páginas.LoginTestPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    @FindBy(className = "title")
    WebElement get_Title_HomePage;
    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
    WebElement errorMessage;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String getErrorMessage(){
        return  errorMessage.getText();
    }
    public String getMessage(){
        return get_Title_HomePage.getText();
    }
}

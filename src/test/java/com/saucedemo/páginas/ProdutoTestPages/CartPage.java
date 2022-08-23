package com.saucedemo.páginas.ProdutoTestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    WebElement getMessage;
    @FindBy(xpath = "//*[@id=\"item_0_title_link\"]/div")
    WebElement getMessage2;
    public CartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String getSucessMessage(){

        return getMessage.getText();
    }
    public String getSucessMessaage2(){
        return getMessage2.getText();
    }
}

package com.saucedemo.páginas.ProdutoTestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_ProdutoTest {

    private WebDriver driver;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement add_Product;
    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a/span")
    WebElement click_cartPage;
    @FindBy (name = "add-to-cart-sauce-labs-bike-light")
    WebElement add_Product2;

    public HomePage_ProdutoTest(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public HomePage_ProdutoTest add_Product(){
        add_Product.click();
        return this;
    }

    public HomePage_ProdutoTest add_Product2(){
        add_Product2.click();
        return this;
    }
    public CartPage  goToCartPage(){
        click_cartPage.click();
        return new CartPage(driver);
    }
}

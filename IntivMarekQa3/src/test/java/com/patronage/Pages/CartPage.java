package com.patronage.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage {

    @FindBy (how = How.ID_OR_NAME, using ="Submit")
    private WebElement SubmitButton;

    @FindBy (how = How.CLASS_NAME, using = "continue")
    private WebElement ContinueButton;

    @FindBy (how = How.CLASS_NAME, using = "cart_quantity_delete")
    private WebElement DeleteProduct;

    @FindBy (how = How.ID_OR_NAME, using = "cart_quantity_up_1_1_0_0")
    private WebElement AddQuant;

    @FindBy (how = How.CLASS_NAME, using ="ajax_cart_no_product")
    private WebElement ZeroProduct;

    @FindBy (how = How.CLASS_NAME, using="ajax_cart_quantity")
    private WebElement ProductsInCart;





    public WebElement getSubmitButton() {
        return SubmitButton;
    }

    public WebElement getContinueButton() { return ContinueButton; }

    public  WebElement getAddQuant() { return AddQuant; }

    public WebElement getDeleteProduct() {return DeleteProduct; }

    public WebElement getZeroProduct() {return ZeroProduct; }

    public WebElement getProductsInCart() { return ProductsInCart;}






}

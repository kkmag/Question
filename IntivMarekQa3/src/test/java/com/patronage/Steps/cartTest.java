package com.patronage.Steps;

import com.patronage.Pages.CartPage;
import cucumber.api.java8.En;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class cartTest implements En {

    WebDriver driver = new ChromeDriver();
    String baseUrl = "automationpractice.com/index.php?id_product=1&controller=product";
    CartPage gp = PageFactory.initElements(driver, CartPage.class);

    public cartTest() {
        After(Scenario -> {
            driver.quit();
        });

        Given("^Im on product page$", () -> {
            driver.get("http://" + baseUrl);
        });

        When("^I add product to my cart$", () -> {
            gp.getSubmitButton().click();
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOf(gp.getContinueButton()));
            gp.getContinueButton().click();

        });

        Then("^I have this item in my cart$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOf(gp.getProductsInCart()));
        });

        When("^I remove product from my cart$", () -> {
            driver.get("http://automationpractice.com/index.php?controller=order");
            gp.getDeleteProduct().click();

        });

        Then("^I should have empty cart$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOf(gp.getZeroProduct()));
        });
        When("^I change quantity of product using plus button 5 times$", () -> {
            driver.get("http://automationpractice.com/index.php?controller=order");

            for (int i = 0; i < 5; i++) {
                gp.getAddQuant().click();
                
            }

        });
        Then("^I should have six items of the same product$", () -> {
            //td[5]/input[2]

            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[5]/input[2]")));

        });


    }
}
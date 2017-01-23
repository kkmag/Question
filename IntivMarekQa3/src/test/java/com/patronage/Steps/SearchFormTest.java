package com.patronage.Steps;

import com.patronage.Pages.SearchForm;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchFormTest implements En {

    WebDriver driver = new ChromeDriver();
    String baseUrl = "automationpractice.com";
    SearchForm gp = PageFactory.initElements(driver, SearchForm.class);


    public SearchFormTest() {
        After(Scenario -> {
            driver.quit();
        });

        Given("^User is on Home Page$", () -> {
            driver.get("http://" + baseUrl);
        });

        When("^User search item by $", (String generalName) -> {
            gp.getSearchField().sendKeys(generalName);
            gp.getSearchButton().click();
        });

        Then("^User see all the results that match this name$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOf(gp.getResults()));
        });

        When("^User search item by ([^\"]*)$", (String productName) -> {
            gp.getSearchField().sendKeys(productName);
            gp.getSearchButton().click();

        });
        Then("^User find exactly one element$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOf(gp.getOneElement()));
        });

    }
}

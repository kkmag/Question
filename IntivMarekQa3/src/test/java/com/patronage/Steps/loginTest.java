package com.patronage.Steps;

import com.patronage.Pages.LoginPage;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class loginTest implements En {

    WebDriver driver = new ChromeDriver();
    String baseUrl = "automationpractice.com/index.php?controller=authentication&back=my-account;";
    LoginPage gp = PageFactory.initElements(driver, LoginPage.class);

    public loginTest() {
        After(Scenario -> {
            driver.quit();
        });

        Given( "^User is on login page$", () -> {
            driver.get("http://" + baseUrl);
        });


        When("^User writes ([^\"]*) and ([^\"]*)$", (String email, String password) -> {
            gp.getWriteEmail().sendKeys(email);
            gp.getWritePassword().sendKeys(password);
            gp.getButton().click();
        });


        Then("^User log to his online shop account$", () ->{
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOf(gp.getAccountPage()));
        });


        Then("^User see error$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOf(gp.getDangrAccount()));
        });


    }

}

package com.patronage.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy(how = How.ID_OR_NAME, using = "email" )
    private WebElement writeEmail;

    @FindBy(how = How.ID_OR_NAME, using = "passwd" )
    private WebElement writePassword;

    @FindBy( how = How.ID_OR_NAME, using ="SubmitLogin")
    private WebElement button;

    @FindBy ( how = How.CLASS_NAME, using = "info-account")
    private WebElement AccountPage;

    @FindBy ( how = How.CLASS_NAME, using = "alert-danger")
    private WebElement DangerAccount;



    public WebElement getWriteEmail() {
        return writeEmail;
    }
    public WebElement getWritePassword() {
        return writePassword;
    }
    public WebElement getButton() {
        return button;
    }
    public WebElement getAccountPage() { return AccountPage;}
    public WebElement getDangrAccount() { return DangerAccount; }
}

package com.patronage.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchForm {

    @FindBy(how = How.ID_OR_NAME, using ="search_query_top")
    private WebElement searchField;

    @FindBy(how = How.ID_OR_NAME, using ="submit_search")
    private WebElement searchButton;

    @FindBy(how = How.CLASS_NAME, using ="lighter")
    private WebElement results;

    @FindBy(how = How.XPATH, using ="//*[contains(text(),'1 result has been found.')]")
    private WebElement OneElement;




    public WebElement getSearchField () {return searchField; }
    public WebElement getSearchButton () { return searchButton; }
    public WebElement getOneElement () { return OneElement; }
    public WebElement getResults() { return results; }
}

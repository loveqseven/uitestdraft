package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Page object representing github login page.
 */
public class SearchResultsPage extends Base<SearchResultsPage> {

    @FindBy(className = "sort")
    WebElement sortButton;

    @FindBy(id = "sortByName")
    WebElement sortByName;

    @FindBy(id= "sortByPrice")
    WebElement sortByPrice;

    @Override
    protected ExpectedCondition getPageLoadCondition() {
        return ExpectedConditions.visibilityOf(sortButton);
    }

    @Override
    public String getPageUrl() {
        return "/search";
    }

    public void sortByNameavtion() {
        sortButton.click();
        sortByName.click();
    }

    public void sortByPriceAction() {
        sortButton.click();
        sortByPrice.click();
    }

}
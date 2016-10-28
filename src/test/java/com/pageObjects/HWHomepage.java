package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HWHomepage extends Base<HWHomepage> {

    @FindBy(name = "search_keywords")
    WebElement searchField;

    @FindBy(css = "[type='submit']")
    WebElement searchButton;


    @FindBy(css  = "suggestion")
    WebElement suggestResult;

    @Override
    protected ExpectedCondition getPageLoadCondition() {
        return ExpectedConditions.titleContains("Hostels Worldwide - Online Hostel Bookings, Ratings and Reviews");
    }

    @Override
    public String getPageUrl() {
        return "";
    }

    public SearchResultsPage search(String keyword) {
        searchField.sendKeys(keyword);
        suggestResult.click();
        searchButton.click();
        return new SearchResultsPage();
    }

    public HWHomepage open() {
        return new HWHomepage().openPage(HWHomepage.class);
    }

}
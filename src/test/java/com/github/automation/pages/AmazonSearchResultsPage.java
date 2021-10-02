package com.github.automation.pages;

import com.github.automation.util.SeleniumUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class AmazonSearchResultsPage extends SeleniumUtility {

    @FindBy(xpath = "//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']")
    private List<WebElement> AmazonSearchResults_ProductName;

    static AmazonSearchResultsPage instance = null;

    public static AmazonSearchResultsPage getInstance() {

        if (instance == null) {
            instance = new AmazonSearchResultsPage();
        }
        return instance;

    }

    public void getFirstAmazonSearchResult() {
        Assert.assertTrue(AmazonSearchResults_ProductName.size() > 0, "Couldn't fetch results");
        System.out.println(AmazonSearchResults_ProductName.get(0).getText());
    }

}

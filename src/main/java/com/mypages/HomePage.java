package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private By header= By.className("private-page title");

    public String getHomePageHeader()
    {
        return getPageHeader(header);
    }
    public HomePage(WebDriver driver) {
        super(driver);
    }

}

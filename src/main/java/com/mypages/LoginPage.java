package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public WebElement getEmailId() {
        return getElement(emailId);
    }

    public WebElement getPassword() {
        return getElement(password);
    }

    public WebElement getLoginButton() {
        return getElement(loginButton);
    }

    public String getLoginPageTitle()
    {
        return getPageTitle();
    }
    //method overloading example
    public HomePage doLogin(String username, String password)
    {
        getEmailId().sendKeys(username);
        getPassword().sendKeys(password);
        getLoginButton().click();
        return getInstance(HomePage.class);
    }
    //method overloading example
    public void doLogin()
    {
        getEmailId().sendKeys();
        getPassword().sendKeys();
        getLoginButton().click();
    }
    private By emailId = By.id("username");
    private By password = By.id("password");

    private By loginButton = By.id("loginBtn");


    public LoginPage(WebDriver driver) {
        super(driver);
    }
}

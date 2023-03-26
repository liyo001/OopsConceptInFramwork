package com.MyTests;

import com.mypages.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import com.mypages.Page;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import com.mypages.BasePage;

public class BaseTest {

    WebDriver driver;

    public Page page;

    @BeforeMethod
    @Parameters(value = {"browser"})
    public void setUpTest(String browser) {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("FF")) {

            WebDriverManager.chromedriver().setup();
            driver = new FirefoxDriver();
        } else {
            System.out.println("no browser define in xml file.");
        }
        driver.get("https://www.google.com");
        page= new BasePage(driver);
    }


    @AfterMethod

    public void tearDown()
    {
        driver.quit();
    }


}

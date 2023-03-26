package com.MyTests;

import com.mypages.HomePage;
import com.mypages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest
{
    @Test
    public void verifyLoginPageTitileTest()
    {
        String title=page.getInstance(LoginPage.class).getLoginPageTitle();
        Assert.assertEquals(title,"the hub");
    }

    @Test
    public void doLoginTest()
    {
        HomePage pageref =page.getInstance(LoginPage.class).doLogin("tarun","12345");
        String header=pageref.getHomePageHeader();
        Assert.assertEquals(header,"the hub");
    }


}

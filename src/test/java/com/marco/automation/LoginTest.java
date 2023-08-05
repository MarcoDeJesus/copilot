package com.marco.automation;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.marco.automation.common.BaseTest;
import com.marco.automation.pageobjects.LoginPage;

import org.testng.annotations.BeforeTest;

public class LoginTest extends BaseTest{

    private LoginPage loginPage;

    @BeforeTest
    public void initializeSauceLabPage(){
        this.loginPage = new LoginPage(driver);
    }

    @Test
    public void GivenAValidUserNameAndPassword_WhenLogin_HomePageIsLoaded() {
        String expected = "Swag Labs";
        
        loginPage.login("standard_user", "secret_sauce");
        String actual = loginPage.getPageTitle();

        Assert.assertEquals("The page title is incorrect.", expected, actual);
    }
}

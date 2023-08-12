package com.marco.automation.webui;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.marco.automation.pageobjects.HomePage;
import com.marco.automation.pageobjects.LoginPage;
import com.marco.automation.webui.common.BaseTest;

@Listeners(com.marco.automation.utils.listeners.TestReport.class)
public class LoginTest extends BaseTest{

    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeMethod
    public void initializeSauceLabPage(){
        this.loginPage = new LoginPage(driver);
    }

    @AfterMethod
    public void afterTest() {
        this.loginPage = this.homePage.logout();
    }

    @Test
    public void GivenAValidUserNameAndPassword_WhenLogin_HomePageIsLoaded() {
        String expected = "Swag Labs";
        
        homePage = loginPage.login("standard_user", "secret_sauce");
        String actual = homePage.getPageTitle();

        Assert.assertEquals(actual, expected,  "The page title is incorrect.");
    }

    @Test
    public void GivenAValidUserNameAndPassword_WhenLogin_HomePageIsLoaded2() {
        String expected = "Swag Labs";
        
        homePage = loginPage.login("standard_user", "secret_sauce");
        String actual = homePage.getPageTitle();

        Assert.assertEquals(actual, expected,  "The page title is incorrect.");
    }
}
 
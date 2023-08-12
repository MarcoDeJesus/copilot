package com.marco.automation.webui;

import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.marco.automation.pageobjects.HomePage;
import com.marco.automation.pageobjects.LoginPage;
import com.marco.automation.webui.common.BaseTest;

public class LoginTest extends BaseTest{

    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeTest
    public void initializeSauceLabPage(){
        this.loginPage = new LoginPage(driver);
    }

    @AfterTest
    public void afterTest() {
        this.loginPage = this.homePage.logout();
    }

    @Test
    public void GivenAValidUserNameAndPassword_WhenLogin_HomePageIsLoaded() {
        String expected = "Swag Labs";
        
        homePage = loginPage.login("standard_user", "secret_sauce");
        String actual = homePage.getPageTitle();

        Assert.assertEquals("The page title is incorrect.", expected, actual);
    }

    @Test
    public void GivenAValidUserNameAndPassword_WhenLogin_HomePageIsLoaded2() {
        String expected = "Swag Labs";
        
        homePage = loginPage.login("standard_user", "secret_sauce");
        String actual = homePage.getPageTitle();

        Assert.assertEquals("The page title is incorrect.", expected, actual);
    }
}
 
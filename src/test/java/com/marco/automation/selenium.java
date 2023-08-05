package com.marco.automation;

//import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class selenium {
    static LoginPage loginPage;

    @BeforeSuite
    public static void beforeSuite(){
        loginPage = new LoginPage();
    }

    @AfterSuite
    public static void afterSuite(){
        loginPage.close();
    }

    @Test
    public void test() {
        String expected = "Swag Labs";

        String actual = loginPage.getPageTitle();

        Assert.assertEquals("The page title is incorrect.", expected, actual);
    }

}

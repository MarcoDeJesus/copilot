package com.marco.automation;

//import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.testng.annotations.Test;

public class selenium {

    @Test
    public void test() {
        
        LoginPage loginPage = new LoginPage();
        String loginPageTitle = loginPage.getPageTitle();

        String expected = "Swag Labs";
        Assert.assertEquals("The page title is incorrect.", expected, loginPageTitle);

        // Close the browser
        loginPage.close();
    }

}

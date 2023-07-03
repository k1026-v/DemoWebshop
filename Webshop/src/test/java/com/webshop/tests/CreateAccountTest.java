package com.webshop.tests;

import com.webshop.model.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase{

    /*@Test
    public void isLoginElementExist() {

        //app.getHeader().clickOnRegisterLink();
        }*/


    @BeforeMethod
    public void ensurePrecondition(){

        if (!app.getHeader().isRegisterLinkPresent()){
            app.getHeader().clickOnSignOutLink();
        }
        app.getHeader().clickOnRegisterLink();
    }

    @Test
    public void existedUserRegistrationNegativeTest(){

        app.getUser().fillLoginRegistrationForm(new User()
                .setFirstName("Kate")
                .setLastName("Ivanova")
                .setEmail("k_iv07@ukr.net")
                .setPassword("12345678")
                .setPassword("12345678"));

        app.getUser().clickOnRegisterButton();

        Assert.assertTrue(app.getHeader().isLogOutLinkPresent());

    }

}

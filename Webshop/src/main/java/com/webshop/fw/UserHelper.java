package com.webshop.fw;

import com.webshop.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper{
    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnRegisterButton() {
        click(By.id("register-button"));
    }

    public void fillLoginRegistrationForm(User user) {
        type(By.id("FirstName"), user.getFirstName());
        type(By.id("LastName"), user.getLastName());
        type(By.xpath("//*[@id='Email']"), user.getEmail());
        type(By.xpath("//*[@id='Password']"), user.getPassword());
        type(By.xpath("//*[@id='ConfirmPassword']"), user.getPassword());

    }

    public void clickOnLoginButton() {
        click(By.name("login"));
    }
}

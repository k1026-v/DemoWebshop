package com.webshop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderHelper extends BaseHelper{

    public HeaderHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isRegisterLinkPresent() {
        return isElementPresent(By.cssSelector("[href='/register']"));
    }

    public boolean isLogOutLinkPresent() {
        return isElementPresent(By.xpath("//*[@href='/logout']"));
    }

    public void clickOnSignOutLink() {
        click(By.cssSelector("[href='/logout']"));
    }

    public void clickOnRegisterLink() {
        click(By.cssSelector("[href='/register']"));
    }







   /* public boolean isSignOutButtonPresent() {
        return isElementPresent1(By.xpath("//button[.='Sign Out']"));
    }

    public void cklickOnAddLink() {
        click(By.cssSelector("[href='/add']"));
    }

    public boolean isLogoPresent() {
        return isElementPresent1(By.xpath("//h1[text()='PHONEBOOK']"));
    }

    public boolean isHomeLinkPresent() {
        return isElementPresent1(By.xpath("//a[text()='HOME']"));
    }

    public boolean isAboutLinkPresent() {
        return isElementPresent1(By.xpath("//a[text()='ABOUT']"));
    }*/

}

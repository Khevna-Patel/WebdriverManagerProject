package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    private By _register = By.cssSelector("li > a.ico-register");
    public void clickOnRegister(){
        //click on register
        clickOnElement(_register);
    }
}

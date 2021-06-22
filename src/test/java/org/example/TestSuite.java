package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest{
    HomePage homePage=new HomePage();
@Test
public void UserShouldAbleToClickOnRegister(){
    homePage.clickOnRegister();
}

}

package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils{
//creating object
    BrowserSelectore browserSelectore = new BrowserSelectore();
@BeforeMethod
    public void openBrowser(){
    //calling object
    browserSelectore.selectBrowser();
    //open url
    driver.get("https://demo.nopcommerce.com/");
}

@AfterMethod
    public void closeBrowser(){
    //close the browser
    driver.quit();
}
}

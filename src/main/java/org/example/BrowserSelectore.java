package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserSelectore extends BasePage{

LoadProperty loadProperty = new LoadProperty();

    public void selectBrowser() {

         String browserName = loadProperty.getProperty("browserName");

        switch (browserName) {

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

                default:
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();

        }

    }
}

package com.dilu.testcase1;

import com.dilu.constants.FrameworkConstant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        System.setProperty("WebDriver.chrome.driver", FrameworkConstant.getCHROMEPATH());
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}

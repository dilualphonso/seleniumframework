package com.dilu.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class HomePage extends BaseTest
{

    private HomePage(){

    }

    @Test
    public void test3(){
        driver.findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);

    }
}

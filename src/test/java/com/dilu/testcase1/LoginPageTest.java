package com.dilu.testcase1;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

private LoginPageTest(){

}
@Test
public void test1(){
    driver.findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);

    }


    @Test
    public void test2(){
        driver.findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);

    }
}

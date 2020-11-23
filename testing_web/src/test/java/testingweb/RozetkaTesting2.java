package testingweb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RozetkaTesting2 extends TestBase{


    @Test
    public void testingRozetka2() {
        testCase2();
    }



    public static void testCase2() {
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iPhone" + Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".catalog-settings__sorting > select")).click();
        driver.findElement(By.xpath("//option[@value='1: cheap']")).click();
    }

}
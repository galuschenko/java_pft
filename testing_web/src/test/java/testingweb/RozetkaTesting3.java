package testingweb;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RozetkaTesting3 extends TestBase {

    @Test
    public void testingRozetka1() {
        testCase4();
    }


    public static void testCase4() {
        driver.findElement(By.xpath("//a[@class='header-topline__user-link link-dashed']")).click();
        //driver.findElement(By.xpath("//input[@id='auth_email']")).sendKeys("galuschenko@gmail.com");
        //driver.findElement(By.xpath("//input[@id='auth_pass']")).sendKeys("Towel62742000");
        driver.findElement(By.xpath("//button[@class='button button--large button--green auth-modal__submit']")).submit();
        String errorMessage = driver.findElement(By.xpath("//p[@class='error-message']")).getAttribute("text");
        System.out.println("Error massage: " + errorMessage);
    }

}
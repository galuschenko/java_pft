package testingweb;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class RozetkaTesting1 extends TestBase{

    @Test
    public void testingRozetka1() {


            driver.get("http://rozetka.com.ua");
            String finderPlaceholder = driver.findElement(By.xpath("//input[@name='search']")).getAttribute("placeholder");
            System.out.println(finderPlaceholder);
            String finderText = driver.findElement(By.xpath("//input[@name='search']")).getAttribute("value");
            System.out.println(finderText);
            driver.findElement(By.xpath("//input[@name='search']")).sendKeys("qwerty");
            finderText = driver.findElement(By.xpath("//input[@name='search']")).getAttribute("value");
            System.out.println(finderText);
        }



    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        TestBase.driverSetup();
        TestBase.rozetkaStart();
    }


    /*

    public static void testCase3() {
        List<WebElement> randomGoods = driver.findElements(By.xpath("//a[@class='tile__title']"));
        int randomNumber = getRandomIntegerBetweenRange(0, 10);
        String randomGoodsName = randomGoods.get(randomNumber).getAttribute("title");
        System.out.println("Name of the last viewed goods - " + randomGoodsName);
        randomGoods.get(randomNumber).click();
        driver.get("https://rozetka.com.ua/");
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String lastViewedGoods = driver.findElement(By.xpath("//h2[text()=' Последние просмотренные товары ']/following::ul[1]/li[1]//a[@class='tile__title']")).getAttribute("title");
        System.out.println("Name of the last viewed goods again - " + lastViewedGoods);
    }

     */


    /* public static void restartTestCase() {
        driver.get("https://rozetka.com.ua/");

    }


    public static int getRandomIntegerBetweenRange(double min, double max) {
        double x = (Math.random() * ((max - min) + 1)) + min;
        return (int) x;
    }

    */
}

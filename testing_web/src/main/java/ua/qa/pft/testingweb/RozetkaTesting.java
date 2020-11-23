package ua.qa.pft.testingweb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class RozetkaTesting {
    static WebDriver driver;

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        driverSetup();
        testCase1();
        restartTestCase();
        testCase2();
        restartTestCase();
        // System.setOut(new PrintStream(System.out, true, "UTF-8"));
        // testCase3();
        //restartTestCase();
        testCase4();
        quit();
    }

    public static void testCase1() {
        rozetkaStart();
        String finderPlaceholder = driver.findElement(By.xpath("//input[@name='search']")).getAttribute("placeholder");
        System.out.println(finderPlaceholder);
        String finderText = driver.findElement(By.xpath("//input[@name='search']")).getAttribute("value");
        System.out.println(finderText);
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("qwerty");
        finderText = driver.findElement(By.xpath("//input[@name='search']")).getAttribute("value");
        System.out.println(finderText);


    }

    private static void quit() {
        driver.quit();
    }

    public static void testCase2(){
        rozetkaStart();
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iPhone"+ Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".catalog-settings__sorting > select")).click();
        driver.findElement(By.xpath("//option[@value='1: cheap']")).click();
    }

    public static void testCase3(){
        List<WebElement> randomGoods = driver.findElements(By.xpath("//a[@class='tile__title']"));
        int randomNumber = getRandomIntegerBetweenRange(0,10);
        String randomGoodsName = randomGoods.get(randomNumber).getAttribute("title");
        System.out.println("Name of the last viewed goods - "+ randomGoodsName);
        randomGoods.get(randomNumber).click();
        driver.get("https://rozetka.com.ua/");
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String lastViewedGoods = driver.findElement(By.xpath("//h2[text()=' Последние просмотренные товары ']/following::ul[1]/li[1]//a[@class='tile__title']")).getAttribute("title");
        System.out.println("Name of the last viewed goods again - "+ lastViewedGoods);
    }

    public static void testCase4(){
        driver.findElement(By.xpath("//a[@class='header-topline__user-link link-dashed']")).click();
        //driver.findElement(By.xpath("//input[@id='auth_email']")).sendKeys("galuschenko@gmail.com");
        //driver.findElement(By.xpath("//input[@id='auth_pass']")).sendKeys("Towel62742000");
        driver.findElement(By.xpath("//button[@class='button button--large button--green auth-modal__submit']")).submit();
        String errorMessage = driver.findElement(By.xpath("//p[@class='error-message']")).getAttribute("text");
        System.out.println("Error massage: " + errorMessage);
    }



    private static void driverSetup() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        driver = new FirefoxDriver();
    }


    public static void rozetkaStart() {
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");
    }

    public static void restartTestCase(){
        driver.get("https://rozetka.com.ua/");

    }
    public static int getRandomIntegerBetweenRange(double min, double max){
        double x = (Math.random()*((max-min)+1))+min;
        return (int) x;
    }
}

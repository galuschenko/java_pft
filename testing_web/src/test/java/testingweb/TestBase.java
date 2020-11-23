package testingweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TestBase {

    static WebDriver driver;

    public static void quit() {
        driver.quit();
    }

    static void driverSetup() {
        String browser = BrowserType.CHROME;
        if (browser == BrowserType.FIREFOX) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Александр\\Documents\\GitHub\\java_pft\\testing_web\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        if (browser == BrowserType.CHROME) {
            System.setProperty("webdriwer.chrome.driver", "C:\\Users\\Александр\\Documents\\GitHub\\java_pft\\testing_web\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        if (browser == BrowserType.EDGE) {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\Александр\\Documents\\GitHub\\java_pft\\testing_web\\msedgedriver.exe");
            driver = new EdgeDriver();
        }
        else {
            System.out.println("Данный браузер не установлен, используется браузер по умолчанию - Firefox");
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Александр\\Documents\\GitHub\\java_pft\\testing_web\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
    }

    public static void rozetkaStart() {
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws UnsupportedEncodingException {
       // System.setOut(new PrintStream(System.out, true, "UTF-8"));
        TestBase.driverSetup();
        TestBase.rozetkaStart();
    }

    @AfterMethod
    public void quitTest() {
        TestBase.quit();
    }

    private void load(File propertiesFile) throws IOException {
        FileInputStream input = new FileInputStream(propertiesFile);
        input.read();
    }

}

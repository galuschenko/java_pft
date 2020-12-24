package testingweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrestaShopTesting1 extends TestBase {

    @Test
    public void testingPrestaShop() {

        driver.get("http://prestashop.qatestlab.com.ua/ru/");
        driver.findElement(By.xpath("//a[@title='Women']")).click();
        driver.findElement(By.xpath("//select[@id='selectProductSort']")).click();
        driver.findElement(By.xpath("//select[@id='selectProductSort']/child::option[@value='price:asc']")).click();
        String a = driver.findElement(By.xpath("//div[@class='right-block']/descendant::div[@class='content_price']/descendant::span[@class='price product-price']")).getText();
        List<WebElement> priceList = new ArrayList<WebElement>();
        priceList = driver.findElements(By.xpath("//div[@class='right-block']/descendant::div[@class='content_price']/descendant::span[@class='price product-price']"));
        List<Float> priceListFloat = new ArrayList<Float>();

        for (int i = 0; i < (priceList.size()); i++) {
            String price = priceList.get(i).getText();
            System.out.println(i + ")" + "   " + price);
        }
        for (int i = 0; i < (priceList.size()); i++) {
            String prices = priceList.get(i).getText().replace(",", ".")
                    .replace("₴", "").replace("$", "").trim();

            System.out.println("===============================================");
            Float price = Float.valueOf(prices);
            System.out.println(price);
            priceListFloat.add(price);

        }
        System.out.println("===============================================");
        for (int i = 1; i < priceListFloat.size() - 1; i++) {
            if (priceListFloat.get(i) < priceListFloat.get(i - 1)) {
                System.out.println("Сортировка по цене не верна: " + priceListFloat.get(i) + " && " + priceListFloat.get(i - 1));
                System.out.println("The right algorithm is: ");
                Collections.sort(priceListFloat);
                for (float rightListSorting : priceListFloat) {
                    System.out.println("===============================================");
                    System.out.println(rightListSorting);
                }
                System.out.println("===============================================");
                break;
            }

        }
    }
}




/**TODO
* If price sorting doesn't meet requirements do a sort algorithm for not sorted elements
* */

//            char priceChar[] = price.toCharArray();



//            for (int c = 0; c < (priceChar.length - 1); c++) {
//                String priceCharcontainer = null;
//                if (priceChar[c] == ',' | priceChar[c] == '.') {
//                    priceCharcontainer = priceCharcontainer + priceChar[c];
//                }
//                if ((Character.getNumericValue(priceChar[c]) >= 0 && (Character.getNumericValue(priceChar[c]) < 10))) {
//                    priceCharcontainer = priceCharcontainer + priceChar[c];
//                }
//                System.out.println(priceCharcontainer);
//            }
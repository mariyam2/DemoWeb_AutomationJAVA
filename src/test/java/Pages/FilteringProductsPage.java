package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static Utilities.configBrowser.driver;

public class FilteringProductsPage {

    public static String clickOnFilter = "//select[@class='product_sort_container']";
    public static String selectFilter = "//option[@value='lohi']";
    public static String priceFilterClass = "inventory_item_price";


    public static void clickFilter() throws InterruptedException {
        driver.findElement(By.xpath(clickOnFilter)).click();
        Thread.sleep(6000);

    }

    public static void doSelectFilter() throws InterruptedException {
        driver.findElement(By.xpath(selectFilter)).click();
        Thread.sleep(6000);

    }

    public static void verifyPriceFilter() throws InterruptedException {

        List<WebElement> priceElements = driver.findElements(By.className(priceFilterClass));

        // store prices in list
        List<Double> prices = new ArrayList<>();

        for (int i = 0; i < priceElements.size(); i++) {
            WebElement priceElement = priceElements.get(i);
            String priceText = priceElement.getText();

            // Convert prices as string to double
            double price = Double.parseDouble(priceText.replace("$", ""));
            prices.add(price);
            System.out.println("Item " + (i + 1) + " Price is: $" + price);
        }
        // Check if prices are in ascending order
        for (int j = 0; j < prices.size() - 1; j++) {
            Assert.assertTrue("Prices are not in ascending order.", prices.get(j) <= prices.get(j + 1));
        }

        // print success message, if above condition pass
        System.out.println("Prices are in ascending order.");
    }
}



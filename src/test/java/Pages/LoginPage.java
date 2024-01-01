package Pages;
import Utilities.configBrowser;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static java.lang.Boolean.TRUE;

public class LoginPage extends configBrowser{

    public static String usernameByID = "user-name";
    public static String passwordByID = "password";
    public static String loginButton = "login-button";

    public static void doLogin(String uname, String password) throws InterruptedException{
        driver.findElement(By.id(usernameByID)).sendKeys(uname);
        driver.findElement(By.id(passwordByID)).sendKeys(password);
        driver.findElement(By.id(loginButton)).click();
        Thread.sleep(2000);

    }
    public static void isOnProductPage() {
        String productIsPresent = String.valueOf(driver.getPageSource().contains("Products"));
        if (productIsPresent.equals(String.valueOf(TRUE))){
            Assertions.assertTrue(driver.getPageSource().contains("Products"));
            System.out.println("User successfully logins");
        }
}}

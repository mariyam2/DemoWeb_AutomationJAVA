package Utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import Utilities.configBrowser;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

    public static configBrowser driver;
    public static ChromeOptions options;

    @Before
    public void setUp() {
        driver = new configBrowser();
    }

    @After
    public void tearDown() {
        driver.quit();
        System.out.println("I am inside After Step and Closing the browser");
    }

}


//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//
//import static Utilities.configBrowser.driver;
//
//public class Hooks {
//
//    @Before
//    public void setUp() {
//        // Check if the driver is already initialized
//        if (driver == null) {
//            // If not, initialize the driver
//            driver = new configBrowser().driver;
//        }
//    }
//
//    @After
//    public void tearDown() {
//        // Check if the driver is initialized
//        //if (configBrowser.driver != null) {
//            // If initialized, quit the driver
//           driver.quit();
//            System.out.println("I am inside After Step and Closing the browser");
//      //  }
//    }
//}

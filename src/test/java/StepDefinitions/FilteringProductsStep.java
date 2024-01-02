package StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Pages.FilteringProductsPage.*;

public class FilteringProductsStep {

@When("user clicks on filter")
    public static void userClicksOnFilter() throws InterruptedException{
     clickFilter();
     Thread.sleep(2000);
}


    @Then("user will select filter as low to high")
    public static void selectFilter() throws InterruptedException{
    doSelectFilter();
}

    @Then("verifies that the product prices are in correct order")
    public void verifyFilterSorting() throws InterruptedException{
    verifyPriceFilter();
    }
}




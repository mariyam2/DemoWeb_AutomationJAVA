package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static Pages.LoginPage.*;
public class LoginStep {

    @Given("^User Logins with (.*) and (.*)$")
    public void loginUserPassword(String uname, String password) throws InterruptedException{
        doLogin(uname,password);
        Thread.sleep(200);


    }

    @Then("User lands on Product menu Page")
    public void userLandsOnProductMenuPage() {
        isOnProductPage();

    }
}

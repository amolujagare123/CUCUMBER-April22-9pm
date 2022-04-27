package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubscribeSD {

    @Given("^I am on subscription page$")
    public void i_am_on_subscription_page() throws Throwable {
        System.out.println("I am on subscription page");
    }

    @When("^I enter (.+) , (.+),(.+)$")
    public void i_enter_(String name, String email, String phone) throws Throwable {
        System.out.println("name="+name);
        System.out.println("email="+email);
        System.out.println("phone="+phone);
    }

    @Then("^User should be subscribed$")
    public void user_should_be_subscribed() throws Throwable {

        System.out.println("User should be subscribed");
    }

}

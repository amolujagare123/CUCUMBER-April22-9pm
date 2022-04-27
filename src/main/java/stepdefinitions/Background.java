package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Background {

    @Given("^open the browser$")
    public void open_the_browser() throws Throwable {
        System.out.println("=========>>>open the browser");
    }

    @And("^maximize it$")
    public void maximize_it() throws Throwable {
        System.out.println("=========>>>maximize it");

    }
}

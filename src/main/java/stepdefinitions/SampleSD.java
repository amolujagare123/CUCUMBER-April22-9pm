package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSD {
    //WebDriver driver;

    @Given("I am on login page")
    public void i_am_on_login_page() {
        System.out.println("I am on login page");
       /*

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");*/
    }

    @When("I enter correct username and correct password")
    public void i_enter_correct_username_and_correct_password() {
        System.out.println("I enter correct username and correct password");

       /* driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("admin");
*/
    }
    @When("I click on Login button")
    public void i_click_on_login_button() {

        System.out.println("I click on Login button");
        /*driver.findElement(By.xpath("//input[@name='submit']")).click();*/
    }

    @Then("I should be on home page")
    public void i_should_be_on_home_page() {

        System.out.println("I should be on home page");

    /*    String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();

        Assert.assertEquals("This is not a dashboard",expected,actual);*/
    }


    @When("I enter incorrect username and incorrect password")
    public void i_enter_incorrect_username_and_incorrect_password() {
        System.out.println("I enter incorrect username and incorrect password");
    }
    @Then("I there should be an error message")
    public void i_there_should_be_an_error_message() {
        System.out.println("I there should be an error message");
    }


    @When("I enter blank username and blank password")
    public void i_enter_blank_username_and_blank_password() {
        System.out.println("I enter blank username and blank password");
    }
    @Then("I there should be another error message")
    public void i_there_should_be_another_error_message() {
        System.out.println("I there should be another error message");

        Assert.assertEquals("this is wrong error message",true,false);
    }

    @When("I enter {string} and {string}")
    public void i_enter_and(String username, String password) {
        System.out.println("username="+username);
        System.out.println("password="+password);
    }

    /*@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_something_and_something(String strArg1, String strArg2) throws Throwable {

    }*/ // generated using tidy gherkin
}

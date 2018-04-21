package StepDefs;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import FreeCrm.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginSteps {

    WebDriver driver;

    LoginPage logipage;




    @Given("^user is opens browser$")
    public void user_is_opens_browser() throws Throwable
    {
        LoginPage loginpage= new LoginPage();
        loginpage.user_is_opens_browser();

    }

    @Given("^user ids on loginpage$")
    public void user_ids_on_loginpage() throws Throwable
    {  LoginPage loginpage= new LoginPage();
        loginpage.onloginpage();
    }

    @When("^user enters username and password clicks on login button$")
    public void user_enters_username_and_password_clicks_on_login_button() throws Throwable {

        LoginPage loginpage= new LoginPage();
        loginpage.LoginBtnClick();

    }


    @Then("^user should be on homepage$")
    public void user_should_be_on_homepage() throws Throwable {

        LoginPage loginpage= new LoginPage();
        loginpage.user_should_be_on_homepage();

    }


}

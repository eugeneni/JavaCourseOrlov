package FeatureFileSteps;

import singleton.WebDriverSingleton;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginToMailSteps
{
    By usernameLocator = By.name("login");
    By passwordLocator = By.name("pass");
    By loginButtonLocator = By.cssSelector("p > input[type=\"submit\"]");
    By userNameLocator = By.className("user_name");

    final String expUserName = "Евгений";

    final String loginUrl = "http://www.i.ua";

    @Before
    public void before()
    {
        WebDriver driver = WebDriverSingleton.getWebDriverInstance();
    }

    @After
    public void after()
    {
        WebDriverSingleton.closeWebBrowser();
    }

    WebDriver driver = WebDriverSingleton.getWebDriverInstance();
    
    @Given("^Login page is opened$")
    public void login_page_is_opened()
    {
        driver.get(loginUrl);
    }

    @When("^I set login 'oOrel@i\\.ua' and password 'AirJack'$")
    public void i_set_login_oOrel_i_ua_and_password_AirJack()
    {
        driver.findElement(usernameLocator).sendKeys("oOrel@i.ua");
        driver.findElement(passwordLocator).sendKeys("AirJack");
        driver.findElement(loginButtonLocator).click();
    }

    @Then("^User account should be opened$")
    public void user_account_should_be_opened()
    {
        String actUserName = driver.findElement(userNameLocator).getText();
        Assert.assertEquals(expUserName, actUserName);
    }
}

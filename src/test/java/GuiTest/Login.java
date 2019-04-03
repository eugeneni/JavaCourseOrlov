//package GuiTest;
//
//import singleton.WebDriverSingleton;
//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class Login
//{
//    @Test
//    public void AuthorizationToMail()
//    {
//        By usernameLocator = By.name("login");
//        By passwordLocator = By.name("pass");
//        By loginButtonLocator = By.cssSelector("p > input[type=\"submit\"]");
//        By userNameLocator = By.className("user_name");
//
//        final String expUserName = "Евгений";
//
//        final String loginUrl = "http://www.i.ua";
//
//        WebDriver driver = WebDriverSingleton.getWebDriverInstance();
//
//        driver.get(loginUrl);
//
//        driver.findElement(usernameLocator).sendKeys("oOrel@i.ua");
//        driver.findElement(passwordLocator).sendKeys("AirJack");
//        driver.findElement(loginButtonLocator).click();
//
//        String actUserName = driver.findElement(userNameLocator).getText();
//
//        Assert.assertEquals(expUserName, actUserName);
//
//        WebDriverSingleton.closeWebBrowser();
//    }
//}

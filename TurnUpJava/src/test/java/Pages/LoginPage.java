package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    // Page Elements
    By usernameTextbox = By.id("UserName");
    By passwordTextbox = By.id("Password");
    By loginButton = By.cssSelector("input[value='Log in']");

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void navigateToTurnUpPortal()
    {
        driver.get("http://horse.industryconnect.io/Account/Login?ReturnUrl=%2f");
        driver.manage().window().maximize();
    }
    public void loginSteps(String username, String password)
    {
        driver.findElement(usernameTextbox).sendKeys(username);
        driver.findElement(passwordTextbox).sendKeys(password);
    }
    public void clickLoginButton()
    {
        driver.findElement(loginButton).click();
    }
}

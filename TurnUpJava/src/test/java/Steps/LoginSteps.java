package Steps;

import Pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.sql.DriverManager;

import static org.junit.Assert.assertTrue;

public class LoginSteps{

    WebDriver driver;
    LoginPage loginPageObj;

    @Before
    public void SetUp()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/java/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Given("I navigate to TurnUp portal")
    public void iNavigateToTurnUpPortal() {
        // Create login object
        loginPageObj = new LoginPage(driver);
        loginPageObj.navigateToTurnUpPortal();
    }

    @When("I put valid credentials")
    public void iPutValidCredentials() {

        loginPageObj.loginSteps("hari", "123123");
        loginPageObj.clickLoginButton();
    }

    @Then("I should be taken to the Home page")
    public void iShouldBeTakenToTheHomePage() {
        String helloHari = driver.findElement(By.xpath("//*[@id=\"logoutForm\"]/ul/li/a")).getText();

        assertTrue(helloHari.equals("Hello hari!"));
    }



}

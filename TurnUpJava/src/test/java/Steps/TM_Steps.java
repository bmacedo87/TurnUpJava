package Steps;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.TM_Page;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class TM_Steps {

    WebDriver driver;
    LoginPage loginPageObj;
    HomePage homePageObj;
    TM_Page tmPageObj;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/java/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Given("I log into TurnUp portal")
    public void iLogIntoTurnUpPortal() {
        loginPageObj = new LoginPage(driver);
        loginPageObj.loginSteps("hari", "123123");
    }

    @When("I navigate to time and material page")
    public void iNavigateToTimeAndMaterialPage() {
        homePageObj = new HomePage(driver);
        homePageObj.navigateToTM();
    }

    @When("I create a new material record with {string}, {string} and {string}")
    public void iCreateANewMaterialRecordWithAnd(String arg0, String arg1, String arg2) {
        tmPageObj = new TM_Page(driver);
        tmPageObj.createMaterialRecord(arg0, arg1, arg2);
    }

    @Then("I should be able to see a new material record created with {string}, {string} and {string}")
    public void iShouldBeAbleToSeeANewMaterialRecordCreatedWithAnd(String arg0, String arg1, String arg2) throws InterruptedException {
        Thread.sleep(5000);
        tmPageObj.clickGoToLastPageButton();

        // Assertion
        String newCode = tmPageObj.getCode();
        String newDescription = tmPageObj.getDescription();
        String newPrice = tmPageObj.getPrice();

        assertEquals(arg0, newCode);
        assertEquals(arg1, newDescription);
        assertEquals(arg2, newPrice);
    }
}

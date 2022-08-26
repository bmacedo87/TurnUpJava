package Steps;

import Pages.TM_Page;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class TM_Steps {

    WebDriver driver;
    TM_Page tmPageObj;
    @Given("I log into TurnUp portal")
    public void iLogIntoTurnUpPortal() {
    }

    @When("I navigate to time and material page")
    public void iNavigateToTimeAndMaterialPage() {
    }

    @When("I create a new material record with {string}, {string} and {string}")
    public void iCreateANewMaterialRecordWithAnd(String arg0, String arg1, String arg2) {
    }

    @Then("I should be able to see a new material record created")
    public void iShouldBeAbleToSeeANewMaterialRecordCreated() {
    }



}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    By administrationTab = By.xpath("/html/body/div[3]/div/div/ul/li[5]/a/span");
    By tmOption = By.xpath("/html/body/div[3]/div/div/ul/li[5]/ul/li[3]/a");

    public void navigateToTM()
    {
        driver.findElement(administrationTab).click();
        driver.findElement(tmOption).click();
    }
}

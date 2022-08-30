package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TM_Page {
    WebDriver driver;

    public TM_Page(WebDriver driver)
    {
        this.driver = driver;
    }

    By createNewButton = By.xpath("//*[@id=\"container\"]/p/a");
    By codeTextbox = By.id("Code");
    By descriptionTextbox = By.id("Description");
    By inputPriceTag = By.xpath("//*[@id=\"TimeMaterialEditForm\"]/div/div[4]/div/span[1]/span/input[1]");
    By priceTextbox = By.id("Price");
    By saveButton = By.id("SaveButton");
    By goToLastPageButton = By.xpath("//*[@id=\"tmsGrid\"]/div[4]/a[4]/span");

    public void createMaterialRecord(String code, String description, String price)
    {
        driver.findElement(createNewButton).click();
        driver.findElement(codeTextbox).sendKeys(code);
        driver.findElement(descriptionTextbox).sendKeys(description);
        driver.findElement(inputPriceTag).click();
        driver.findElement(priceTextbox).sendKeys(price);
        driver.findElement(saveButton).click();
    }

    public void clickGoToLastPageButton()
    {
        driver.findElement(goToLastPageButton).click();
    }

    public String getCode()
    {
        WebElement newCode = driver.findElement(By.xpath("//*[@id=\"tmsGrid\"]/div[3]/table/tbody/tr[last()]/td[1]"));
        return newCode.getText();
    }

    public String getDescription()
    {
        WebElement newDescription = driver.findElement(By.xpath("//*[@id=\"tmsGrid\"]/div[3]/table/tbody/tr[last()]/td[3]"));
        return newDescription.getText();
    }

    public String getPrice()
    {
        WebElement newPrice = driver.findElement(By.xpath("//*[@id=\"tmsGrid\"]/div[3]/table/tbody/tr[last()]/td[4]"));
        return newPrice.getText();
    }


}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    public void CreateMaterialRecord(String code, String description, String price)
    {
        driver.findElement(createNewButton).click();
        driver.findElement(codeTextbox).sendKeys(code);
        driver.findElement(descriptionTextbox).sendKeys(description);
        driver.findElement(inputPriceTag).click();
        driver.findElement(priceTextbox).sendKeys(price);
        driver.findElement(saveButton).click();
    }


}

package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SistersItemPage extends AbstractPage{

    @FindBy(xpath = "//a[@class=\"b-btn basket blue buy\"]")
    private WebElement addToBasket;

    @FindBy(xpath = "//a[@class=\"b-btn\"]")
    private WebElement goToBasket;

    public SistersItemPage (WebDriver driver) {
        super(driver);
    }
    public SistersItemPage addItemToBasket () {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(addToBasket)).click();
        return this;
    }
    public SistersBasketPage goToBasket(){
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(goToBasket)).click();
        return new SistersBasketPage(driver);
    }
}

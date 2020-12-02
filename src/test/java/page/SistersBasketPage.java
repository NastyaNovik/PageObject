package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SistersBasketPage extends AbstractPage{

    @FindBy(xpath = " //input[@class=\"b-select-amount__numb\"]")
    private WebElement countOfItem;
    @FindBy(xpath = " //a[@class=\"b-select-amount__minus js_minus\"]")
    private WebElement minusButton;
    @FindBy(xpath = "//img[@class=\"b-basket-table__img\"]")
    private WebElement itemInBasket;


    public SistersBasketPage (WebDriver driver) {
        super(driver);
    }

    public SistersItemPage goToItemPage(){
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(itemInBasket)).click();
        return new SistersItemPage(driver);
    }
    public String getCountOfItems(){
        return countOfItem.getAttribute("value");
    }
    public SistersBasketPage decreaseItemInBasket() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(minusButton)).click();
        return this;

    }
}


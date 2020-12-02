package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SistersItemsContainerPage extends AbstractPage{

    @FindBy(xpath = "//img[@src=\"/_thumbs/items-product_item/icon-146540.jpg\"]")
    private WebElement chooseDress;

    public SistersItemsContainerPage(WebDriver driver) {
        super(driver);
    }

    public SistersItemPage chooseItem (){
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(chooseDress)).click();
        return new SistersItemPage(driver);
    }
}

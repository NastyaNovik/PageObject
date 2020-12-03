package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SistersHomePage extends AbstractPage{

    private static final String HOMEPAGE_URL="https://sisters.by/";

    @FindBy(xpath = "//input[@class=\"b-header-search\"]")
    private WebElement searchString;

    public SistersHomePage(WebDriver driver) {
        super(driver);
    }

    public SistersHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }
    public SistersItemsContainerPage inputItemArticle(String itemArticle) {
        searchString.click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.visibilityOf(searchString)).sendKeys(itemArticle);
        searchString.sendKeys(Keys.ENTER);
        return new SistersItemsContainerPage(driver);
    }
}

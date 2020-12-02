package test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.SistersHomePage;


public class SistersTests {
    private WebDriver driver;
    private ChromeOptions options;
    @BeforeMethod(alwaysRun = true)
    public void createDriver() {
        ChromeOptions option =new ChromeOptions();
        option.addArguments("--window-size=1600,900");
        driver = new ChromeDriver(option);

    }
    @Test
    public void addItemsToBasketTest(){
        int countOfItems = new SistersHomePage(driver)
                .openPage()
                .inputItemArticle()
                .chooseItem ()
                .addItemToBasket()
                .getCountOfItems();

        Assert.assertEquals(countOfItems, 1);
    }

    @AfterMethod
    public void closeDriver(){
        driver.close();
    }
}

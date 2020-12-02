package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.ArrayList;

public class SistersBasketPage extends AbstractPage{

    @FindBy(xpath = " //input[@name=\"ps_146540_10032\"]")
    private WebElement countOfItem;

    public SistersBasketPage (WebDriver driver) {
        super(driver);
    }
    public int getCountOfItems(){
        ArrayList<WebElement> basketItems=new ArrayList<WebElement>();
        basketItems.add(countOfItem);
        return basketItems.size();
    }
}


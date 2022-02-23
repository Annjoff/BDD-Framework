package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    WebDriver driver;

    @FindBy(xpath="//p[contains(text(),'Total Orders')]")
    public WebElement TotalOrderPanel;
    @FindBy (xpath ="//*[@id=\"app\"]/section[2]/div/div/div[1]/div[1]/div/div[1]/a/p")
    public WebElement TotalOrders;


    public DashboardPage(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    public Boolean ifTotalOrderPanelDisplayed()
    {
        return TotalOrderPanel.isDisplayed();
    }
    public void clickTotalOrders()
    {

        TotalOrders.click();
    }
}

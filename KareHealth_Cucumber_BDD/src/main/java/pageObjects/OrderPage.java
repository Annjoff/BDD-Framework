package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class OrderPage {
    WebDriver driver;
    @FindBy(xpath ="//table[@class='table table-hover grid-table']")
    public WebElement orderTable;

    public OrderPage(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    public String getOrderPageTitle()
    {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath
                ("//table[@class='table table-hover grid-table']")));

        return driver.getTitle();
    }

public Boolean SearchCustomerName() {
    Boolean searchStatus = false;
    WebDriverWait wait = new WebDriverWait(driver, 30);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath
            ("//table[@class='table table-hover grid-table']")));

    List<WebElement> rowCount = orderTable.findElements(By.tagName("tr"));
    rowCount.size();
    //System.out.println(rowCount.size());  number of rows-2
    List<WebElement> colCount = orderTable.findElements(By.tagName("td"));
    colCount.size();
    //System.out.println(colCount.size());    number of columns -10
    for (int i = 2; i <= rowCount.size(); i++) {
        for (int j = 1; j <= colCount.size(); j++) {
            String customerName = driver.findElement(By.xpath("//table[@class='table table-hover grid-table']" +
                    "/tbody/tr/td[6]")).getText();
            if (customerName.equalsIgnoreCase(customerName))
            {

                System.out.println("customer saran present" +" " +customerName);
                searchStatus = true;
                break;
            } else {
                System.out.println(customerName);
                System.out.println("Customer search unsuccessful");
                searchStatus = false;
            }

        }

    }
    return searchStatus;
}
}
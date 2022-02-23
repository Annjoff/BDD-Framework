package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(name = "username")
    public WebElement userName;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;
    public LoginPage(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public void enterUserName(String uName)
    {
        userName.sendKeys(uName);
    }
    public void enterPassword(String pw)
    {
        password.sendKeys(pw);
    }
    public void clickLoginButton()
    {
        loginButton.click();
    }
    public void navigateToUrl(String url)
    {
        driver.navigate().to(url);
    }
    public String getTitle()
    {
        return driver.getTitle();
    }
}


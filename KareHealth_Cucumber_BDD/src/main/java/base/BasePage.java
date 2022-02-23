package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import pageObjects.OrderPage;

public class BasePage {
    public static WebDriver driver;
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static OrderPage orderPage;

    @Before
    public static void driverSetup()
    {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        loginPage= new LoginPage(driver);
        dashboardPage= new DashboardPage(driver);
        orderPage=new OrderPage(driver);
    }
    @After
    public static void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        driver.close();
    }
}



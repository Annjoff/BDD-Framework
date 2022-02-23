package stepDefinition;

import base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

public class steps {
    String LoginPageExpTitle;
    String LoginPageActTitle;
    String DashboardPageActTitle;
    String DashboardPageExpTitle;
    String OrderPageExpTitle;
    String OrderPageActTitle;
    String orderPage;
    Boolean searchStatus=false;


    @Given("I navigated to url {string}")
    public void i_navigated_to_url(String url) {
BasePage.loginPage.navigateToUrl(url);
    }

    @Then("I should be in admin login page with title {string}")
    public void i_should_be_in_admin_login_page_with_title(String LoginPageExpTitle) {
        LoginPageActTitle= BasePage.loginPage.getTitle();

        System.out.println(LoginPageActTitle);
        Assertions.assertEquals(LoginPageActTitle,LoginPageExpTitle);
    }

    @When("I enter username as {string}")
    public void i_enter_username_as(String uName) {
        BasePage.loginPage.enterUserName(uName);
    }

    @When("I enter password as {string}")
    public void i_enter_password_as(String pw) {
        BasePage.loginPage.enterPassword(pw);
    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        BasePage.loginPage.clickLoginButton();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        System.out.println("logged in successfully");
    }
    @Then("I should be logged in successfully and in dashboard page with title {string}")
    public void iShouldBeLoggedInSuccessfullyAndInDashboardPageWithTitle(String DashboardPageExpTitle) {
        DashboardPageActTitle= BasePage.loginPage.getTitle();
        Assertions.assertEquals(DashboardPageActTitle,DashboardPageExpTitle);
    }

    @And("I should see the total order panel displayed")
    public void iShouldSeeTheTotalOrderPanelDisplayed() {
        Assert.assertTrue("Total order panel is displayed", BasePage.dashboardPage.
                ifTotalOrderPanelDisplayed());

    }
    @Given("I am in dashboard page")
    public void iAmInDashboardPage() {
        System.out.println("In dashboard page");
    }
    @And("I click on the total orders")
    public void iClickOnTheTotalOrders() {
        BasePage.dashboardPage.clickTotalOrders();
    }
    @Then("I should be logged in successfully and in dashboard page")
    public void iShouldBeLoggedInSuccessfullyAndInDashboardPage() {
    }

    @Then("I should see order page with title {string}")
    public void iShouldSeeOrderPageWithTitle(String OrderPageExpTitle) {

        OrderPageActTitle= BasePage.orderPage.getOrderPageTitle();
        System.out.println("Order page title is"+"" +
                ""+OrderPageActTitle);
        Assertions.assertEquals(OrderPageActTitle,OrderPageExpTitle);
    }

    @Then("I am navigated to the order page")
    public void iAmNavigatedToTheOrderPage() {
        System.out.println("In order page");
    }

    @And("I should see Order with customer  name {string}")
    public void iShouldSeeOrderWithCustomerName(String CustomerName) {
    searchStatus=BasePage.orderPage.SearchCustomerName();
    Assertions.assertTrue(searchStatus);
        System.out.println("Customer with name"+"" +
                " "+CustomerName+" "+"present in order table");
    }
}


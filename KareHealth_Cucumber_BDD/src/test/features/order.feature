Feature: Orders page feature
  Background:
    Given I navigated to url "http://karehealth.menpaniproducts.com/admin/auth/login"
    Then  I should be in admin login page with title "Admin | Login"
    When  I enter username as "admin"
    And   I enter password as "admin"
    And   I click on the login button
    Then  I should be logged in successfully

  Scenario: Verify if I am in order page
    Given I am in dashboard page
    And   I click on the total orders
    Then  I should see order page with title "Admin | Orders"

  Scenario: Search for customer in orders list

    Then  I should be logged in successfully and in dashboard page
    And  I should see the total order panel displayed
    When  I click on the total orders
    Then  I am navigated to the order page
    And    I should see Order with customer  name "Saran"
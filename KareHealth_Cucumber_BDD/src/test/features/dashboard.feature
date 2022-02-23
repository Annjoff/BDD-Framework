Feature: Dashboard page feature

  Scenario:Verify I can see the total order panel and navigate to it
    Given I navigated to url "http://karehealth.menpaniproducts.com/admin/auth/login"
    Then I should be in admin login page with title "Admin | Login"
    When I enter username as "admin"
    And I enter password as "admin"
    And I click on the login button
    Then I should be logged in successfully and in dashboard page with title "Admin | Dashboard"
    And I should see the total order panel displayed
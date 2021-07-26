Feature: Login

  @Regression @test
  Scenario: valid admin login
    Given user is on SYNTAX HRMS login page
    When user enters valid credentials within Username textbox
    And user enters valid credentials within Password textbox
    And user clicks ‘LOGIN’  button
    Then the Dashboard will display logged in as admin
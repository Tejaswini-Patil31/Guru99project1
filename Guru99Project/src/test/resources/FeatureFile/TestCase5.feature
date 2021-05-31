#Author: Tejaswini B Patil
#26/5/2021
@TestCase_5_Feature
Feature: Verify disabled fields

  @TestCase5
  Scenario Outline: Open Third Browser
    Given the user opens a web browser
    When User enter Url as <URL>
    Then User enters <username> and <password>
    And User Click on Login
    Then close Popup
    When User Mouse Hover on Customers
    Then User Mouse Hover on Manage Customers Menu
    Then Open any customer
    When click on Account Information
    And Verify disabled fields
    And Verify Blank fields
    And close browser

    Examples: 
      | URL                                               | username | password  |
      | http://live.demoguru99.com/index.php/backendlogin | user01   | guru99com |

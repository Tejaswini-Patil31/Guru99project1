#Author: Tejaswini B Patil
#21/5/2021
@TestCase_1_Feature
Feature: Verify invoice can be printed

  @TestCase1
  Scenario Outline: Open First Browser
    Given the user opens a web browser
    When User enter Url as <URL>
    Then User enters <username> and <password>
    And User Click on Login
    And close Popup
    When User Mouse Hover on Sale
    And User Mouse Hover on Orders Menu
    Then select Canceled in Status field
    And Click Search
    When User Select First Order Checkbox
    And Select Print Invoices
    Then Click on Submit
    And Verify the message
    When User select complete field in Status
    And Click Search
    When User Select First Order Checkbox
    And Select Print Invoices
    Then Click on Submit
    And Verify invoice is downloaded
    And close browser

    Examples: 
      | URL                                               | username | password  |
      | http://live.demoguru99.com/index.php/backendlogin | user01   | guru99com |

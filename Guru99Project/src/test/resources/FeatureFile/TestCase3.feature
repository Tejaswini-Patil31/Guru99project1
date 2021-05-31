#Author: Tejaswini B Patil
#24/5/2021
@TestCase_3_Feature
Feature: Verify Sort is working correctly

  @TestCase3
  Scenario Outline: Open First Browser
    Given the user opens a web browser
    When User enter Url as <URL>
    Then User enters <username> and <password>
    And User Click on Login
    Then close Popup
    When User Mouse Hover on Sale in home page
    And User Mouse Hover on Invoice
    Then User sort Invoice date in Ascending and descending order and Verify the sort is working as expected
    And close browser

    Examples: 
      | URL                                               | username | password  |
      | http://live.demoguru99.com/index.php/backendlogin | user01   | guru99com |

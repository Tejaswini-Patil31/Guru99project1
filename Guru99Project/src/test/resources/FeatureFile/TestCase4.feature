#Author: Tejaswini B Patil
#24/5/2021 & #25/5/2021
@TestCase_4_Feature
Feature: Verify Search Functionality

  @TestCase4
  Scenario Outline: Open New Browser
    Given the user opens a web browser
    When User enter Url as <URL>
    When click on Advance serach
    Then In Price field enter range <price1> and <price2>
    And click Search
    Then Verify Price and Product Name in result
    When click on Advance serach
    Then Again In Price field enter range <price3> and <price4>
    And click Search
    Then Verify Price and Product Name in result
    And close browser

    Examples: 
      | URL                                   | price1 | price2 | price3 | price4 |
      | http://live.demoguru99.com/index.php/ |      0 |    150 |    151 |   1000 |

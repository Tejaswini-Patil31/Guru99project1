#Author: Tejaswini B Patil
#20/5/2021
@TestCase_2_Feature
Feature: Verify the product review mechanism

  @TestCase2
  Scenario Outline: Open First Browser
    Given the user opens a web browser
    When User enter URL1 <URL1>
    Then Verify Title of Home Page
    And close browser

    Examples: 
      | URL1                        |
      | http://live.demoguru99.com/ |

  #@TestCase2
  Scenario Outline: Open Second Browser
    Given the user opens a web browser
    When User enter Url2 as <URL2>
    Then Product Page is Open
    And Verify Title of Product Page
    When User Fills Review data
    And Click on Submit button
    Then User is navigated to Product Page
    And close browser

    Examples: 
      | URL2                                                           |
      | http://live.demoguru99.com/index.php/review/product/list/id/1/ |

  #21/5/2021
  @TestCase2
  Scenario Outline: Open Third Browser
    Given the user opens a web browser
    When User enter Url as <URL>
    Then User enters <username> and <password>
    And User Click on Login
    Then close Popup
    When User Mouse Hover on Catalogue
    Then User Mouse Hover on Reviews and Ratings
    And User Mouse Hover on Customer Reviews
    And User Mouse Hover on Pending Reviews Menu
    Then User Sort table by Id
    When User select comment
    Then User click on Edit link
    And User Change status to Approved in Dropdown
    Then User Click on Save Review button
    And close browser

    Examples: 
      | URL                                               | username | password  |
      | http://live.demoguru99.com/index.php/backendlogin | user01   | guru99com |

  
  #21/5/2021
  @TestCase2
  Scenario Outline: Open Fourth Browser
    Given the user opens a web browser
    When User enter URL1 <URL1>
    When User Click on Mobile Menu button
    Then Mobile Menus are shown
    When User click on Sony Xperia image
    Then user is on page of Sony Xperia
    When User click on Review tab button at bottom of page
    Then User Verify the review comment
    And close browser

    Examples: 
      | URL1                        |
      | http://live.demoguru99.com/ |

      
   

Feature: Items displayed

  Scenario Outline: 
    Given click on the login page
    When I enter "<username>" in the user field
    Then I enter "<password>" in the password field
    And the home page is displayed
    Then I enter "<Item>" in the field
    Then I click on the find details
    And  the item is displayed
    
    

    Examples: 
      | username  | password | Item      |
      | Lalitha   | Password123| Headphone |

Feature: Login
  
  
  Scenario Outline: login page
    Given click on the login page
    When I enter "<username>" in the user field
    Then I enter "<password>" in the password field
    And the home page is displayed

    Examples: 
      | username    | password      | 
      | Ruxin12     | nasreen12     | 
      
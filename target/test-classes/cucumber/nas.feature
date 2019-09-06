

Feature: Register in testme app
  I want to use this template for my feature file

 
  Scenario: signup
    Given Open the chrome browser
    And click on the testme app
    When testme app opens
    And click on the signup button
    Then enter username as "Ruxin12" in the userfield
    Then enter firstname as "nasreen" in the selected field
    Then enter last name as "lily" in the selected field
    Then enter password as "nasreen12" in the selected field
    Then enter confirm password as "nasreen12" in the selected field
    Then mark gender as "Female" in the field
    Then enter email as "abc@gmail.com" in field
    Then enter mobile number as "9876543210" in field
    Then enter DOB as "03/01/1998" in selected field
    Then enter Address as "kallakurichi" in field
    Then select security question as "What is your Birth place?" in field
    Then enter answer as "kallakurichi" in field
    And  click on the register button  
  
  
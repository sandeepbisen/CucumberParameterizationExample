Feature: Customer Registration


  Scenario Outline: Validation of the registration form 
    Given I am able to access customer registration form
    When I try to fill in "<customerName>" <age> "<address>" <phoneNumber> and "<email>"
    And I click on Submit
    Then I should be able to navigate to Registered Succesfully page with customer details for "<customerName>"
   
    Examples: 
    | customerName  | age | address | phoneNumber  | email     |
    | testuserOne   | 21  | London  | 789456123    |xyz@xyz.com|
    
    
    Scenario Outline: Validation of the registration form 
    Given I am able to access customer registration form
    When I try to fill in "<customerName>" <age> "<address>" <phoneNumber> and "<email>"
    And I click on Submit
    Then I should be able to see error for "<customerName>"

    Examples: 
    | customerName  | age | address | phoneNumber  | email     |
    | testuserTwo   | 23  | Paris   | 789456128    |xvyxvy.com |
    
      

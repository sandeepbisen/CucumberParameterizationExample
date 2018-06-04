Feature: Customer Registration

@PositiveScenario
  Scenario Outline: Validation of the registration form 
    Given I am able to access customer registration form
    When I am able to fill <customerName>,<age>,<address>, <phoneNumber> and <email> in customer registration form and Submit
    Then I should able to see the expected Result
    Examples: 
    | customerName  | age | address | phoneNumber  | email     		  |
    | User One      | 30  | Pune  	| 111111111    |test1@gmail.com |
    | User Two      | 23  | Mumbai  | 222222222    |test2@xyz.com 	|    
    
@NegativeScenario
  Scenario Outline: Validation of the registration form 
    Given I am able to access customer registration form
    When I am able to fill <customerName>,<age>,<address>, <phoneNumber> and <email> in customer registration form and Submit
    Then I should able to see the expected Result
    Examples: 
    | customerName  | age | address | phoneNumber  | email     		 |
    | User Three    | 30  | Pune  	| 333333333    |test3gmail.com |
    | User Four     | 23  | Mumbai  | Test		     |test4@xyz.com  | 
    
@ResetScenario
  Scenario Outline: Validation of the registration form 
    Given I am able to access customer registration form
    When I am able to fill <customerName>,<age>,<address>, <phoneNumber> and <email> in customer registration form and Submit
    Then I should able to see the expected Result
    Examples: 
    | customerName  | age | address | phoneNumber  | email     		  |
    | User Five     | 30  | Pune  	| 555555555    |test5@gmail.com |      

@Discount
Feature: Giving exclusive discount offers based on the weights of the shipped items or the shipping distance

  Scenario Outline: To give exclusive discount offers
    Given The application is running
    When I enter input of <weight> and <distance>
    And I click on submit 
    Then  I should be able be see the discount offers result
    Examples: 
      | weight | distance |
      |    100 |      200 |
      |     80 |      500 |
      |    120 |      520 |
      |    300 |       20 |

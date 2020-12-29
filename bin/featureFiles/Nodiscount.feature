@Nodiscount
Feature: Not Giving exclusive discount offers based on the weights of the shipped items or the shipping distance

  Scenario Outline: To not give exclusive discount offers
    Given The application is open
    When I give input of <weight> and <distance>
    And I click on submit button
    Then I should be able be see the No discount offers result

    Examples: 
      | weight | distance |
      |     60 |      110 | 
      |     50 |      150 | 

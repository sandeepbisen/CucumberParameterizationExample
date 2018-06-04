
Feature: Shipping Details of Customers
  I want to check and verify shipping details of customers

  
  Scenario Outline: check and verify shipping details of customers
    Given I can see shipment Details for Customers
    When I click on <shipmentId> 
    Then I should be able to see respective name "<CustomerName>" 

    Examples: 
      | shipmentId  | CustomerName | DepartureDate  | ArrivalDate |
      | 6543217     | Maya         | 03/12/2017     |  03/13/2017 |
      | 7465328     | Sri          | 06/01/2017     |  06/03/2017 |
      | 9987653     | Suruthi      | 11/21/2017     |	 11/22/2017 |

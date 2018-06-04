Feature:  Verifying shipment details of User


    Scenario: Verify shipment details of User
    Given the user is on Shipment for user page
    When I enter the below username in search box
    | userName | 
    | Shamili  |
    And Click on search button
    Then The details of User should be displayed


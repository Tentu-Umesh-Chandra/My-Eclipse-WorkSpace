Feature: Car Insurance Flow
  Scenario: Fill car insurance form and capture screenshot
    Given I launch PolicyBazaar
    And I navigate to the car insurance page
    When I select car details
    And I enter car insurance user information
    Then I should capture a screenshot
Feature: Travel Insurance Flow

  Scenario: Retrieve travel insurance quotes
    Given I launch PolicyBazaar
    And I navigate to the travel insurance page
    When I fill in travel insurance details
    And I apply filters and sort results
    Then I should see travel insurance companies and prices
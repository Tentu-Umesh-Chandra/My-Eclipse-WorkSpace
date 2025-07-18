Feature: Health Insurance Menu Check

  Scenario: Verify health insurance menu items
    Given I launch PolicyBazaar
    When I hover on health insurance section
    Then I should list health insurance menu items
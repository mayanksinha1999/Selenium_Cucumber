Feature: Feature to test Google Search functionality

  Scenario: Google Search is working
    Given browser is open
    And user in on google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results

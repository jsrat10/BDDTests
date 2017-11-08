@selenium
  Feature: My Feature
    @regression @sanity
      Scenario: Verify Google.com title
      Given I am on the google.com home page
      Then I verify that title contains Google
@selenium
  Feature: My Feature
    @regression @sanity
      Scenario: Verify Google.com title
      Given I am on the google.com home page
      When I search for java
      Then I verify that search contains java
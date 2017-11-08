$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyFirstTest.feature");
formatter.feature({
  "line": 2,
  "name": "My Feature",
  "description": "",
  "id": "my-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@selenium"
    }
  ]
});
formatter.before({
  "duration": 3118232943,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify Google.com title",
  "description": "",
  "id": "my-feature;verify-google.com-title",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    },
    {
      "line": 3,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the google.com home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I search for java",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify that search contains java",
  "keyword": "Then "
});
formatter.match({
  "location": "MyFirstTest.i_am_on_the_google_com_home_page()"
});
formatter.result({
  "duration": 2081486537,
  "status": "passed"
});
formatter.match({
  "location": "MyFirstTest.i_searchfor_java()"
});
formatter.result({
  "duration": 174091803,
  "status": "passed"
});
formatter.match({
  "location": "MyFirstTest.i_verify_that_search_contains_java()"
});
formatter.result({
  "duration": 1642597095,
  "status": "passed"
});
formatter.after({
  "duration": 74831547,
  "status": "passed"
});
});
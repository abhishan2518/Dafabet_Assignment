$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Unix2Date.feature");
formatter.feature({
  "name": "To convert unix timestamp to Datetime format",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.scenario({
  "name": "To convert unix timestamp to Datetime format",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test"
    },
    {
      "name": "@Test"
    }
  ]
});
formatter.step({
  "name": "User converts the below Unix timestamp to Date format \"1451613802\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.dafabet.automation.steps.TimeStamp.userConvertsTheBelowUnixTimestampToDateFormat(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User converts the Date format to Unix format \"2016-01-01\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.dafabet.automation.steps.TimeStamp.userConvertsTheDateFormatToUnixFormat(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies for invalid timestamp \"invalid\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.dafabet.automation.steps.TimeStamp.userVerifiesForInvalidTimestamp(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});
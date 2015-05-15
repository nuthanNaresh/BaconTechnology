$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/testcases/createNewLocation.feature");
formatter.feature({
  "id": "\u0027new-location-creation\u0027",
  "description": "As a User \r\nI would like to create new location in Smartfocus site\r\nSo that I can verify new location is created succesfully",
  "name": "\u0027New Location Creation\u0027",
  "keyword": "Feature",
  "line": 1
});
formatter.scenarioOutline({
  "id": "\u0027new-location-creation\u0027;creating-new-location-in-smartfocus-site",
  "description": "",
  "name": "Creating New Location In SmartFocus site",
  "keyword": "Scenario Outline",
  "line": 6,
  "type": "scenario_outline"
});
formatter.step({
  "name": "User is on Smart Focus site",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "User clicks on \u0027New\u0027",
  "keyword": "And ",
  "line": 8
});
formatter.step({
  "name": "User clicks on \u0027Location\u0027",
  "keyword": "When ",
  "line": 9
});
formatter.step({
  "name": "New location form should appear",
  "keyword": "Then ",
  "line": 10
});
formatter.step({
  "name": "User fills \u003cName\u003e \u003cMajor\u003e \u003cDescription\u003e \u003cPostcode\u003e \u003cRadius\u003e \u003cCatchment\u003e",
  "keyword": "And ",
  "line": 11
});
formatter.step({
  "name": "User clicks on Create",
  "keyword": "When ",
  "line": 12
});
formatter.step({
  "name": "New location should be created",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "Screen navigates to the new location",
  "keyword": "And ",
  "line": 14
});
formatter.examples({
  "id": "\u0027new-location-creation\u0027;creating-new-location-in-smartfocus-site;",
  "description": "",
  "name": "",
  "keyword": "Examples",
  "line": 16,
  "rows": [
    {
      "id": "\u0027new-location-creation\u0027;creating-new-location-in-smartfocus-site;;1",
      "cells": [
        "Name",
        "Major",
        "Description",
        "Postcode",
        "Radius",
        "Catchment"
      ],
      "line": 17
    },
    {
      "id": "\u0027new-location-creation\u0027;creating-new-location-in-smartfocus-site;;2",
      "cells": [
        "\"Manor Park, London\"",
        "101",
        "\"Manor Park is residential area in the London Borough of Newham\"",
        "\"EC1A 4HD\"",
        "6",
        "10"
      ],
      "line": 18
    }
  ]
});
formatter.before({
  "duration": 2703490981,
  "status": "passed"
});
formatter.scenario({
  "id": "\u0027new-location-creation\u0027;creating-new-location-in-smartfocus-site;;2",
  "description": "",
  "name": "Creating New Location In SmartFocus site",
  "keyword": "Scenario Outline",
  "line": 18,
  "type": "scenario"
});
formatter.step({
  "name": "User is on Smart Focus site",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "User clicks on \u0027New\u0027",
  "keyword": "And ",
  "line": 8
});
formatter.step({
  "name": "User clicks on \u0027Location\u0027",
  "keyword": "When ",
  "line": 9
});
formatter.step({
  "name": "New location form should appear",
  "keyword": "Then ",
  "line": 10
});
formatter.step({
  "name": "User fills \"Manor Park, London\" 101 \"Manor Park is residential area in the London Borough of Newham\" \"EC1A 4HD\" 6 10",
  "keyword": "And ",
  "line": 11,
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ]
});
formatter.step({
  "name": "User clicks on Create",
  "keyword": "When ",
  "line": 12
});
formatter.step({
  "name": "New location should be created",
  "keyword": "Then ",
  "line": 13
});
formatter.step({
  "name": "Screen navigates to the new location",
  "keyword": "And ",
  "line": 14
});
formatter.match({
  "location": "StepDefsNewLocation.user_is_on_Smart_Focus_site()"
});
formatter.result({
  "duration": 5903452143,
  "status": "passed"
});
formatter.match({
  "location": "StepDefsNewLocation.user_clicks_on_New()"
});
formatter.result({
  "duration": 1218153254,
  "status": "passed"
});
formatter.match({
  "location": "StepDefsNewLocation.user_clicks_on_Location()"
});
formatter.result({
  "duration": 274149582,
  "status": "passed"
});
formatter.match({
  "location": "StepDefsNewLocation.new_location_form_should_appear()"
});
formatter.result({
  "duration": 171167426,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Manor Park, London",
      "offset": 12
    },
    {
      "val": "101",
      "offset": 32
    },
    {
      "val": "Manor Park is residential area in the London Borough of Newham",
      "offset": 37
    },
    {
      "val": "EC1A 4HD",
      "offset": 102
    },
    {
      "val": "6",
      "offset": 112
    },
    {
      "val": "10",
      "offset": 114
    }
  ],
  "location": "StepDefsNewLocation.user_fills(String,int,String,String,int,int)"
});
formatter.result({
  "duration": 9640834941,
  "status": "passed"
});
formatter.match({
  "location": "StepDefsNewLocation.user_clicks_on_Create()"
});
formatter.result({
  "duration": 208171385,
  "status": "passed"
});
formatter.match({
  "location": "StepDefsNewLocation.new_location_should_be_created()"
});
formatter.result({
  "duration": 926358643,
  "status": "passed"
});
formatter.match({
  "location": "StepDefsNewLocation.screen_navigates_to_the_new_location()"
});
formatter.result({
  "duration": 3857243,
  "status": "passed"
});
formatter.after({
  "duration": 3935086844,
  "status": "passed"
});
});
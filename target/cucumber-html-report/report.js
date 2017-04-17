$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Sportsbook.feature");
formatter.feature({
  "line": 2,
  "name": "William Hill Sports Book",
  "description": "",
  "id": "william-hill-sports-book",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@acceptance_test"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User can place a bet on an event",
  "description": "",
  "id": "william-hill-sports-book;user-can-place-a-bet-on-an-event",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on sports book page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I login with username \"WHATA_FOG2\" and password \"F0gUaTtest\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I select a \"\u003cevent\u003e\" event",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I select the first active selection",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I place a bet of \"0.05\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the bet should be successfully placed",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "Events for selection",
  "description": "",
  "id": "william-hill-sports-book;user-can-place-a-bet-on-an-event;events-for-selection",
  "rows": [
    {
      "cells": [
        "event"
      ],
      "line": 12,
      "id": "william-hill-sports-book;user-can-place-a-bet-on-an-event;events-for-selection;1"
    },
    {
      "cells": [
        "Football"
      ],
      "line": 13,
      "id": "william-hill-sports-book;user-can-place-a-bet-on-an-event;events-for-selection;2"
    },
    {
      "cells": [
        "Tennis"
      ],
      "line": 14,
      "id": "william-hill-sports-book;user-can-place-a-bet-on-an-event;events-for-selection;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "User can place a bet on an event",
  "description": "",
  "id": "william-hill-sports-book;user-can-place-a-bet-on-an-event;events-for-selection;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@acceptance_test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on sports book page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I login with username \"WHATA_FOG2\" and password \"F0gUaTtest\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I select a \"Football\" event",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I select the first active selection",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I place a bet of \"0.05\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the bet should be successfully placed",
  "keyword": "Then "
});
formatter.match({
  "location": "SportsBookSteps.iAmOnSportsBookPage()"
});
formatter.result({
  "duration": 6976189219,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "WHATA_FOG2",
      "offset": 23
    },
    {
      "val": "F0gUaTtest",
      "offset": 49
    }
  ],
  "location": "SportsBookSteps.iLoginWithUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 7535376572,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Football",
      "offset": 12
    }
  ],
  "location": "SportsBookSteps.iSelectAEvent(String)"
});
formatter.result({
  "duration": 472097105,
  "status": "passed"
});
formatter.match({
  "location": "SportsBookSteps.iSelectTheFirstActiveSelection()"
});
formatter.result({
  "duration": 1984236475,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0.05",
      "offset": 18
    }
  ],
  "location": "SportsBookSteps.iPlaceABetOf(String)"
});
formatter.result({
  "duration": 17540042710,
  "status": "passed"
});
formatter.match({
  "location": "SportsBookSteps.theBetShouldBeSuccessfullyPlaced()"
});
formatter.result({
  "duration": 3058386201,
  "status": "passed"
});
formatter.after({
  "duration": 335277575,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User can place a bet on an event",
  "description": "",
  "id": "william-hill-sports-book;user-can-place-a-bet-on-an-event;events-for-selection;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@acceptance_test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on sports book page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I login with username \"WHATA_FOG2\" and password \"F0gUaTtest\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I select a \"Tennis\" event",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I select the first active selection",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I place a bet of \"0.05\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the bet should be successfully placed",
  "keyword": "Then "
});
formatter.match({
  "location": "SportsBookSteps.iAmOnSportsBookPage()"
});
formatter.result({
  "duration": 1954976860,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "WHATA_FOG2",
      "offset": 23
    },
    {
      "val": "F0gUaTtest",
      "offset": 49
    }
  ],
  "location": "SportsBookSteps.iLoginWithUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 7887790410,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tennis",
      "offset": 12
    }
  ],
  "location": "SportsBookSteps.iSelectAEvent(String)"
});
formatter.result({
  "duration": 1769825842,
  "status": "passed"
});
formatter.match({
  "location": "SportsBookSteps.iSelectTheFirstActiveSelection()"
});
formatter.result({
  "duration": 337620646,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0.05",
      "offset": 18
    }
  ],
  "location": "SportsBookSteps.iPlaceABetOf(String)"
});
formatter.result({
  "duration": 12800158459,
  "status": "passed"
});
formatter.match({
  "location": "SportsBookSteps.theBetShouldBeSuccessfullyPlaced()"
});
formatter.result({
  "duration": 3104485598,
  "status": "passed"
});
formatter.after({
  "duration": 252523650,
  "status": "passed"
});
});
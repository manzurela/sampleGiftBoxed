$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/giftcard.feature");
formatter.feature({
  "line": 1,
  "name": "Gift card smoke test",
  "description": "",
  "id": "gift-card-smoke-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "selecting a gift card",
  "description": "",
  "id": "gift-card-smoke-test;selecting-a-gift-card",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    },
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on gift card page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I tap on Gift Card drop down amount and select  amount",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I select a card type",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I tap on Logn +Continue",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "a Sign In modal should pop up",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I enter my valid \"\u003cemail\u003e\" and \"\u003cpassword\u003e\" in the sign In modal",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should be landed on the Recipient Info section",
  "keyword": "Then "
});
formatter.match({
  "location": "gcardSteps.i_am_on_gift_card_page()"
});
formatter.result({
  "duration": 5255633467,
  "status": "passed"
});
formatter.match({
  "location": "gcardSteps.i_tap_on_Gift_Card_drop_down_amount_and_select_amount()"
});
formatter.result({
  "duration": 459718121,
  "status": "passed"
});
formatter.match({
  "location": "gcardSteps.i_select_a_card_type()"
});
formatter.result({
  "duration": 300101634,
  "status": "passed"
});
formatter.match({
  "location": "gcardSteps.i_tap_on_Logn_Continue()"
});
formatter.result({
  "duration": 144538205,
  "status": "passed"
});
formatter.match({
  "location": "gcardSteps.a_Sign_In_modal_should_pop_up()"
});
formatter.result({
  "duration": 41564285,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cemail\u003e",
      "offset": 18
    },
    {
      "val": "\u003cpassword\u003e",
      "offset": 32
    }
  ],
  "location": "gcardSteps.i_enter_my_valid_and_in_the_sign_In_modal(String,String)"
});
formatter.result({
  "duration": 232574219,
  "status": "passed"
});
formatter.match({
  "location": "gcardSteps.i_should_be_landed_on_the_Recipient_Info_section()"
});
formatter.result({
  "duration": 3596497157,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Gift card is sent immediately",
  "description": "",
  "id": "gift-card-smoke-test;gift-card-is-sent-immediately",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Smoke"
    },
    {
      "line": 14,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I am on the Recipient Info section",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I enter Recipient name, email, sender\u0027s name",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "tap on today\u0027s date",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "tap on time",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "tap on Save+continue button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I am in order review page",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I tap Place Order",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "the gift card Order will be placed",
  "keyword": "Then "
});
formatter.match({
  "location": "gcardSteps.i_am_on_the_Recipient_Info_section()"
});
formatter.result({
  "duration": 37488263,
  "status": "passed"
});
formatter.match({
  "location": "gcardSteps.i_enter_Recipient_name_email_sender_s_name()"
});
formatter.result({
  "duration": 471619050,
  "status": "passed"
});
formatter.match({
  "location": "gcardSteps.tap_on_today_s_date()"
});
formatter.result({
  "duration": 164457306,
  "status": "passed"
});
formatter.match({
  "location": "gcardSteps.tap_on_time()"
});
formatter.result({
  "duration": 472176949,
  "status": "passed"
});
formatter.match({
  "location": "gcardSteps.tap_on_Save_continue_button()"
});
formatter.result({
  "duration": 298208631,
  "status": "passed"
});
formatter.match({
  "location": "gcardSteps.i_am_in_order_review_page()"
});
formatter.result({
  "duration": 34435356,
  "status": "passed"
});
formatter.match({
  "location": "gcardSteps.i_tap_Place_Order()"
});
formatter.result({
  "duration": 1515376015,
  "status": "passed"
});
formatter.match({
  "location": "gcardSteps.the_gift_card_Order_will_be_placed()"
});
formatter.result({
  "duration": 3493222691,
  "status": "passed"
});
});
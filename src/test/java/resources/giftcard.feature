Feature: Gift card smoke test

  @Smoke @Regression
  Scenario: selecting a gift card
    Given I am on gift card page
    When I tap on Gift Card drop down amount and select  amount
    And I select a card type
    And I tap on Logn +Continue
    Then a Sign In modal should pop up
    When I enter my valid "<email>" and "<password>" in the sign In modal
    Then I should be landed on the Recipient Info section


    @Smoke @Regression

      Scenario: Gift card is sent immediately
      Given I am on the Recipient Info section
      When I enter Recipient name, email, sender's name
      And tap on today's date
      And tap on time
      And tap on Save+continue button
      Then I am in order review page
      And I tap Place Order
      Then the gift card Order will be placed
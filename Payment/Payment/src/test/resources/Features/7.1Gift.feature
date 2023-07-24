 
@tag
Feature: Gift Vouchers
   
 Background:
     Given  User should click on the marketplace
     And User should click on the my voucher field
     
  @tag1
  Scenario: User should print the voucher
    And Select a voucher from the list
    Then Click on the print icon
   

  @tag2
  Scenario: user should buy and print voucher
    Given Click the Buy and email icon
    When  Vouchers are displayed select one
    And Select the email and send the email id
    And Select the amount and send the valid amount value
    Then Click the next button
 
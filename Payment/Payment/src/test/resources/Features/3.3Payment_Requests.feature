  @tag
Feature: Payment Requests
@Test1
  Scenario: Payment Requests
    Given user should click the Payment Requests
    And User Should Click Send New Request
    Then User Should Select Receiver
    And User Should Enter The  Amount
    Then User Should Enter The Expiration Date
    And User Should Select Scheduling
#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Account Information of Cyclos Web Application
    user Should be able to perform Banking Functionality

    

    Background:
    Given: user should launch the cyclos application
    And user should give valid username and password
    And user should click submit
    Then user click the banking menu

   Scenario: User check the account summary
      Then click the Member Account

    Scenario: user check the current balance
      Then check member account balance

    Scenario: user should check the payment history
      Then click on notifications

    Scenario: print and export payments
      And click anyone acount summary
      Then user should click print button

    Scenario: Search history
          And click on the Showfilter button
          And Select the pickfromyourcontactlist on book icon
          And user click anyone from the select a contact
          Then click on the period menu
          And Select any oneoption
          Then select the description enter the content
          And click on the From amount Enter the amount
          Then click the filter option
          And Select anyone Option
          Then click the Direction option
          And Select anyone Option in direction
          And click the orderBy option
          Then Select anyone from orderby

      Scenario: View Payment Details
          When click anyone from the Account Summary
          Then payment Details will be Appear to User

      Scenario: Print Payment Details
          When click anyone from  Account Summary
          Then click on the print button in the transferDetails
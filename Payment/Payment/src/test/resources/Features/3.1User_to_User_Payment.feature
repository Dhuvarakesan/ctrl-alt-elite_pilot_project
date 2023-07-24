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
@tag
Feature: User to User Payment

  @Test1
  Scenario: User to User Payment
    Given user should click the User to User Payment
		And user should fill the to user field
		And User Should Enter The Amount
		And User Should Select Scheduling 
		Then User Should Click Next And Confirm The Payment
		And Close the Browser
  @Test2
  Scenario: User to User Payment(Scheduled Payments)
    Given user should click the User to User Payment
		And user should fill the to user field
		And User Should Enter The Amount
		And User Should Select(Scheduled) Scheduling "Scheduled" 
		Then User Should Click Next And Confirm The Payment
		And Close the Browser
  @Test3
  Scenario: User to User Payment(Monthly installments)
    Given user should click the User to User Payment
		And user should fill the to user field
		And User Should Enter The Amount
		And User Should Select(Monthly installments) Scheduling "Monthly installments","10" 
		Then User Should Click Next And Confirm The Payment For Monthly installments
		And Close the Browser
		
		@Test4
  Scenario: User to User Payment(Recurring payments)
    Given user should click the User to User Payment
		And user should fill the to user field
		And User Should Enter The Amount
		And User Should Select(Recurring payments) Scheduling "Recurring payments","10","12345" 
		Then User Should Click Next And Confirm The Payment 
		And Close the Browser
  
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |

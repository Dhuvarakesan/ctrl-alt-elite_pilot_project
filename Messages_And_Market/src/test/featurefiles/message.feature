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
Feature: Verifying whether rich text message is working as intended

 

Scenario: Sending Rich Text Messages to others
  Given Inside the messaging page
  When Clicking the "New message" button
  And  From the contact list selecting the correct user
  And click the subject "Enter the information in subject"
  And  Select "Serif" font	
  And  Apply Bold style to the message
  And I enter the following rich text message content:
    """
    Your rich text message here.
    This can include formatted text, such as bold, italics, links, etc.
    """
  And  click the "Send" button
  Then the message should be sent successfully

 
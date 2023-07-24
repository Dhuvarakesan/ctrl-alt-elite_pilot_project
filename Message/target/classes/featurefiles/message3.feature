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

Feature: checking history

Scenario: User has to view the message history of inbox,sent and trash


Given open the website "https://demo.cyclos.org/"

When pressing login

And credentials of login is username 'demo' and password "1234"

And press submit

When press messages


 

When press inbox

When press appropriate input from dropdown

And In keyword type'Inbox mail history'

And In user type 'Active Walking'

And press inbox history



 

When press sent

When In sent to dropdown box press user

And In keyword type'Greetings'

And In user click 'Green shop'

And Click the sent message history

 

When press trash 

When In sent to dropdown box press Administration

And In keyword type'banking'

And In user click 'Gesell Accountancy'


Then Click the trash message history

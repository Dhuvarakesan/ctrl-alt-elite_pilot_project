@tag
Feature: Payment to system
@Test1
  Scenario: Payment to system
    Given user should click the Payment to system
 	  And User Should Enter The Amount
		And User Should Select Scheduling 
		Then User Should Click Next And Confirm The Payment
		And Close the Browser
@Test2
  Scenario: Payment to system(Scheduled Payments) 
    Given user should click the Payment to system
		And User Should Enter The Amount
		And User Should Select(Scheduled) Scheduling "Scheduled" 
		Then User Should Click Next And Confirm The Payment
		And Close the Browser
@Test3
  Scenario: Payment to system(Monthly installments) 
    Given user should click the Payment to system
    And User Should Enter The Amount
		And User Should Select(Monthly installments) Scheduling "Monthly installments","10" 
		Then User Should Click Next And Confirm The Payment For Monthly installments
		And Close the Browser
	
  	

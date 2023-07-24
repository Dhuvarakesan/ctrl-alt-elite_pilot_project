
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
  
    
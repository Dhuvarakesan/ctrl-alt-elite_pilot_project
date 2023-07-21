 Feature: Open Marketplace and Gift Voucher
  Background:
    Given lauch the repository
    And Click on the advertisements
    
    @tag1
  Scenario: To list the new advertisement field published recently
    Given  open the dashboard
    And Click on show advertisements
    When Select the order by dropdown
    And  Select the user choice
    
    @tag2
  Scenario: To browse the adverstisement in which category the user needs
    When Click on the keywords search text fields
    And Click enter
    
    @tag3
  Scenario: To Verify the advertisement for User funcitonality with multiple advertisement categories
    When Click on the community
 
    @tag4
  Scenario: To add a customized search for a advertisement field
    When after click on the community field then click on the activity field
    And Click on which activity you want 
    
   

 
 

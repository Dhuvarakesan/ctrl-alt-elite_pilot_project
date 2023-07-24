@tag

Feature: Title of your feature
I want to use this template for my feature file

  Background: 
     And Click on show advertisements
 @tag1
  Scenario: To list the new advertisement field published recently
     Given I want to navigate to the advertisements
     Then OrderBy dropdown enabled click on last published
 @tag2 
  Scenario: To browse the adverstisement in which category the user needs
      Given I want to click on the keywords search field 
      And Click the enter 
      
 @tag3
   Scenario: To Verify the advertisement funcitonality with multiple advertisement categories  
      Given  I want to click on the community field
      Then Community related Advertisements will appear 
   
 @tag4
   Scenario: To add a customized search for a advertisement field
      Given I want to select category in community field
      Then Select which activity user want
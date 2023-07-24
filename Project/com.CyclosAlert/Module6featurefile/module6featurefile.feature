@tag
Feature: Launch the cyclos
  I want to use this template for my feature file

	Background: 
		The launch the cyclos application
		Given click My Advertisement

  @tag1
  Scenario: To launch the cyclos 
    Given click My Advertisement
		When click on add new button and create a new advertisement on top right corner
		And I want to add the name 
		And click on the  category
		When scroll down to the description text area and enter a text
		Then click save

  @tag2
  Scenario: click on the publication period
		Given click the publication period1
		And click on the  publication period2
		
	@tag3
  Scenario: Scroll down to the showmap
		Given I want to click on the showmap
		 
	@tag4
  Scenario: Click on the filters
  	Given Click on the filters
		When Enter the text Food in given keyword textbox
		And click radio button favorites
		And give minimum price
		And give maximum price
			
	@tag5
  Scenario: click the dropdown
  	Given Click on Order By drowpdown
		And Select the user choice
		And click on the keywords	
		And click on the show advertisements
	
	@tag6
  Scenario: click on the community
  	Given click community
  	And click Community related Advertisements will appear
  	And click on the activites
  	Then Click on which activity you want.
  
		
		
  	
		
		
    

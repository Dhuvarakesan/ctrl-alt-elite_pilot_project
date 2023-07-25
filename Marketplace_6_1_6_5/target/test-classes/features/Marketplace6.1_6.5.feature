@tag
Feature: Launch demo cyclos website


	Background: 
	  Launch the site
		Given Press the advertisment

  @tag1
  Scenario: Launch demo cyclos 
    Given Press the files
		When Press new button and create a new advertisement 
		And add the name 
		And Press category
		When go to description type something
		Then press save


		 
	@tag2
  Scenario: Press the filters
  	Given Press the filters button
		When Press the text Food in keyword
		And Press the favorites radio button
			
	

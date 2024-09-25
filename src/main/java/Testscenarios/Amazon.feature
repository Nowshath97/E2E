Feature: Verify the navigaton to different websites

@SmokeTest
Scenario: User is able to sign in
	Given User should navigate to the website
	Then user is able to click on Sign on button

@SmokeTest
Scenario: Verify user is able to select an item from search results
	Given user is on search results page
	Then click on an item to view the item and add to cart
	

Scenario: Verify an item is added to cart
	Given user is on item details page
	Then click on add to cart button

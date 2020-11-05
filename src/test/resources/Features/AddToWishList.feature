Feature: Adding To Wish List
	





Background:
Given User is on Retail WebSite
When User click on Desktop product manue
When User click Mac
And User click on Heart Icon



@AddWishlist
Scenario: Adding to WishList
Given User is on Retail WebSite
When User click on Desktop product manue
When User click Mac
And User should see a heart Icon
And User Hoven Mouse over the Icon it should display 'Add to Wish List'
And User click on Heart Icon
And User Should get a success message 'You must login or create an account to save iMac to your wish list!'


@RemoveWishList
Scenario: Remove from Wish List
When 



@ChangeCurrency
Scenario: Change currency of products prices
Given User is on the Retail WebSite
Then User should see the currency option
Then User click on currency option
And User should see three different currencies '€ Euro' '£ Pound Sterling' '$ US Dollar'



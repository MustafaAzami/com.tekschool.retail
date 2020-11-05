Feature: Remove Product From Shopping Cart

@RemoveProduct
Scenario: Remove product from shopping cart
Given User is on Test Environment website
When User click on Shopping Cart Manue
And User should be able to see the list of added products
And User should see a Red X button or each itme.
And User click on Red X button should see "Are you sure" message
Then User select Yes the item should be removed




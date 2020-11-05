Feature: Shopping Cart Scenarios

@AddProduct
Scenario: Adding product to Shopping Cart
  Given User is on test Envirnoment website
  When User open desktop product menue
  And User click on Mac product
  And User should see an Add To Cart button
  And User click on Add To Cart Button
  Then User get A 'Success: You have added iMac to your shopping cart!'
  
   
  

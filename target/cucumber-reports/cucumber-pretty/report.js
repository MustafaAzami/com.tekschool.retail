$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/AddProductToShoppingCart.feature");
formatter.feature({
  "line": 1,
  "name": "Shopping Cart Scenarios",
  "description": "",
  "id": "shopping-cart-scenarios",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6726100100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Adding product to Shopping Cart",
  "description": "",
  "id": "shopping-cart-scenarios;adding-product-to-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@AddProduct"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on test Envirnoment website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User open desktop product menue",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on Mac product",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should see an Add To Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click on Add To Cart Button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User get A \u0027Success: You have added iMac to your shopping cart!\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "AddProductToShoppingCart.user_is_on_test_Envirnoment_website()"
});
formatter.result({
  "duration": 5840953100,
  "status": "passed"
});
formatter.match({
  "location": "AddProductToShoppingCart.user_open_desktop_product_menue()"
});
formatter.result({
  "duration": 55266800,
  "status": "passed"
});
formatter.match({
  "location": "AddProductToShoppingCart.user_click_on_Mac_product()"
});
formatter.result({
  "duration": 491304500,
  "status": "passed"
});
formatter.match({
  "location": "AddProductToShoppingCart.user_should_see_an_Add_To_Cart_button()"
});
formatter.result({
  "duration": 55198900,
  "status": "passed"
});
formatter.match({
  "location": "AddProductToShoppingCart.user_click_on_Add_To_Cart_Button()"
});
formatter.result({
  "duration": 62483500,
  "status": "passed"
});
formatter.match({
  "location": "AddProductToShoppingCart.user_get_A_Success_You_have_added_iMac_to_your_shopping_cart()"
});
formatter.result({
  "duration": 246237600,
  "status": "passed"
});
formatter.after({
  "duration": 682290700,
  "status": "passed"
});
});
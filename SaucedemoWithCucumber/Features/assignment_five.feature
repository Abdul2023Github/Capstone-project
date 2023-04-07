Feature: Testing fifth assignment

Scenario: Verify the success message after purchasing the items

Given user is on the landing page (Saucedemo) website
When user enters the user name (standerd_user) in username textbox
And user enters the password (secret_sauce) in password textbox
And user clicks on the login page
And user add the first product to the cart
And user ass the Third product to the cart
And user remove the first product from the cart
And user clicks on cart icon on the top right
And user verify the text "Your Cart" in displayed at the top left corner of the page
And user clicks on "continue Shopping " button
And sort the price from high to low 
And user add the most expensive item to the cart
And user clicks on cart icon
And user verify the there are two items in the cart
And user clicks on checkout button
And user enters his first name in first name textbox
And user enters his last name in last name textbox
And user enters the postal code in the postal code textbox
And user cicks on continue button
And user clicks on finish button on the next page
Then user must see the success message "Thank you for your order!" is displayed

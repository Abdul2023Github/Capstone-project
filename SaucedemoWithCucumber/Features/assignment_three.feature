Feature: Testing assignment three

Scenario: Verify the last name error message displayed
Given  User is on Landing page of Saucedemo 
When he enters the username " problem_user" in username textbox
And he enters the password "secret_sauce" in the password textbox
And he clicks in login button
And he will see a list of product
And he add the first product to the cart
And he clicks the cart icon at the top right corner
And he clicks on checkout button
And he enters his first name in the first name textbox
And he enters his last name in the last name textbox
And he enters postal code in postal code textbox
And he clicks in the continue button
Then he must see the last name textbox gets emptied automatically and an error message "Error" is displayed

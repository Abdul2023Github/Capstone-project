Feature: Buy product 

Scenario: Auser should be able to buy product successfully on Saucedemo
Given user is on landing page of Saucedemo
When  he enters the username
And   he enters the passwords
And   he clicks on log in button
And   he add first 2 products to the cart
And   he clicks on the cart icon
And   he clicks on checkout button
And   he enters first name 
And   he enters last name
And   he enters postal code
And   he clicks on continue button
And   he clicks on finish button
Then  he should see the Success message
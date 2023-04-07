Feature: Testing Assignment four 

Scenario: Verify the success ordering message to the user
Given user is on landing page of Saucedemo
When user enters the user name "standerd_user" in username textbox
And user enters the password "secret_sace" in password textbox
And user clicks on the login button
And user sort the items based on price from low to high
And user add first item to the cart
And user Verify the same item which you selected on the previous page has been added to cart
And user clicks on checkout button
And user enters his first name in the first name textbox
And user enters his last name in the last name textbox
And user enters postal code in postal code textbox
And user clicks in the continue button
And user clicks on finish botton on the next page
Then user meust see the sucess message "Thank you for your order!" is disppalyed to the user

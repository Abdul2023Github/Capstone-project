Feature: Testing Assingment Two

Scenario: Verify the error message displayed on the webpage
Given User is on landing page of Saucedemo
When user enters the username "locked_out_user" in the username textbox
And user enters the password "secret_sauce" in the password textbox
And user clicks on login button
Then user must see the error message "Epic sadface: Sorry, this user has been locked out." is displayed on the webpage

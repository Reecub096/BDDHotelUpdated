#Author: rishabh.sinha@capgemini.com
Feature: Registration

 Background: User has already logged in
		and is navigated to hotelBooking page.

Scenario: Successful hotel booking with all valid data
Given    User is on hotel booking page
When    user enters all valid details
Then    navigate to welcome page

Scenario: Blank First Name    
Given    User is on hotel booking page
When    user leaves first name blank
Then    display alert message

Scenario:  Blank Last Name 
Given    User is on hotel booking page
When    user leaves last name blank 
Then    display alert message

Scenario:   Wrong Email
Given    User is on hotel booking page
When    user enters all data
But    user enters wrong email and click button
Then    display alert message

Scenario:  Blank Mobile 
Given    User is on hotel booking page
When    user leaves mobile number empty
Then    display alert message

Scenario: Incorrect Mobile Number Format
Given User is on hotel booking page
When user enters incoorect mobile format
|9949805311|
|9910309269|
||
|123|
|456987|

Then display the alert message


Scenario:   Blank City 
Given    User is on hotel booking page
When    user leaves the city name blank
Then    display the alert message

Scenario:   Blank State
Given    User is on hotel booking page
When    user leaves the state name blank
Then    display the alert message



Scenario:   Blank Card Holder Name
Given    User is on hotel booking page
When    user leaves card holder name empty
Then    display the alert message

Scenario:    Blank Card Number 
Given    User is on hotel booking page
When    user leaves the debit card number blank
Then    display the alert message

Scenario:   Blank CVV
Given    User is on hotel booking page
When    user leaves the cvv blank
Then    display the alert message

Scenario:   Blank Month
Given    User is on hotel booking page
When    user leaves the card expiration month blank
Then    display the alert message

Scenario:    Blank Card Expiry Year
Given    User is on hotel booking page
When     user leaves the card expiration year blank
Then    display the alert message

Scenario:    Successful Booking
Given    User is on hotel booking page
When    user clicks on the navigation button 
Then    redirects to the success page

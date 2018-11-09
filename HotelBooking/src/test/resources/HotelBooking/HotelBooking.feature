#Author: rishabh.sinha@capgemini.com

Feature: Booking

		Background: User has already logged in
		and is navigated to hotelBooking page.


   	Scenario: Check the heading of login page
    Given User is on registration page
    Then Check the heading of the page

    Scenario: Check the first name and last name of user for null value
    Given User is on registration page
    When User doesn't enter the first name And last name 
    And clicks Button
    Then Diplay appropriate message
    
    Scenario: Check valid email entered of user
    Given User is on registration page
    When User enter email address
    But User enters incorrect email format 
    And clicks Button
    Then Display appropriate message
    
    Scenario: Check mobile number entered of user for null value
    Given User is on registration page
    When User doesn't enter the mobile number 
    And clicks Button
    Then Display appropriate message
    
    Scenario: Check valid mobile number entered of user
    Given User is on registration page
    When User enters <mobilenumber>  
    And clicks Button
    |9910309269|
    |85423|
    |7722005480|
    |9810732575|
    |6789451230|
    |2345678910|
    Then Check valid number 
   
    
    Scenario: Check number of guests for null value
    Given User is on registration page
    When User doesn't enter the number of people staying at the hotel 
    And clicks Button
    Then Diplay appropriate message
    
    Scenario: Check the Address of user
    Given User is on registration page
    When User doesn't enter the address in correct format 
    And clicks Button
    Then Diplay appropriate message
    
    Scenario: Check the city of user
    Given User is on registration page
    When User doesn't select any city from the list 
    And clicks Button
    Then Diplay appropriate message
    
    Scenario: Check the State of user
    Given User is on registration page
    When User doesn't select the state 
    And clicks Button
    Then Diplay appropriate message
    
    Scenario: Check card holder Name 
    Given User is on registration page
    When User doesn't enter the card holder name 
    And clicks Button
    Then Diplay appropriate message
    
    Scenario: Check debit card number for null value
    Given User is on registration page
    When User doesn't enter the debit card number
    And clicks Button
    Then Diplay appropriate message
    
    Scenario: Check debit card expiry month for null value
    Given User is on registration page
    When User doesn't enter the debit card expiry month
    And clicks Button
    Then Diplay appropriate message
    
    Scenario: Check debit card expiry year for null value
    Given User is on registration page
    When User doesn't enter the debit card expiry year
    And clicks Button
    Then Diplay appropriate message
    
    Scenario: User entered valid details
    Given User is on registration page
    When User enters all valid details
    And clicks Button
    Then Display Booking completed
    And Go to Success Page
    
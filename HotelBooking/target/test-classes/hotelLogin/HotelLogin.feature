#Author: rishabh.sinha@capgemini.com

Feature: Login

  Scenario: Check the heading of login page
    Given User is on login page
    Then Check the heading of the page
    
  Scenario: Successful Login with valid data
  Description: to login, user needs to enter his valid username, password
   Given User is on login page
   When User enters valid username, valid password
   Then Navigate to hotel booking
   
   Scenario: Prompt user to enter the data when he leaves the login fields empty
   Given User is on login page
   When User doesnot enter either username or password
   And click on Login Button
   Then display appropriate message
   
   Scenario: UnSuccessful login due to incorrect username or password
   Given User is on login page
   When user enters incorrect username or password
   Then display login failed messgae 
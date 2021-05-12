Feature: Login to Leaftaps application

Background:
Given Launch the browser  
And Maximize the browser
And Load the url

Scenario Outline: TC001 postive flow for login
Given Enter the username
And Enter the password
And click on the login button
And click on CRMSFA link
And click on Lead button 
And click on Create Lead button
And enter the company name as <Companyname>
And enter the first name as <Firstname>
And enter the last name as <Lastname>
When click on submit button
Then Verify the Lead is created by checking the Company or First Name 

Examples:
|Companyname|Firstname|Lastname|
|CTS|Roshini|B|
|TCS|Jesintha|Dass|


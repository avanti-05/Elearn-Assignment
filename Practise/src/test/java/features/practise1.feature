Feature: To create and validate a new user created in E-learn application  

Scenario Outline: To Create New User in E-learn and validation and  Compose a new message and validate the message sent 
To verify the registered users FNAME and LNAME  
Given Lauch Epic e-learning application url
When  Navigated to Homepage
Then  Click on Signup
Then 	Enter "<Fname>" First name , "<Lname>" Last name , "<email>" emailID , "<UID>" username , "<PWD>" password , "<cPWD>" confirm password  
Then  Click on Register button
And   Verify the Fname and Lname
Then  Click on Homepage
When  In Homepage
Then  Click on Compose 
And   Enter the "<Recipeint>" mail ID  , "<subject>" subject line  , "<Message>" message
Then  Click on Send button
And   Verify the acknowledgement
Examples:
      | Fname | Lname    | email             | UID   |PWD           |cPWD          |Recipeint   | subject   | Message            |
      | tony  | stark    | ton.john@gmail.com| tm00m |sprintworld@01|sprintworld@01|naveen      |  HNY 2021 | Hi.Happy new year  |
   